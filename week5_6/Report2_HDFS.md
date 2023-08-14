# 3 HDFS
## 3.1 Tổng quan về HDFS
Cung cấp lưu trữ giá rẻ và đáng tin cậy cho lượng dữ liệu khổng lồ, Thiết kế cho

• Các tệp lớn (kích thước tệp từ 100 MB đến một số TB)

• Viết một lần, đọc nhiều lần (chỉ ghi thêm dữ liệu)

• Chạy trên phần cứng thông dụng (commodity hardware)

Hệ thống tệp theo cấu trúc phân cấp kiểu UNIX

• (ví dụ, /hust/soict/hello.txt)

• Quyền sở hữu và quyền truy cập tệp kiểu UNIX
## 3.2 Nguyên tắc thiết kế chính của HDFS
Mô hình I/O (Input/Output)

• Chỉ ghi thêm dữ liệu (append only) → giảm đồng bộ hóa

Phân phối dữ liệu

• Tệp được chia thành các phần lớn (64 MB) 

→ giảm kích thước dữ liệu siêu dữ liệu (metadata)

→ giảm giao tiếp mạng

Sao chép dữ liệu

• Mỗi phần dữ liệu thường được sao chép vào 3 nút khác nhau

Khả năng chịu lỗi

• Data Node: sao chép lại dữ liệu

• Name Node

• Secondary Namenode

• Standby, Active Namenodes
## 3.3 Kiến trúc HDFS

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/8ba225c1-a9af-44dc-a9b0-f02003f52644)

• Kiến trúc Master/slave

• HDFS master: Namenode

  • Quản lý không gian tên và siêu dữ liệu (metadata)

  • Giám sát Datanode

• HDFS slaves: Datanodes

  • Xử lý đọc/ghi dữ liệu thực tế {chunks}
  
  • Các chunk là các tệp cục bộ trong các hệ thống tệp cục bộ (local file systems)
### 3.3.1 Các chức năng của Namenode

• Quản lý không gian tên Hệ thống Tệp

• Ánh xạ một tên tệp thành một tập hợp các khối (blocks)

• Ánh xạ một khối thành các Datanodes mà khối đó nằm trên đó

• Quản lý cấu hình cụm (Cluster Configuration Management)

• Bộ máy sao chép (Replication Engine) cho các khối
## 3.3.2 Metadata (Namenode)
• Metadata trong bộ nhớ chính (main memory)

• Toàn bộ metadata nằm trong bộ nhớ chính

• Không sử dụng trang yêu cầu (demand paging) cho metadata

• Các loại metadata

  • Danh sách các tệp
  
  • Danh sách các khối cho mỗi tệp
  
  • Danh sách các DataNodes cho mỗi khối
  
  • Thuộc tính của tệp, ví dụ: thời gian tạo, yếu tố sao chép

• Một bản ghi giao dịch (Transaction Log)
  
  • Ghi lại các tạo tệp, xóa tệp, v.v.
### 3.3.3 Datanode
• Một máy chủ khối (Block Server)

  • Lưu trữ dữ liệu trong hệ thống tệp cục bộ (ví dụ: ext3)

  • Lưu trữ metadata của một khối (ví dụ: CRC)

  • Cung cấp dữ liệu và metadata cho các máy khách (Clients)

• Báo cáo khối (Block Report)
  
  • Định kỳ gửi báo cáo về tất cả các khối hiện có tới Namenode

• Hỗ trợ việc liên kết dữ liệu (Pipelining of Data)
 
  • Chuyển tiếp dữ liệu đến các Datanode được chỉ định khác

• Tín hiệu sinh lực (Heartbeat)
  
  • Datanode gửi tín hiệu (Heartbeat) tới Namenode mỗi 3 giây một lần

• Namenode sử dụng Heartbeats để phát hiện sự cố với Datanode
## 3.4 Các hoạt động cơ bản
### 3.4.1 Đọc dữ liệu

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/166f6d44-839c-43fe-9834-df576c83718a)

Quy trình đọc dữ liệu bao gồm

•	Client tương tác với NameNode để yêu cầu đọc tệp.

