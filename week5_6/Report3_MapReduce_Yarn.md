# 4. MapReduce
## 4.1 Khái niệm
MapReduce là khung xử lý dữ liệu mặc định của Hadoop.

MapReduce là một mô hình lập trình cho việc xử lý dữ liệu.

Đó không phải là một ngôn ngữ, mà là một kiểu xử lý dữ liệu được tạo ra bởi Google.

• MapReduce Job hoặc "chương trình đầy đủ" là một thực thi của Máy ánh xạ (Mapper) và Máy giảm (Reducer) trên một tập dữ liệu. Đây là một quá trình thực thi của 2 lớp xử lý, tức là mapper và reducer. Một MapReduce job là công việc mà khách hàng muốn thực hiện. Nó bao gồm dữ liệu đầu vào, Chương trình MapReduce và thông tin cấu hình. Vì vậy, khách hàng cần gửi dữ liệu đầu vào, viết chương trình MapReduce và cấu hình thông 

• Task in MapReduce là một quá trình thực thi của Mapper hoặc Reducer trên một phần dữ liệu. Nó cũng được gọi là Task-In-Progress (TIP). Điều này có nghĩa là việc xử lý dữ liệu đang được thực hiện trên mapper hoặc reducer.

• Task Attempt là một phiên bản cụ thể của việc thực hiện một nhiệm vụ trên một nút. Có khả năng rằng bất kỳ máy nào cũng có thể bị sự cố. Ví dụ, trong quá trình xử lý dữ liệu, nếu một nút nào đó bị sự cố, framework sẽ lên lịch lại nhiệm vụ cho một nút khác. Việc lên lịch lại nhiệm vụ này không thể vô tận. Có một giới hạn tối đa để điều đó cũng. Giá trị mặc định của task attempt là 4. Nếu một nhiệm vụ (mapper hoặc reducer) thất bại 4 lần, thì công việc được coi là công việc thất bại. Đối với công việc ưu tiên cao hoặc công việc lớn, giá trị của task attempt cũng có thể được tăng lên.  
## 4.2 Đặc điểm
Ưu điểm của MapReduce:

• Đơn giản

• Linh hoạt

• Khả năng mở rộng.

MapReduce chia công việc thành nhiều tác vụ độc lập và lên lịch thực hiện chúng trên các nút của cụm.

• Mỗi tác vụ thực hiện công việc độc lập với nhau vì lý do mở rộng quy mô.

• Áp lực giao tiếp để luôn đồng bộ dữ liệu trên các nút sẽ ngăn mô hình hoạt động đáng tin cậy và hiệu quả ở quy mô lớn.
## 4.3 Hoạt động
Trong một cụm MapReduce, dữ liệu thường được quản lý bằng các hệ thống tập tin phân tán.

Người lập trình trong MapReduce phải chỉ định hai hàm, hàm "map" và hàm "reduce", để thực hiện vai trò của Mapper và Reducer trong chương trình MapReduce.

• Trong MapReduce, các phần tử dữ liệu luôn được cấu trúc dưới dạng cặp key-value (ví dụ: (K, V)).

• Các hàm map và reduce nhận và xuất ra các cặp (K, V).

Một tập con khác nhau của không gian khóa trung gian được gán cho mỗi Reducer.

Những tập con này được gọi là các phân vùng (partitions).

MapReduce gồm 2 pha pha Map và pha Reduce
### 4.3.1 Pha Map
Hadoop chia công việc thành nhiều tác vụ "map" riêng lẻ.

• Số lượng tác vụ "map" được xác định bởi lượng dữ liệu đầu vào.

• Mỗi tác vụ "map" nhận một phần của dữ liệu đầu vào tổng thể để xử lý.

• Các tác vụ "map" xử lý từng bản ghi đầu vào một lúc.

• Đối với mỗi bản ghi đầu vào, chúng xuất ra không hoặc nhiều bản ghi đầu ra.

Trong trường hợp này, tác vụ "map" đơn giản chỉ phân tích bản ghi đầu vào,

• Sau đó, xuất ra các trường tên và giá cho mỗi bản ghi đó làm đầu ra.
 
 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/25cb8787-2524-41db-81da-e0f4bc48a44a)

Hadoop tự động sắp xếp và hợp nhất đầu ra từ tất cả các tác vụ "map".

• Quá trình trung gian này được gọi là shuffle và sort.

• Kết quả được cung cấp cho các tác vụ "reduce".

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/d4a40cd3-0226-4fa4-8595-45fc9a99541d)

