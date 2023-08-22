Báo cáo bổ sung cho tuần 5_6
# 1 Rack trong HDFS
   + Một rack trong Hadoop là tập hợp các DataNode (khoảng 30-50 nút dữ liệu) được kết nối bằng cùng một switch mạng. Nếu mạng gặp sự cố, toàn bộ rack sẽ không khả dụng. Một cụm Hadoop lớn được triển khai trong nhiều rack khác nhau.
   + Trong một cụm Hadoop lớn, có nhiều rack. Mỗi rack bao gồm các DataNode. Giao tiếp giữa các DataNode trên cùng một rack hiệu quả hơn so với giao tiếp giữa các DataNode ở các rack khác nhau.
   + Để giảm lưu lượng mạng trong quá trình đọc/ghi tệp tin, NameNode chọn DataNode gần nhất để phục vụ yêu cầu đọc/ghi của client. NameNode duy trì thông tin về rack của mỗi DataNode để đạt được thông tin rack này.
# 2 Block report 
 + Trong Hadoop, dữ liệu được lưu trữ dưới dạng các khối. Báo cáo khối là một báo cáo chứa thông tin về các khối dữ liệu được lưu trữ trên DataNode.
 + Mỗi DataNode trong một cụm Hadoop định kỳ gửi một báo cáo khối đến NameNode, chứa thông tin như ID khối, độ dài của khối và vị trí của khối
# 3 Tại sao kích thước một block là 128MB ?
Không có kích thước block phù hợp với mọi dữ liệu mà chỉ có tính chất tương đối. Có vài nguyên nhân có thể kể ra như sau:
  + Để giảm chi phí tìm kiếm: Với các khối có kích thước lớn, thời gian để chuyển dữ liệu từ đĩa có thể lâu hơn so với thời gian để bắt đầu khối. Điều này dẫn đến việc chuyển nhiều khối với tốc độ chuyển đĩa.
  + Nếu khối nhỏ, sẽ có quá nhiều khối trong Hadoop HDFS và do đó có quá nhiều dữ liệu siêu dữ liệu để lưu trữ. Quản lý một số lượng khối và siêu dữ liệu lớn như vậy sẽ tạo ra công thêm và gây ra giao thông trên mạng.  
# 4 Quá trình ghi khi client ghi đệm chưa đủ một block
Khi quá trình ghi đệm không đủ một khối (block) trong HDFS, HDFS lưu trữ dữ liệu như sau:
 + Dữ liệu được ghi tạm vào một vùng đệm (buffer) trong client. Khi có đủ dữ liệu để tạo thành một khối theo kích thước đã định, dữ liệu sẽ được ghi từ vùng đệm này vào HDFS.
 + Vùng đệm này sẽ được chia thành các gói tin nhỏ hơn gọi là gói tin (packets), và mỗi gói tin sẽ được gắn kèm mã định danh (sequence number) để đảm bảo tính toàn vẹn và thứ tự của dữ liệu.
 + Các gói tin được gửi từ client đến DataNode. DataNode sẽ nhận các gói tin và lưu trữ chúng trong bộ nhớ tạm (temporary storage).
 + Khi có đủ gói tin để tạo thành một khối, DataNode sẽ ghi khối đó vào ổ đĩa lưu trữ của nó. Sau đó, khối này được coi là hoàn chỉnh và có thể được truy cập và xử lý bởi các ứng dụng và người dùng khác.
Quá trình này đảm bảo tính phân tán và độ tin cậy của dữ liệu trong HDFS, giúp đảm bảo dữ liệu không bị mất hoặc bị hỏng trong quá trình ghi đệm.  

# 5 Khi đang ghi dữ liệu mà DataNode bị lỗi
Trong quá trình ghi dữ liệu vào DataNode, nếu DataNode gặp sự cố, thì các hành động sau đây sẽ xảy ra, mà không ảnh hưởng đến client đang ghi dữ liệu.

 + Pipeline (đường ống ghi) được đóng, các gói tin trong hàng đợi ack được thêm vào phần đầu của hàng đợi dữ liệu, làm cho các DataNode ở dưới luồng dữ liệu gặp sự cố không bỏ lỡ bất kỳ gói tin nào.
 + Sau đó, khối hiện tại trên DataNode hoạt động được định danh mới. Id này được thông báo cho NameNode để sau này, nếu DataNode gặp sự cố khắc phục được, khối dữ liệu không hoàn chỉnh trên DataNode gặp sự cố sẽ được xóa.
 + DataNode gặp sự cố sẽ được loại khỏi pipeline, và một pipeline mới được tạo từ hai DataNode hoạt động được. Dữ liệu còn lại của khối được ghi vào các DataNode hoạt động được, được thêm vào pipeline.
 + NameNode nhận thấy rằng khối dữ liệu đang thiếu sao chép, và nó sắp xếp để tạo thêm một bản sao trên DataNode khác. Các khối dữ liệu khác tiếp theo sẽ được xử lý như thông thường.  