•	NameNode kiểm tra quyền truy cập của client và tìm vị trí lưu trữ dữ liệu trên DataNode.

•	NameNode cung cấp địa chỉ vị trí lưu trữ dữ liệu trên DataNode cho client.

•	NameNode cung cấp mã thông báo bảo mật cho client.

•	client điều hướng đến DataNode được chỉ định và gửi mã thông báo bảo mật để xác thực.

•	DataNode kiểm tra mã thông báo và cho phép client đọc khối dữ liệu cụ thể.

•	Client mở luồng đầu vào và bắt đầu đọc dữ liệu từ DataNode đó.

•	Nếu DataNode gặp sự cố và không thể truy xuất dữ liệu, client sẽ trở lại NameNode để tìm vị trí khác của khối dữ liệu.
### 3.4.2 Ghi dữ liệu

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/4267aeea-3e1c-446c-8266-68fa7d834061)

Quy trình ghi dữ liệu gồm

•	Client tương tác với NameNode để yêu cầu viết dữ liệu.

•	NameNode chia sẻ vị trí ghi dữ liệu trên các slave với client.

•	Client tương tác với DataNode nơi dữ liệu cần được ghi và bắt đầu ghi dữ liệu thông qua luồng xuất dữ liệu FS.

•	Sau khi viết và sao chép dữ liệu thành công, DataNode gửi một thông báo hoàn tất cho client để thông báo dữ liệu đã được ghi hoàn toàn.

•	Nếu chỉ số sao chép mặc định là 3, DataNode đầu tiên sao chép khối dữ liệu sang DataNode khác và tiếp tục sao chép khối sang một DataNode thứ ba.

•	Sau khi các bản sao của khối dữ liệu được tạo thành, DataNode gửi thông báo hoàn tất cuối cùng cho client.

•	Việc ghi đơn giản và có hiệu suất cao hơn trong HDFS nhờ việc ghi đồng thời các khối dữ liệu lên nhiều DataNode.

### 3.4.3 Sao chép dữ liệu (Data replication)
Quy trình sao chép dữ liệu gồm

•	Khi client ghi dữ liệu lên HDFS, dữ liệu được chia thành các khối nhỏ hơn và tiến hành ghi lên DataNode.

•	Mỗi khối dữ liệu được sao chép sang các DataNode khác nhau để đảm bảo tính toàn vẹn và sẵn sàng dữ liệu.

•	Quá trình sao chép khối dữ liệu bắt đầu với DataNode gốc (source DataNode), nơi khối dữ liệu ban đầu được ghi.

•	Source DataNode bắt đầu sao chép khối dữ liệu sang DataNode khác, được gọi là First Replica.

•	First Replica sau đó sao chép khối dữ liệu sang một DataNode thứ ba, được gọi là Second Replica.

•	Second Replica gửi thông báo hoàn tất cho First Replica, và First Replica gửi thông báo hoàn tất cho Source DataNode.

•	Quá trình sao chép tiếp tục cho đến khi số lượng bản sao dữ liệu đạt được đủ (thường là 3 bản sao).

•	Mỗi bản sao của khối dữ liệu được lưu trữ trên các DataNode khác nhau, tạo thành một hệ thống sao chép phân tán.

•	Quá trình sao chép dữ liệu đảm bảo tính phân tán và sẵn sàng của dữ liệu trong trường hợp một DataNode gặp sự cố.

•	Các bản sao dữ liệu được duy trì và cập nhật đồng bộ trong cụm HDFS, đảm bảo độ tin cậy và sẵn sàng cao.

• Vị trí đặt các phần dữ liệu (chunks)

  • Chiến lược hiện tại
  
    • Một bản sao trên nút cục bộ (local node)
  
    • Bản sao thứ hai trên một khay cách xa (remote rack)
  
    • Bản sao thứ ba trên cùng một khay cách xa
  
    • Các bản sao bổ sung được đặt ngẫu nhiên

  • Các máy khách (Clients) đọc từ bản sao gần nhất

• Namenode phát hiện sự cố của Datanode
  
  • Chọn Datanode mới cho các bản sao mới
  
  • Cân bằng sử dụng đĩa
  
  • Cân bằng lưu lượng giao tiếp đến các Datanode