### 4.3.2 Pha Reduce
Đầu vào của tác vụ "reduce" đến từ quá trình shuffle và sort.

• Tương tự như với tác vụ "map", hàm "reduce" nhận một bản ghi mỗi lần.

• Một tác vụ "reduce" cụ thể nhận tất cả các bản ghi cho một khóa cụ thể.

• Đối với mỗi bản ghi đầu vào, tác vụ "reduce" có thể xuất ra không hoặc nhiều bản ghi đầu ra.

Hàm "reduce" của chúng ta đơn giản là tính tổng tổng số tiền của mỗi người,

• Và xuất ra tên nhân viên (là khóa) và tổng số tiền (là giá trị) làm đầu ra.

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/394bcbc1-a1bb-4f14-a8ff-9edbce63e429)

### 4.3.3 Luồng dữ liệu trong MapReduce
 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/c2532475-de23-46da-a912-b08a555880fc)

Luồng dữ liệu trong MapReduce gồm hai giai đoạn chính: map và reduce.

Trong giai đoạn map, dữ liệu đầu vào được chia nhỏ thành các khối dữ liệu và gửi cho các mapper. Mỗi mapper xử lý một khối dữ liệu và tạo ra đầu ra trung gian. Đầu ra trung gian này được ghi vào đĩa cục bộ của nút mapper. Khi một mapper hoàn thành, dữ liệu đầu ra trung gian được chuyển đến các nút reducer để tiếp tục xử lý.

Giai đoạn reduce là giai đoạn thứ hai trong quá trình xử lý. Tại giai đoạn này, dữ liệu đầu ra trung gian từ các mapper được gửi đến reducer. Các reducer nhận đầu vào từ tất cả các mapper và thực hiện các phép tính như tổng hợp, tính tổng, hay tính toán dữ liệu theo logic kinh doanh tùy chỉnh. Kết quả cuối cùng từ reducer được ghi vào HDFS.  
### 4.3.4 Tính cục bộ dữ liệu trong MapReduce
• 'Di chuyển tính toán gần dữ liệu thay vì dữ liệu đến tính toán'. Một tính toán được yêu cầu bởi ứng dụng sẽ hiệu quả hơn nếu nó được thực hiện gần dữ liệu mà nó hoạt động. Điều này đặc biệt đúng khi kích thước dữ liệu rất lớn. Điều này giảm tắc nghẽn mạng và tăng hiệu suất của hệ thống. Do đó, HDFS cung cấp các giao diện cho ứng dụng di chuyển gần với nơi dữ liệu hiện có.

• Vì Hadoop làm việc trên một khối lượng dữ liệu lớn và không khả thi để di chuyển khối lượng đó qua mạng. Do đó, nó đã nhận ra nguyên tắc sáng tạo nhất là di chuyển thuật toán tới dữ liệu chứ không phải di chuyển dữ liệu tới thuật toán. Điều này được gọi là tính cục bộ của dữ liệu."  
# 5. Yarn
## 5.1 Khái niệm
YARN (Yet Another Resource Negotiator) là một thành phần quan trọng trong hệ sinh thái Hadoop, quản lý và phân phối tài nguyên hệ thống như bộ nhớ, CPU và lưu lượng mạng. 
## 5.2 Thành phần
YARN gồm hai thành phần chính:

1. ResourceManager (RM): Đây là thành phần trung tâm của YARN, quản lý tài nguyên của toàn bộ cụm và lập kế hoạch cho quá trình phân phối công việc, căn cứ vào yêu cầu từ các ứng dụng. ResourceManger có hai thành phần quan trọng đó là Scheduler và ApplicationManager.

•	Scheduler có trách nhiệm phân bổ tài nguyên cho các ứng dụng khác nhau. Đây là Scheduler thuần túy vì nó không thực hiện theo dõi trạng thái cho ứng dụng. Nó cũng không sắp xếp lại các tác vụ bị lỗi do lỗi phần cứng hoặc phần mềm. Bộ lập lịch phân bổ các tài nguyên dựa trên các yêu cầu của ứng dụng. 

•	ApplicationManager có chức năng sau:

o	Chấp nhận nộp công việc.	

o	Đàm phán container đầu tiên để thực thi ApplicationMaster. Một nơi chứa kết hợp các yếu tố như CPU, bộ nhớ, đĩa và mạng.

o	Khởi động lại container ApplicationMaster khi không thành công.

2. NodeManager (NM): Là thành phần chạy trên mỗi nút trong cụm, NodeManager quản lý tài nguyên cục bộ trên nút đó. Nó liên tục giao tiếp với ResourceManager để báo cáo trạng thái và yêu cầu tài nguyên cần thiết để thực hiện ứng dụng. 