# 6 Khi nào việc ghi trong hdfs được coi là thành công?
Việc ghi dữ liệu trong HDFS được coi là thành công khi các bước sau đã được hoàn thành:

 + Dữ liệu đã được chia thành các phần và mã hóa theo cơ chế khối (block).
 + Mỗi phần dữ liệu đã được sao chép (replication) trên các nút (node) trong hệ thống HDFS.
 + Các bản sao (replicas) của dữ liệu đã được xác nhận và ghi thành công trên ít nhất một số nút.
Khi cả ba bước trên đã được hoàn thành, việc ghi dữ liệu trong HDFS có thể được coi là thành công.  

Các tham số liên quan đến quá trình replication trong HDFS bao gồm:

 + dfs.replication: Đây là tham số quan trọng nhất để cấu hình số lượng bản sao (replicas) của dữ liệu. Nó xác định số lượng bản sao sẽ được tạo ra cho mỗi phần dữ liệu. Giá trị mặc định là 3.
 + dfs.namenode.replication.min: Đây là tham số quy định số lượng bản sao tối thiểu phải lưu trữ trên các nút (node). Nếu số lượng bản sao thực tế ít hơn giá trị này, HDFS sẽ cho rằng việc sao chép dữ liệu không thành công và ghi lại việc này. Giá trị mặc định là 1.
 + dfs.namenode.replication.pending.timeout.sec: Đây là tham số quy định khoảng thời gian tối đa để đợi việc sao chép bản sao dữ liệu. Nếu thời gian đợi vượt quá giá trị này, HDFS sẽ coi rằng việc sao chép không thành công và ghi lại việc này. Giá trị mặc định là 10.

Các tham số này có thể được tùy chỉnh trong tệp cấu hình hệ thống của HDFS để phù hợp với yêu cầu và môi trường cụ thể.  
# 7 Quá trình Suffling và Sort
Shuffling trong MapReduce:
 + Quá trình chuyển dữ liệu từ các mapper đến reducer được gọi là shuffling. Đây là quá trình hệ thống thực hiện sắp xếp và chuyển đổi đầu ra của mapper thành đầu vào cho reducer. Việc shuffling trong MapReduce là quan trọng cho reducers vì nếu không có shuffling, reducers sẽ không có đầu vào. Shuffling có thể bắt đầu ngay cả trước khi giai đoạn map kết thúc, giúp tiết kiệm thời gian và hoàn thành công việc nhanh hơn.

Sort trong MapReduce:
 + Khóa được tạo ra bởi mapper được tự động sắp xếp bởi MapReduce Framework. Trước khi bắt đầu reducer, tất cả các cặp key-value trung gian trong MapReduce được sắp xếp theo khóa và không phải theo giá trị. Các giá trị chuyển đến từng reducer không được sắp xếp và có thể ở bất kỳ thứ tự nào. Việc sắp xếp trong Hadoop giúp reducer dễ dàng phân biệt khi nào bắt đầu một nhiệm vụ mới, giúp tiết kiệm thời gian. Mỗi nhiệm vụ reducer nhận cặp key-value làm đầu vào và tạo ra cặp key-value làm đầu ra.

Sắp xếp phụ trong MapReduce:
 + Nếu muốn sắp xếp các giá trị của reducer, kỹ thuật sắp xếp phụ được sử dụng để cho phép sắp xếp các giá trị (tăng dần hoặc giảm dần) truyền đến mỗi reducer.  