### 3.4.4 Cân bằng dữ liệu (Data rebalance)
• Mục tiêu: Tỷ lệ % đầy đủ đĩa trên các Datanode nên tương tự nhau

• Thường chạy khi thêm Datanode mới

• Cụm đang hoạt động khi Cân bằng dữ liệu (Rebalancer) hoạt động

• Cân bằng dữ liệu (Rebalancer) được giới hạn để tránh quá tải mạng

• Công cụ dòng lệnh
### 3.4.5 Độ chính xác dữ liệu
• Sử dụng checksums để xác nhận dữ liệu
  
  • Sử dụng CRC32

• Tạo tệp
  • Máy khách tính toán checksum cho mỗi 512 byte
  
  • Datanode lưu trữ checksum

• Truy cập tệp
  
  • Máy khách lấy dữ liệu và checksum từ Node dữ liệu
  
  • Nếu xác minh không thành công, máy khách thử các bản sao khác.
### 3.4.6 Liên kết dữ liệu (Data pipelining)

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/861af71a-1039-46b0-bc98-4a23872fb23c)

• Máy khách lấy danh sách các Datanode để đặt các bản sao của một khối
• Máy khách ghi khối vào Datanode đầu tiên
• Datanode đầu tiên chuyển tiếp dữ liệu đến Node tiếp theo trong Pipeline
• Khi tất cả các bản sao được ghi, Máy khách chuyển sang ghi khối tiếp theo trong tệp.
## 3.5 Các khái niệm nâng cao
### 3.5.1 Secondary Name node
• Namenode là một điểm đơn lẻ gây ra sự cố.

• Secondary Name node

  • Thực hiện sao lưu (checkpointing) bản sao mới nhất của tập tin FsImage (hình ảnh trạng thái của hệ thống tệp HDFS) và các tệp nhật ký giao dịch (Transaction Log).

  • Sao chép FsImage và Transaction Log từ Namenode sang một thư mục tạm thời.

• Khi Namenode được khởi động lại
  
  • Kết hợp FSImage và Transaction Log thành một FSImage mới trong thư mục tạm thời.
  
  • Tải lên FSImage mới lên Namenode
  
  • Nhật ký giao dịch trên Namenode được xoá đi.
### 3.5.2 Namenode high availability (HA)
Nền tảng

Trước khi Hadoop 2.0.0, NameNode là một điểm đơn lẻ gây ra sự cố (Single Point of Failure - SPOF) trong một cụm HDFS. Mỗi cụm có một NameNode duy nhất, và nếu máy chủ hoặc quy trình đó trở nên không khả dụng, cụm HDFS sẽ không thể truy cập dữ liệu cho đến khi NameNode được khởi động lại hoặc được triển khai trên một máy chủ khác.

Điều này ảnh hưởng đến sự sẵn có tổng thể của cụm HDFS theo hai cách chính:
•	Trong trường hợp xảy ra sự kiện không được lên kế hoạch như máy chủ bị sập, cụm sẽ không khả dụng cho đến khi người quản trị khởi động lại NameNode.
•	Các sự kiện bảo trì được lên kế hoạch như nâng cấp phần mềm hoặc phần cứng trên máy chủ NameNode sẽ dẫn đến thời gian không hoạt động của cụm.

Tính năng High Availability (HA) của HDFS giải quyết các vấn đề trên bằng cách cung cấp tùy chọn chạy hai (hoặc nhiều hơn, bắt đầu từ Hadoop 3.0.0) NameNodes dự phòng trong cùng một cụm, được cấu hình theo kiểu Active/Passive với một hoặc nhiều bản sao dự phòng nóng (hot standby). Điều này cho phép thay đổi nhanh chóng sang NameNode mới trong trường hợp máy chủ sập, hoặc thay đổi dự phòng do người quản trị khởi tạo một cách đều đặn để thực hiện bảo trì lên kế hoạch.

Kiến trúc

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/360b264e-969c-43df-ba5b-65d8875c661b)