ApplicationMaster (AM): Đây là một thành phần ứng dụng đặc biệt, nằm trong quyền điều hành của ứng dụng, AM quyết định việc yêu cầu và quản lý các tài nguyên cụm cho ứng dụng. Mỗi ứng dụng chạy trên YARN có một AM riêng.

## 5.3 Chức năng
YARN mở rộng khả năng của Hadoop bằng cách cho phép chạy nhiều ứng dụng khác nhau trên cùng một hệ thống, không chỉ là MapReduce. Nó cũng chịu trách nhiệm lập lịch và quản lý công việc cho mỗi ứng dụng trong cụm. 

Nói một cách khác, YARN chính là nền tảng cho phép Hadoop chuyển từ một hệ thống xử lý batch không gian đơn lẻ dựa trên MapReduce tới một hệ thống xử lý dữ liệu đa mô hình hoàn chỉnh có khả năng thực hiện nhiều loại xử lý dữ liệu cùng một lúc.
## 5.4 Sơ đồ hoạt động của một ứng dụng trên Yarn
 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/b6081228-8780-4a3c-a18e-b742dd012826)

Quá trình 1 ứng dụng chạy trên YARN được mô tả bằng sơ đồ trên qua các bước sau:

•	Client giao 1 task cho Resource Manager

•	Resource Manager tính toán tài nguyên cần thiết theo yêu cầu của ứng dụng và tạo 1 App Master (App Mstr). Application Master được chuyển đến chạy 1 một node tính toán. Application Master sẽ liên lạc với các NodeManager ở các node khác để ra yêu cầu công việc cho node này.

•	Node Manager nhận yêu cầu và chạy các task trên container

•	Các thông tin trạng thái thay vì được gửi đến JobTracker sẽ được gửi đến App Master.
## 5.5 Resource Manager Restart
Resource Manager (RM) là trung tâm quản lý tài nguyên và lập lịch các ứng dụng trên YARN. Tuy nhiên, RM có thể trở thành điểm yếu duy nhất trong cụm YARN. Có hai phương pháp để khởi động lại RM:

•	Khởi động lại RM không bảo vệ công việc: Nâng cấp RM để lưu trữ trạng thái ứng dụng và khởi động lại các ứng dụng đã chạy trước đó. Không cần gửi lại ứng dụng. Node Manager và khách hàng của RM tiếp tục kiểm tra RM cho đến khi nó khởi động lại.

•	Khởi động lại RM bảo vệ công việc: Tái tạo trạng thái chạy của RM bằng cách sử dụng trạng thái container từ Node Manager và yêu cầu container từ Application Master. Ứng dụng đang chạy không bị dừng và không có dữ liệu bị mất. Node Manager không tắt các container và gửi trạng thái container cho RM khi đăng ký lại.
## 5.6 Yarn Resource Manager trong kiến trúc High availability
Trước phiên bản Hadoop v2.4, RM là một điểm trung tâm duy nhất và có thể gây ra sự cố nếu gặp vấn đề. Tính sẵn sàng cao được thực hiện thông qua kiến trúc Active/Standby, trong đó một RM là hoạt động và RM khác là ở chế độ đựng chờ, sẵn sàng tiếp quản khi có sự cố xảy ra với RM hoạt động.

Chuyển đổi sang trạng thái hoạt động xảy ra thông qua tác động của quản trị viên hoặc thông qua chuyển đổi tự động tích hợp.

•	Chuyển đổi thủ công và chuyển quyền: Khi không cấu hình chuyển đổi tự động, quản trị viên phải chuyển đổi thủ công một trong các RM để đạt trạng thái hoạt động. Quá trình chuyển quyền từ RM hoạt động sang RM khác bao gồm việc chuyển RM chờ thành hoạt động và chuyển RM đang đảm nhiệm vai trò chờ thành hoạt động.

•	Chuyển đổi tự động: Trong trường hợp này, không cần can thiệp thủ công. RM có thể nhúng Zookeeper để quyết định RM nào sẽ trở thành hoạt động. Khi RM hoạt động gặp sự cố, RM khác sẽ tự động được chọn làm hoạt động. Lưu ý rằng không cần chạy một tiến trình riêng biệt cho Zookeeper vì RM hoạt động có thể sử dụng công cụ ActiveStandbyElector để giúp phát hiện và chuyển đổi vai trò thay vì sử dụng ZKFC độc lập.  