# 8 Khi có quá nhiều dữ liệu cùng key lớn hơn kích thước phân vùng phải làm sao ?
Khi có số lượng khóa ít nhưng lượng dữ liệu lại có sự chênh lệch lớn, có thể áp dụng các biện pháp sau:
 
 + Chia nhỏ các khóa lớn thành các khóa nhỏ hơn. Điều này giúp tăng sự phân tán dữ liệu và tránh tình trạng lệch lạc. Sau đó sử dụng Perfect Balance để phân bổ công việc đồng đều.
 + Sử dụng bước trung gian trước khi thực hiện MapReduce để phân tán dữ liệu. Trong bước này có thể sử dụng các thuật toán chia dữ liệu theo một quy tắc ngẫu nhiên để tạo ra nhiều khóa hơn. Sau đó sử dụng Perfect Balance để phân bổ công việc.
 + Sử dụng Perfect Balance với phân vùng tay: Nếu các biện pháp trên không phù hợp, có thể sử dụng Perfect Balance với phân vùng tay. Với yêu cầu bạn xác định cách phân vùng dữ liệu và chỉ định các mapper và reducer cho mỗi phân vùng.

Các biện pháp trên nhằm mục đích tối ưu hóa công việc MapReduce và đảm bảo công việc được phân bổ và xử lý một cách hiệu quả, ngay cả khi số lượng khóa ít và lượng dữ liệu lệch không đồng nhất.  
# 9 Trạng thái của Active RM lưu ở đâu để đồng bộ standby RM 
 + Để đồng bộ giữa ResourceManager (RM) chế độ chờ và RM hoạt động trong kiến trúc YARN HA (High Availability), trạng thái của RM hoạt động được lưu trữ ở một nơi được gọi là ZooKeeper. ZooKeeper là một dịch vụ phân tán và đồng bộ hóa dữ liệu, được sử dụng để lưu trữ thông tin về trạng thái và quản lý cụm dịch vụ.

 + Khi RM hoạt động, nó sẽ đồng bộ trạng thái của mình tới ZooKeeper. RM chờ tiếp tục kiểm tra trạng thái RM hoạt động từ ZooKeeper để biết liệu nó có thể tiếp tục hoạt động hay không.

+ Việc lưu trữ trạng thái RM hoạt động trong ZooKeeper đảm bảo rằng các nút RM sẽ không bị mất đồng bộ và có thể chuyển đổi một cách đáng tin cậy khi cần thiết trong hệ thống YARN HA.  
# 10 Ưu nhược điểm của execution cluster & client mode
Ưu điểm của chế độ thực thi cụm (execution cluster mode) trong Apache Spark và chế độ khách hàng (client mode) là như sau:
Chế độ thực thi cụm:
- Ưu điểm: 
   + Hiệu suất cao: Chế độ thực thi cụm sử dụng tài nguyên của cụm Spark cho việc thực thi. Điều này cho phép tận dụng nguồn lực mạnh mẽ của cụm để thực hiện các công việc tính toán song song và đạt hiệu suất cao.
   + Quản lý tài nguyên: Chế độ thực thi cụm giúp phân phối các tác vụ tính toán trên các nút trong cụm, giúp cân bằng tải và tận dụng tối đa tài nguyên có sẵn trên cụm.
   + Khả năng chịu lỗi: Chế độ này cung cấp khả năng khôi phục từ lỗi tự động. Khi một nút thất bại, Spark sẽ tự động chuyển tiếp công việc đến các nút khác trong cụm.

- Nhược điểm:
   + Không phù hợp với các ứng dụng yêu cầu tương tác thời gian thực
   + Phụ thuộc vào tài nguyên cụm: Sử dụng chế độ thực thi cụm yêu cầu phụ thuộc vào tài nguyên cụm có sẵn để thực hiện và không phù hợp cho các ứng dụng nhỏ hoặc không yêu cầu tài nguyên lớn.

Chế độ Client:
- Ưu điểm:
   + Dễ dàng triển khai và sử dụng: Chế độ client không yêu cầu môi trường cụm cấu hình và có thể chạy trên một máy tính đơn lẻ. Điều này làm cho việc triển khai và sử dụng đơn giản và dễ dàng hơn.
   + Tận dụng tài nguyên của máy tính cá nhân: Chế độ khách hàng cho phép tận dụng tài nguyên của máy tính cá nhân, cho phép thực hiện các công việc tính toán nhỏ hoặc trên một tập dữ liệu nhỏ.
   + Hiểu quả khi chạy các ứng dụng có sự tương tác với người dùng

- Nhược điểm:
   + Hiệu suất thấp: Chế độ khách hàng có thể có hiệu suất thấp hơn so với chế độ thực thi cụm do sử dụng tài nguyên hạn chế của máy tính cá nhân.
   + Yêu cầu tài nguyên chủ động từ người dùng: trong chế độ này, người dùng phải tổ chức và quản lý tài nguyên của mình một cách chủ động, như tài nguyên CPU, bộ nhớ và lưu trữ để đảm bảo việc tính toán được thực hiện thành công. 