Kiến trúc Trong một cụm HA tiêu chuẩn, hai hoặc nhiều máy riêng biệt được cấu hình như các NameNode. Tại bất kỳ thời điểm nào, chính xác một trong số các NameNode được ở trong trạng thái Active, và các NameNode còn lại ở trạng thái Standby. NameNode Active chịu trách nhiệm cho tất cả các hoạt động của máy khách trong cụm, trong khi Standby đơn giản chỉ đóng vai trò như một slave, duy trì đủ trạng thái để cung cấp chuyển đổi nhanh nếu cần thiết.

Để các nút Standby giữ trạng thái của họ được đồng bộ với nút Active, hiện thực hiện tại yêu cầu các nút có quyền truy cập vào một thư mục trên một thiết bị lưu trữ chung (ví dụ: một gắn kết NFS từ NAS). Ràng buộc này có thể được thả lỏng trong các phiên bản tương lai.

Khi bất kỳ sửa đổi không gian tên nào được thực hiện bởi nút Active, nó sẽ ghi nhật ký bền vững của sửa đổi vào một tệp nhật ký chỉnh sửa được lưu trữ trong thư mục chia sẻ. Các nút Standby liên tục theo dõi thư mục này để theo dõi các chỉnh sửa và khi nhận thấy các chỉnh sửa, chúng áp dụng chúng vào không gian tên của riêng mình. Trong trường hợp chuyển đổi nhanh chóng, các nút Standby sẽ đảm bảo rằng chúng đã đọc tất cả các chỉnh sửa từ bộ nhớ lưu trữ chia sẻ trước khi thăng cấp thành trạng thái Active. Điều này đảm bảo rằng trạng thái không gian tên được đồng bộ hoàn toàn trước khi chuyển đổi nhanh chóng xảy ra.

Để cung cấp chuyển đổi nhanh chóng, cũng cần thiết rằng các nút Standby có thông tin cập nhật về vị trí các khối trong cụm. Để thực hiện điều này, các DataNode được cấu hình với vị trí của tất cả các NameNode và gửi thông tin vị trí khối và nhịp tim đến tất cả các NameNode.

Điều quan trọng cho hoạt động đúng đắn của một cụm HA là chỉ có một trong số các NameNode được Active vào một thời điểm. Nếu không, trạng thái không gian tên sẽ nhanh chóng lệch nhau giữa hai nút, gây nguy cơ mất dữ liệu hoặc kết quả không đúng đắn khác. Để đảm bảo tính chất này và ngăn chặn tình huống "split-brain", người quản trị phải cấu hình ít nhất một phương thức fencing cho lưu trữ chia sẻ. Trong quá trình chuyển đổi nhanh chóng, nếu không thể xác minh rằng nút Active trước đó đã từ bỏ trạng thái Active của mình, quá trình fencing có trách nhiệm cắt đứt quyền truy cập của nút Active trước đó vào lưu trữ chỉnh sửa chia sẻ. Điều này ngăn nó tiếp tục thực hiện bất kỳ chỉnh sửa nào vào không gian tên, cho phép nút Active mới tiếp tục chuyển đổi một cách an toàn.
### 3.5.3 JournalNode

•	JournalNode là một thành phần quan trọng trong hệ thống tệp phân tán Hadoop (HDFS). Nó đóng vai trò lưu trữ và sao lưu thông tin nhật ký chỉnh sửa (editlog) của HDFS. JournalNode giúp đảm bảo tính nhất quán và khả năng phục hồi của dữ liệu trong trường hợp xảy ra sự cố.

•	JournalNode hoạt động trong cụm HDFS và có thể được triển khai trên nhiều nút khác nhau để đảm bảo sự dư thừa và khả năng chịu lỗi. Khi Namenode ghi các chỉnh sửa vào editlog, JournalNode nhận và lưu trữ các thông tin này trên các nút JournalNode khác nhau. Việc lưu trữ thông tin nhật ký trên nhiều JournalNode đảm bảo tính sẵn sàng và an toàn của dữ liệu.

