Báo cáo bổ sung cho tuần 5_6
# Q1 Rack trong HDFS
   + Một rack trong Hadoop là tập hợp các DataNode (khoảng 30-50 nút dữ liệu) được kết nối bằng cùng một switch mạng. Nếu mạng gặp sự cố, toàn bộ rack sẽ không khả dụng. Một cụm Hadoop lớn được triển khai trong nhiều rack khác nhau.
   + Trong một cụm Hadoop lớn, có nhiều rack. Mỗi rack bao gồm các DataNode. Giao tiếp giữa các DataNode trên cùng một rack hiệu quả hơn so với giao tiếp giữa các DataNode ở các rack khác nhau.
   + Để giảm lưu lượng mạng trong quá trình đọc/ghi tệp tin, NameNode chọn DataNode gần nhất để phục vụ yêu cầu đọc/ghi của client. NameNode duy trì thông tin về rack của mỗi DataNode để đạt được thông tin rack này.
# Q2 Block report 
 + Trong Hadoop, dữ liệu được lưu trữ dưới dạng các khối. Báo cáo khối là một báo cáo chứa thông tin về các khối dữ liệu được lưu trữ trên DataNode.
 + Mỗi DataNode trong một cụm Hadoop định kỳ gửi một báo cáo khối đến NameNode, chứa thông tin như ID khối, độ dài của khối và vị trí của khối
# Q3 Tại sao kích thước một block là 128MB ?
Không có kích thước block phù hợp với mọi dữ liệu mà chỉ có tính chất tương đối. Có vài nguyên nhân có thể kể ra như sau:
  + Để giảm chi phí tìm kiếm: Với các khối có kích thước lớn, thời gian để chuyển dữ liệu từ đĩa có thể lâu hơn so với thời gian để bắt đầu khối. Điều này dẫn đến việc chuyển nhiều khối với tốc độ chuyển đĩa.
  + Nếu khối nhỏ, sẽ có quá nhiều khối trong Hadoop HDFS và do đó có quá nhiều dữ liệu siêu dữ liệu để lưu trữ. Quản lý một số lượng khối và siêu dữ liệu lớn như vậy sẽ tạo ra công thêm và gây ra giao thông trên mạng.  
# Q4 Quá trình ghi khi client ghi đệm chưa đủ một block
Khi quá trình ghi đệm không đủ một khối (block) trong HDFS, HDFS lưu trữ dữ liệu như sau:
 + Dữ liệu được ghi tạm vào một vùng đệm (buffer) trong client. Khi có đủ dữ liệu để tạo thành một khối theo kích thước đã định, dữ liệu sẽ được ghi từ vùng đệm này vào HDFS.
 + Vùng đệm này sẽ được chia thành các gói tin nhỏ hơn gọi là gói tin (packets), và mỗi gói tin sẽ được gắn kèm mã định danh (sequence number) để đảm bảo tính toàn vẹn và thứ tự của dữ liệu.
 + Các gói tin được gửi từ client đến DataNode. DataNode sẽ nhận các gói tin và lưu trữ chúng trong bộ nhớ tạm (temporary storage).
 + Khi có đủ gói tin để tạo thành một khối, DataNode sẽ ghi khối đó vào ổ đĩa lưu trữ của nó. Sau đó, khối này được coi là hoàn chỉnh và có thể được truy cập và xử lý bởi các ứng dụng và người dùng khác.
Quá trình này đảm bảo tính phân tán và độ tin cậy của dữ liệu trong HDFS, giúp đảm bảo dữ liệu không bị mất hoặc bị hỏng trong quá trình ghi đệm.  

# Q5 Khi đang ghi dữ liệu mà DataNode bị lỗi
Trong quá trình ghi dữ liệu vào DataNode, nếu DataNode gặp sự cố, thì các hành động sau đây sẽ xảy ra, mà không ảnh hưởng đến client đang ghi dữ liệu.

 + Pipeline (đường ống ghi) được đóng, các gói tin trong hàng đợi ack được thêm vào phần đầu của hàng đợi dữ liệu, làm cho các DataNode ở dưới luồng dữ liệu gặp sự cố không bỏ lỡ bất kỳ gói tin nào.
 + Sau đó, khối hiện tại trên DataNode hoạt động được định danh mới. Id này được thông báo cho NameNode để sau này, nếu DataNode gặp sự cố khắc phục được, khối dữ liệu không hoàn chỉnh trên DataNode gặp sự cố sẽ được xóa.
 + DataNode gặp sự cố sẽ được loại khỏi pipeline, và một pipeline mới được tạo từ hai DataNode hoạt động được. Dữ liệu còn lại của khối được ghi vào các DataNode hoạt động được, được thêm vào pipeline.
 + NameNode nhận thấy rằng khối dữ liệu đang thiếu sao chép, và nó sắp xếp để tạo thêm một bản sao trên DataNode khác. Các khối dữ liệu khác tiếp theo sẽ được xử lý như thông thường.  
# Q6 Khi nào việc ghi trong hdfs được coi là thành công?
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
# Q7 Quá trình Suffling và Sort
Shuffling trong MapReduce:
 + Quá trình chuyển dữ liệu từ các mapper đến reducer được gọi là shuffling. Đây là quá trình hệ thống thực hiện sắp xếp và chuyển đổi đầu ra của mapper thành đầu vào cho reducer. Việc shuffling trong MapReduce là quan trọng cho reducers vì nếu không có shuffling, reducers sẽ không có đầu vào. Shuffling có thể bắt đầu ngay cả trước khi giai đoạn map kết thúc, giúp tiết kiệm thời gian và hoàn thành công việc nhanh hơn.

Sort trong MapReduce:
 + Khóa được tạo ra bởi mapper được tự động sắp xếp bởi MapReduce Framework. Trước khi bắt đầu reducer, tất cả các cặp key-value trung gian trong MapReduce được sắp xếp theo khóa và không phải theo giá trị. Các giá trị chuyển đến từng reducer không được sắp xếp và có thể ở bất kỳ thứ tự nào. Việc sắp xếp trong Hadoop giúp reducer dễ dàng phân biệt khi nào bắt đầu một nhiệm vụ mới, giúp tiết kiệm thời gian. Mỗi nhiệm vụ reducer nhận cặp key-value làm đầu vào và tạo ra cặp key-value làm đầu ra.

Sắp xếp phụ trong MapReduce:
 + Nếu muốn sắp xếp các giá trị của reducer, kỹ thuật sắp xếp phụ được sử dụng để cho phép sắp xếp các giá trị (tăng dần hoặc giảm dần) truyền đến mỗi reducer.  
# Q8 Khi có quá nhiều dữ liệu cùng key lớn hơn kích thước phân vùng phải làm sao ?

# Q9 Active RM đồng bộ standby RM ntn

# Q10 Ưu nhược điểm của execution cluster & client mode

# Q11 Phép tính chỉ có thể thực hiện trên dataset mà k thể trên dataframe Transformation: narrow, wide (suffles-trao đổi giữa các partition)

# Q12 Giao thức Zab là  gì