# 11 Phép tính chỉ có thể thực hiện trên dataset mà không thể trên dataframe
Dưới đây là danh sách các biến đổi (transformations) và hành động (actions) phổ biến mà chỉ dataset có thể thực hiện và dataframe không thể thực hiện:

Biến đổi:
 + as[String, Int, Double]: Chuyển đổi kiểu dữ liệu của các cột thành String, Int hoặc Double.
 + coalesce(numPartitions): Kết hợp các phân vùng thành một phân vùng duy nhất.
 + repartition(numPartitions, col1, col2, ...): Chia lại dữ liệu vào numPartitions và sắp xếp dữ liệu theo cách nhất định dựa trên cột chỉ định.
 + sortWithinPartitions(col1, col2, ...): Sắp xếp các phân vùng dữ liệu dựa trên cột chỉ định trong mỗi phân vùng.

Hành động:
 + countByKey(): Đếm số lượng mục cho mỗi khóa.
 + foreach(func): Thực thi một hàm cho mỗi mục trong dataset.
 + reduceByKey(func): Kết hợp các giá trị dựa trên cùng một khóa bằng cách sử dụng hàm chỉ định.

 Nguyên nhân là vì dataset và dataframe có thiết kế và cách hoạt động khác nhau.

 + Tính cấu trúc dữ liệu: DataFrame được thiết kế để làm việc với dữ liệu có cấu trúc, trong khi dataset cho phép xử lý dữ liệu có cấu trúc và không cấu trúc. Do đó, dataset hỗ trợ kiểm tra tĩnh và xác định các kiểu dữ liệu tại thời điểm biên dịch, giúp phát hiện các lỗi tĩnh mà dataframe không thể xử lý được.
 + Hiệu suất: DataFrame được tối ưu cho các hoạt động trên cấu trúc dữ liệu, vì vậy nó có hiệu suất cao trong các phép tính trên từng cột riêng lẻ. Tuy nhiên, dataset có tính năng kiểm tra tại thời điểm biên dịch, nhưng điều này có thể làm giảm hiệu suất so với dataframe. Tuy nhiên, việc kiểm tra kiểu dữ liệu tại thời điểm biên dịch giúp tránh các lỗi dữ liệu trong quá trình thực thi.
 + Linh hoạt: DataFrame cung cấp giao diện dễ sử dụng và đơn giản hơn cho việc truy vấn và xử lý dữ liệu. Nó được sử dụng rộng rãi trong các tác vụ phân tích dữ liệu và xử lý dữ liệu quy mô lớn. Ngược lại, dataset cung cấp tính năng linh hoạt hơn để tạo và xử lý dữ liệu, nhưng với tính phức tạp và khả năng kiểm tra tĩnh hơn, nó thích hợp hơn cho các tác vụ phân tích dữ liệu phức tạp và yêu cầu cao hơn về loại dữ liệu.
# 12 Giao thức Zab
Zookeeper Atomic Broadcast Protocol (ZAB) là một giao thức được sử dụng trong Zookeeper để đảm bảo sao chép dữ liệu theo đúng thứ tự và thực hiện việc bầu cử và khôi phục các node bị lỗi. Giao thức này có nhiệm vụ
 + Quản lý thứ tự các giao dịch,
 + Đảm bảo giao dịch được sao chép đúng như đã thực hiện
 + Duy trì tổng thể của các giao dịch.

ZAB được áp dụng trong Zookeeper qua một giao thức hai giai đoạn, cho phép sao chép các giao dịch trong khi đảm bảo các nguyên tắc thiết kế như đã đề cập ở trên. 

 + Node leader tạo ra các giao dịch và gán số thứ tự cho chúng sau khi nhận yêu cầu thay đổi trạng thái từ client. Sau đó, nó gửi các giao dịch này đến tất cả các node follower và chờ đợi các phản hồi từ chúng.

 + Node leader gửi các giao dịch đã có trong lịch sử của mình đến tất cả các node follower và nếu các node theo dõi nhận thấy rằng lịch sử của chúng đang kém hơn so với node leader, chúng bắt đầu gửi thông báo xác nhận cho các giao dịch mới. Khi nhận được các ACK từ một quần thể, các tin nhắn xác nhận được gửi đi. Đây là thời điểm mà leader tiềm năng thực sự trở thành leader mới của cụm.  