•	JournalNode cung cấp khả năng ghi nhật ký (journaling) cho HDFS để đảm bảo rằng tất cả các thay đổi dữ liệu được ghi lại một cách an toàn và nhất quán. Nó cũng cung cấp khả năng phục hồi dữ liệu trong trường hợp sự cố xảy ra. Khi một Namenode mới được triển khai, hoặc khi một Namenode chính gặp sự cố, JournalNode có thể dung lượng để phục hồi dữ liệu từ thông tin nhật ký.

•	Với JournalNode, tính sẵn sàng và tính nhất quán của HDFS được cải thiện. Nó là một phần quan trọng của kiến trúc của HDFS để đảm bảo rằng dữ liệu luôn được bảo vệ một cách tin cậy và có khả năng tái tạo trong trường hợp xảy ra sự cố.
### 3.5.4 HDFS HA Using QJM
HDFS High Availability Using the Quorum Journal Manager

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/0a47b588-1ac1-4b94-a477-28c33d79cd24)

•	NameNode HA với QJM (Quorum Journal Manager) là một phương pháp triển khai tính cao cấp cho NameNode trong môi trường Hadoop. Phương pháp này sử dụng JournalNodes để đảm bảo đồng bộ trạng thái giữa NameNode Active và NameNode Standby.

•	Khi có sự thay đổi trong không gian tên, NameNode Active ghi lại các sửa đổi vào JournalNodes. JournalNodes là một tập hợp các máy chủ được cấu hình để lưu trữ một bộ nhật ký chỉnh sửa chung. Nhật ký này chứa thông tin về các hoạt động thay đổi không gian tên được thực hiện.

•	NameNode Standby liên tục đồng bộ hóa và theo dõi JournalNodes để cập nhật trạng thái của mình. Nó đọc thông tin từ JournalNodes và áp dụng các sửa đổi vào không gian tên của mình, đảm bảo rằng trạng thái không gian tên của Standby luôn giống với Active.

•	Trong quá trình chuyển giao, khi NameNode Standby xác định rằng nó đã đồng bộ hóa đủ thông tin từ JournalNodes, nó có thể tự mình thăng cấp lên trạng thái Active. Điều này đảm bảo rằng không gian tên được đồng bộ hoàn toàn giữa Active và Standby trước khi chuyển giao xảy ra.

Phương pháp NameNode HA với QJM đảm bảo tính cao cấp và độ tin cậy của hệ thống Hadoop bằng cách duy trì việc ghi log và sao chép dữ liệu trạng thái giữa các NameNode, đảm bảo rằng không gian tên luôn đồng bộ và có sẵn cho các hoạt động của người dùng.
### 3.5.5 HDFS HA Using NFS

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/82b408e4-98bd-479f-92bc-c62da1b0624c)

•	NameNode HA với NFS (Network File System) là một phương pháp triển khai tính cao cấp cho NameNode trong môi trường Hadoop. Phương pháp này sử dụng một lưu trữ chia sẻ thông qua NFS để đảm bảo đồng bộ trạng thái giữa NameNode Active và NameNode Standby.

•	Khi có sự thay đổi trong không gian tên, NameNode Active ghi lại các chỉnh sửa vào một tệp chỉnh sửa được lưu trữ trên thiết bị lưu trữ chia sẻ, ví dụ như NFS mount từ NAS. Cả hai NameNode liên tục theo dõi thư mục chia sẻ này để cập nhật trạng thái của mình. NameNode Standby đọc thông tin từ lưu trữ chia sẻ và áp dụng các chỉnh sửa vào không gian tên của mình, đảm bảo rằng trạng thái không gian tên của Standby luôn giống với Active.

•	Trong quá trình chuyển giao, khi NameNode Standby xác định rằng nó đã đọc đủ thông tin từ lưu trữ chia sẻ, nó có thể tự mình thăng cấp lên trạng thái Active. Điều này đảm bảo rằng không gian tên được đồng bộ hoàn toàn giữa Active và Standby trước khi chuyển giao xảy ra.

Phương pháp NameNode HA với NFS đảm bảo tính cao cấp và độ tin cậy của hệ thống Hadoop bằng cách sử dụng tệp chỉnh sửa chia sẻ và lưu trữ chia sẻ để đồng bộ trạng thái không gian tên giữa các NameNode. Điều này giúp đảm bảo rằng không gian tên luôn có sẵn và đồng bộ cho các hoạt động của người dùng.
### 3.5.6 Editlog

•	Editlog (nhật ký chỉnh sửa) là một thành phần quan trọng trong Hệ thống Tệp phân tán Hadoop (HDFS). Nó được sử dụng để ghi lại tất cả các thay đổi dữ liệu trong HDFS khi có sự chỉnh sửa xảy ra. Khi dữ liệu trong HDFS thay đổi, các thao tác chỉnh sửa đó sẽ được ghi vào editlog.

•	Editlog đóng vai trò quan trọng trong việc bảo đảm tính nhất quán của dữ liệu HDFS. Với editlog, ta có thể tái tạo lại tất cả các chỉnh sửa đã xảy ra trên hệ thống tệp. Nhờ vào editlog, trong trường hợp xảy ra sự cố như mất điểm truy cập vào dữ liệu hoặc mất mát dữ liệu, ta có thể khôi phục dữ liệu về trạng thái trước khi sự cố xảy ra.

•	Editlog thường được chỉnh sửa bằng cách ghi thêm các thao tác vào cuối tệp, giữ cho nó luôn cập nhật với các thay đổi gần nhất trên HDFS. Các thao tác chỉnh sửa được ghi là các ghi chú nhỏ giúp cho việc chỉnh sửa dữ liệu. Khi editlog trở nên quá lớn, ta có thể cắt nhỏ nó và tạo một phiên bản mới để tiếp tục ghi thêm các chỉnh sửa vào đó.

Editlog cùng với fsimage, được sử dụng để khôi phục lại trạng thái và đồ thị của HDFS. Tổng hợp cả hai thành phần này giúp HDFS đảm bảo tính nhất quán dữ liệu và khả năng phục hồi cao trong trường hợp xảy ra sự cố.
### 3.5.7 Standby Namenode
•	Standby Namenode (Namenode dự phòng) là một thành phần quan trọng trong Hệ thống Tệp phân tán Hadoop (HDFS). Standby Namenode hoạt động như một bản sao dự phòng của Namenode chính (Active Namenode). Nhiệm vụ chính của Standby Namenode là duy trì một bản sao của fsimage và nhận thông tin từ editlog.

•	Khi Namenode chính gặp sự cố hoặc cần được bảo trì, Standby Namenode có khả năng tiếp nhận vai trò hoạt động dự phòng. Việc chuyển giao từ Active Namenode sang Standby Namenode được xác định bằng cách sử dụng quy tắc "quyền ưu tiên". Standby Namenode sẽ lấy cấu trúc dữ liệu từ fsimage và nhận các chỉnh sửa từ editlog để đồng bộ và tái tạo lại trạng thái của HDFS.

•	Standby Namenode hoạt động liên tục để duy trì tính sẵn sàng và khả năng phục hồi của HDFS. Cấu trúc dữ liệu fsimage cần được cập nhật định kỳ để giữ cho Standby Namenode luôn được cập nhật với những thay đổi mới nhất. Khi namenode chính trở lại hoạt động, Standby Namenode sẽ trở lại hoạt động dự phòng và chờ đến khi một sự cố xảy ra tiếp theo.

•	Standby Namenode đóng vai trò quan trọng trong việc tăng cường tính sẵn sàng và tin cậy của HDFS. Với Standby Namenode, việc phục hồi dữ liệu trong trường hợp sự cố trở nên nhanh chóng và đảm bảo tính nhất quán của hệ thống tệp.
### 3.5.8 FS Image

•	FS Image (fsimage) là một thành phần trong Hệ thống Tệp phân tán Hadoop (HDFS). Nó đại diện cho một bản sao tĩnh của đồ thị tệp HDFS và chứa thông tin về cấu trúc của hệ thống tệp.

•	Trong fsimage, mỗi đối tượng như thư mục, tệp và phân vùng dữ liệu được mã hóa và lưu trữ dưới dạng một cấu trúc hỗn hợp. Các thông tin bao gồm tên, ID, quyền truy cập, kích thước, thời gian tạo và sửa đổi của các đối tượng. Cấu trúc fsimage giữ cho HDFS khả năng phục hồi dữ liệu trong trường hợp xảy ra sự cố và giúp tái tạo lại trạng thái của hệ thống tệp.

•	Fsimage được tạo và cập nhật bởi Namenode (hoặc Standby Namenode trong trường hợp sao lưu). Khi có bất kỳ thay đổi nào trong tệp HDFS, fsimage sẽ được cập nhật để phản ánh trạng thái mới nhất của dữ liệu. Nếu fsimage quá lớn, nó có thể được cắt nhỏ và tạo ra phiên bản mới để tiếp tục ghi thêm cập nhật vào đó.

•	Fsimage chủ yếu được sử dụng để khôi phục lại trạng thái của HDFS trong trường hợp xảy ra sự cố, ví dụ như khi mất điểm truy cập vào dữ liệu hoặc khi có lỗi xảy ra. Pạng kết hợp với nhật ký chỉnh sửa (editlog), fsimage giúp đảm bảo tính nhất quán và khả năng phục hồi cao của dữ liệu trong HDFS.
## 3.6 Kiểu dữ liệu trong HDFS
### 3.6.1 Tệp văn bản
• Bao gồm các bản ghi CSV, TSV, Json

• Định dạng thuận tiện để trao đổi giữa các ứng dụng hoặc kịch bản

• Dễ đọc và dễ phân tích cú pháp

• Không hỗ trợ nén khối

• Không hiệu quả khi truy vấn

• Tốt cho mục đích sơ khai, nhưng không đủ tốt cho thực tế.
### 3.6.2 Tệp chuỗi (Sequence file)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/29294b83-0467-4d25-8011-94b4ba85c57c)

• Cung cấp một cấu trúc dữ liệu liên tục cho các cặp khóa-giá trị nhị phân

• Thông thường được sử dụng để chuyển dữ liệu giữa các công việc Map Reduce

• Có thể được sử dụng như một lưu trữ để đóng gói các tệp nhỏ trong Hadoop

• Dựa trên dòng (row-based)

•Có thể nén

• Có thể chia thành các phần nhỏ (splittable)

• Hỗ trợ chia nhỏ ngay cả khi dữ liệu đã được nén
### 3.6.3 Avro

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/e5828d44-8af5-4d81-af93-88db64784965)

• Dựa trên dòng (row based)

• Hỗ trợ nén và chia nhỏ (splitting) dữ liệu (object)

• Lược đồ dữ liệu linh hoạt

• Bao gồm lược đồ (JSON) trong tệp

• Các loại dữ liệu

  • Nguyên thủy: null, boolean, int, long, ...
  
  • Phức tạp: bản ghi, mảng, bản đồ, ...

• Trình trạng dữ liệu dạng nhị phân và JSON

• Phát hiện lỗi dữ liệu bị hỏng
### 3.6.4 Parquet

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/ed09cad9-05d6-44cc-899e-f68676e61ed3)

• Định dạng tệp nhị phân hướng cột

• Hiệu quả trong việc đọc/ghi dữ liệu trên đĩa khi chỉ cần truy vấn các cột cụ thể

• Hỗ trợ nén và chia nhỏ (splitting) dữ liệu (theo trang - page)

• Hỗ trợ các cột lồng nhau (sử dụng mã hóa Dremel)
### 3.6.5 Optimized Row Columnar (ORC)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/25205419-8f38-41e2-a289-0dfa0e3eb200)

• RCFile

  • Mỗi cột được nén riêng lẻ trong nhóm hàng (row group)

• Tệp ORC

  • Nén theo chế độ khối (block-mode compression)

  • Hỗ trợ các loại dữ liệu

  • Dữ liệu được sắp xếp (trong một stripe)

• Lưu trữ các bộ sưu tập hàng và trong bộ sưu tập, dữ liệu hàng được lưu trữ theo định dạng cột

• Giới thiệu một chỉ mục nhẹ cho phép bỏ qua các khối hàng không liên quan

• Có thể chia thành các phần nhỏ (splittable) để cho phép xử lý song song các bộ sưu tập hàng

• Chỉ mục với các giá trị được tổng hợp cấp cột (như tối thiểu, tối đa, tổng và số lượng)

