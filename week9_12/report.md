# 1 Cài đặt Hadoop-Spark

## 1.1 Cài đặt cụm Hadoop theo mô hình
![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/6867970f-3231-40cb-850a-f02d1328cafe)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/8f3470dd-5308-4caa-afb1-f28e69ca5278)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/858516fe-5175-445d-a005-a90519dde134)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/a86ca0eb-4e1c-4f87-8cd1-62aa47cc9e9c)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/379a6db9-c85e-417c-bb48-08d3a128f204)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/072acf21-4e4f-4041-936a-0c2c77834435)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/8988ca3f-8c43-471e-a14e-1d8e226f0b7c)

## 1.2 Cài đặt Spark chạy trên yarn

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/35d22988-f911-4cf4-811e-408dbf9cd667)

# 2 Chạy chương trình WordCount

## 2.1 MapReduce

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/3aa980f6-1641-4380-a425-f8b634235759)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/aa82cc88-5572-495b-b25a-fb0fdf28a3dc)

## 2.2 Spark

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/54e246f6-df54-4ed2-bb00-a1d804f8d6c7)

# 3 Sinh dữ liệu và visualize

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/2bbba854-596d-4b0e-a17b-3994ef335771)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/3d89abc2-67de-457e-a6d2-32aa735d3158)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/c86eb924-58dd-4ec5-a7e3-3de85215bb8a)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/d9e0d2d6-ecc7-48e2-b0a6-7a89f9606c54)

Do phiên bản python không tương thích nên em không thể thực hiện generate và visualize được

# 4 Các công nghệ mở rộng

## 4.1 Kafka 

### Khái niệm Kafka
Apache Kafka là hệ thống gửi nhận tin nhắn theo hình thức publish-subscribe nhanh, linh hoạt, bền vững và chịu được lỗi

• Gửi và nhận tin nhắn theo dạng các luồng ghi chú (streams of records)

• Lưu trữ bền vững trong trường hợp có lỗi xảy ra

• Sao chép các phân vùng nhật ký chủ đề (Topic Log Partitions) đến nhiều máy chủ

• Xử lý các bản ghi khi chúng xảy ra

• Tốc độ IO nhanh, hiệu quả, đóng gói, nén dữ liệu và nhiều tính năng khác

• Sử dụng để tách rời các luồng dữ liệu

• Thường được sử dụng thay cho JMS, RabbitMQ và AMQP

• Tăng công suất, đáng tin cậy và sao chép dữ liệu nhiều hơn

### Khả năng của Kafka

+ Xây dựng ứng dụng xử lý dữ liệu phản ứng thời gian thực

• Cung cấp dữ liệu cho hệ thống phân tích thời gian thực

• Chuyển đổi, phản ứng, tổng hợp, kết hợp các luồng dữ liệu thời gian thực (ví dụ: thu thập số liệu)

• Cung cấp sự kiện cho hệ thống xử lý sự kiện phức tạp (CEP)

• Cung cấp dữ liệu phân tích hàng ngày hoặc hàng giờ có độ trễ cao vào Spark, Hadoop, v.v.

• (ví dụ: Nhật ký cam kết bên ngoài cho hệ thống phân tán. Sao chép dữ liệu giữa các nút, đồng bộ lại để khôi phục trạng thái của nút)

• Bảng tổng hợp và bảng điều khiển cập nhật

+ Xây dựng đường ống dữ liệu streaming thời gian thực

• Hỗ trợ các microservices lưu trong bộ nhớ (actors, Akka, Vert.x, Qbit,RxJava)
## Ứng dụng của Kafka

• 1/3 số công ty trong danh sách Fortune 500

• 7 trong số 10 công ty du lịch hàng đầu, 8 trong số 10 ngân hàng hàng đầu, 9 trong số 10 công ty bảo hiểm hàng đầu, 7 trong số 10 công ty viễn thông hàng đầu

• LinkedIn, Microsoft và Netflix xử lý 1 tỷ tin nhắn mỗi ngày bằng Kafka

• Luồng dữ liệu thời gian thực, được sử dụng để thu thập dữ liệu lớn hoặc để thực hiện phân tích thời gian thực (hoặc cả hai)

Tại sao Kafka phổ biến?

• Hiệu suất tuyệt vời

• Đơn giản trong vận hành, dễ thiết lập và sử dụng, dễ hiểu

• Ổn định, đáng tin cậy, bền vững

• Cung cấp tính năng đăng ký-đăng xuất/ xếp hàng (publish-subscribe/queue) linh hoạt (mở rộng theo số lượng nhóm tiêu thụ)

• Sao chép mạnh mẽ

• Đảm bảo tính nhất quán có thể điều chỉnh cho nhà sản xuất (producer)

• Thứ tự được duy trì ở cấp shard (partition topic)

• Hoạt động tốt với các hệ thống có luồng dữ liệu cần xử lý, tổng hợp, chuyển đổi và tải vào các kho lưu trữ khác.
### Thuật ngữ quan trọng 

• Kafka duy trì nguồn thông điệp trong các danh mục được gọi là topics.

• Luồng ghi chú (" /orders", " /user-signups"), tên feed

• Lưu trữ chủ đề nhật ký (Log topic) trên đĩa

• Partition / Segments (phần của Topic Log)

• Ghi chú có key (tùy chọn), giá trị và thời điểm, không thể thay đổi

• Các quy trình gửi tin nhắn vào chủ đề Kafka được gọi là (producers).

• Các quy trình đăng ký chủ đề và xử lý luồng dữ liệu các tin nhắn đã được gửi được gọi là người tiêu thụ (consumers).

• Kafka được chạy dưới dạng một cụm bao gồm một hoặc nhiều máy chủ, mỗi máy chủ được gọi là broker.

 ### Kiến trúc Kafka

• Cụm Kafka bao gồm nhiều brokers và ZooKeeper.

• Giao tiếp giữa tất cả các thành phần được thực hiện thông qua một API nhị phân đơn giản và hiệu suất cao qua giao thức TCP.

• ZooKeeper cung cấp một cái nhìn đồng bộ về cấu hình cụm Kafka.

• Bầu cử lãnh đạo cho cặp Kafka Broker và Topic Partition,

• Quản lý khám phá dịch vụ cho Brokers Kafka tạo thành cụm

• ZooKeeper gửi các thay đổi cho Kafka.

• Thêm Broker mới, Broker bị ngừng hoạt động, v.v.

• Xóa Topic, Thêm Topic, v.v.
### Cơ chế hoạt động của Kafka

Kafka hoạt động dựa trên mô hình tin nhắn gửi và nhận. Cơ chế hoạt động của Kafka được mô tả từ input đến output như sau:
#### Producer (Người sản xuất):
   - Producer tạo ra các tin nhắn và gửi chúng đến Kafka.
   
   - Tin nhắn được gom nhóm lại thành các khối (batch) để giảm chi phí mạng và tối ưu việc ghi vào Kafka.
   
   - Producer gắn thẻ tin nhắn với một chủ đề (topic) cụ thể, cho biết nơi mà tin nhắn sẽ được lưu trữ.
#### Kafka cluster (Tụ hợp Kafka):
   - Kafka cluster bao gồm nhiều broker (máy chủ), mỗi broker đảm nhận vai trò lưu trữ và xử lý tin nhắn.
   
   - Tin nhắn được phân chia thành các phân vùng (partition), mỗi phân vùng được lưu trữ trên một broker.
   
   - Kafka sử dụng cơ chế phân phối tin nhắn để đảm bảo tính cân bằng tải giữa các broker và các phân vùng.
#### Consumer (Người tiêu thụ):
   - Consumer đăng ký để đọc tin nhắn từ một chủ đề cụ thể.
  
   - Kafka giữ theo dõi vị trí đọc (offset) của từng consumer để đảm bảo không có tin nhắn nào bị bỏ qua hoặc đọc lại.
   
   - Consumer có thể đọc tin nhắn từ Kafka theo các cơ chế tiêu thụ khác nhau, bao gồm hàng đợi đơn (single consumer) hoặc nhóm tiêu thụ (consumer group).
#### Output (Đầu ra):
   - Tin nhắn được đọc từ Kafka bởi consumer và được xử lý theo logic đặc trưng của ứng dụng.
   
   - Các kết quả xử lý có thể được gửi tới hệ thống khác hoặc lưu trữ lại.

Kafka đảm bảo tính bền vững và khả năng mở rộng trong việc xử lý hàng triệu tin nhắn mỗi giây qua các phân vùng và các consumer khác nhau. Cơ chế hoạt động này giúp Kafka trở thành một nền tảng quan trọng trong việc xử lý dữ liệu trực tuyến (real-time data processing) và xây dựng hệ thống phân tán lớn.
### Kiến trúc topic Kafka
Kafka chủ đề (topic) nhật ký(log), và phân vùng(partition)

• Kafka topics là một luồng ghi chú (stream of records)

• Topic được lưu trữ trong nhật ký (log)

• Topic là một danh mục hoặc tên luồng hoặc feed

• Topics được sử dụng theo mô hình publish-subscribe 

• Một topic có thể có không hoặc nhiều subscriber - consumer groups 
#### Phân vùng của chủ đề (Topic partitions)
• Topic được chia thành các phân vùng, thường dựa trên khóa của bản ghi

• Các phân vùng được sử dụng để mở rộng Kafka ra nhiều máy chủ

• Bản ghi được gửi đến phân vùng đúng thông qua khóa

• Phân vùng có thể được sao chép đến nhiều máy chủ
#### Nhật ký phân vùng của chủ đề (Topic partition log)  
• Thứ tự chỉ được duy trì trong một phân vùng duy nhất

• Phân vùng là một chuỗi ghi chú có thứ tự, bất biến và liên tục được thêm vào - một nhật ký cam kết có cấu trúc

• Các bản ghi trong phân vùng có một số id tuần tự gọi là offset
#### Sao chép phân vùng của Kafka
• Mỗi phân vùng có một máy chủ đóng vai trò leader và không hoặc nhiều máy chủ đóng vai trò follower

• Leader xử lý tất cả các yêu cầu đọc và ghi cho phân vùng

• Follower sao chép từ leader

• Một replica đang đồng bộ (in-sync replica - ISR) là replica đã sao chép đầy đủ dữ liệu từ leader

• Nếu leader phân vùng gặp lỗi, một ISR mới sẽ được chọn làm leader

• Các phân vùng của nhật ký được phân tán trên các máy chủ trong cụm Kafka, trong đó mỗi máy chủ xử lý dữ liệu và yêu cầu cho một phần phân vùng

• Mỗi phân vùng có thể được sao chép trên một số máy chủ Kafka có thể cấu hình

• Được sử dụng để chống lỗi

• Bản ghi được coi là "đã xác nhận" khi tất cả ISR của phân vùng đã ghi vào nhật ký của mình.

• Chỉ các bản ghi đã xác nhận mới có thể được đọc bởi consumer.

• Một phân vùng khác có thể thuộc sở hữu của một leader khác trên một broker Kafka khác.
#### Tính bảo đảm
• Các tin nhắn được gửi bởi producer vào một phân vùng chủ đề nhất định sẽ được ghi nối theo thứ tự chúng được gửi đi

• Có thể cấu hình tối thiểu ISR có sẵn để trả về lỗi nếu không có đủ replica có sẵn để sao chép dữ liệu

• Một instance consumer nhìn thấy các tin nhắn theo thứ tự chúng được lưu trữ trong nhật ký

• Đối với một chủ đề có yếu tố sao chép N, Kafka có thể chịu được lỗi của tối đa N-1 máy chủ mà không "mất" bất kỳ tin nhắn nào đã được cam kết trong nhật ký
#### Giữ lại bản ghi Kafka
• Cụm Kafka giữ lại tất cả các bản ghi đã được xuất bản

• Dựa trên thời gian - có thể cấu hình khoảng thời gian lưu giữ

• Dựa trên kích thước - có thể cấu hình dựa trên kích thước

• Tính chính xác - giữ lại bản ghi mới nhất

• Chính sách lưu giữ ba ngày, hai tuần hoặc một tháng

• Dữ liệu vẫn có sẵn để tiêu thụ cho đến khi được loại bỏ theo thời gian, kích thước hoặc tính chính xác

• Tốc độ tiêu thụ không bị ảnh hưởng bởi kích thước
#### Ghi bền vững
• Producer có thể chọn đánh đổi (trade-off) giữa hiệu suất và độ bền của việc ghi

• Lưu ý: hiệu suất cũng có thể được tăng lên với nhiều broker hơn...
#### Hoạt động của Producers
• Producers truy nhập vào một chủ đề mà họ chọn (push)

• Producer(s) thêm Bản ghi vào cuối Log topic

• Tải có thể được phân phối trong số phân vùng

• Thông thường theo phương pháp "round-robin"

• Cũng có thể thực hiện "phân vùng ngữ nghĩa" dựa trên một khóa trong tin nhắn

• Ví dụ: các sự kiện của một 'employeeId' cụ thể được đưa vào cùng một phân vùng

• Quan trọng: Producer chọn phân vùng

• Tất cả các node có thể trả lời các yêu cầu về dữ liệu siêu dữ liệu về:

• Các máy chủ còn sống

• Vị trí của leader cho các phân vùng của một chủ đề
#### Hoạt động của Consumer
• Nhiều Consumer có thể đọc từ cùng một chủ đề

• Mỗi Consumer chịu trách nhiệm quản lý offset của riêng mình

• Tin nhắn vẫn còn trên Kafka... chúng không bị xóa sau khi được tiêu thụ

• Consumer có thể biến mất

• Và sau đó quay lại
#### Nhóm Consumer
• Các Consumer được nhóm thành các Nhóm Consumer

• Mỗi nhóm consumer có một ID duy nhất

• Mỗi nhóm consumer là một subscriber

• Mỗi nhóm consumer duy trì offset riêng của mình

• Nhiều subscriber = nhiều nhóm consumer

• Mỗi nhóm có chức năng khác nhau: một nhóm có thể giao bản ghi cho các microservices trong khi một nhóm khác đang gửi dữ liệu đến Hadoop

• Một bản ghi được gửi đến một Consumer trong một Nhóm Consumer

• Mỗi Consumer trong nhóm consumer lấy các bản ghi và chỉ có một Consumer trong nhóm nhận được cùng một bản ghi

• Các Consumer trong Nhóm Consumer cân bằng việc tiêu thụ bản ghi
#### Mô hình phổ biến của nhóm consumer
• Tất cả các thể hiện consumer trong cùng một nhóm

• Hoạt động giống như một hàng đợi truyền thống với cân bằng tải

• Tất cả các tin nhắn được phát sóng đến tất cả các thể hiện consumer trong cùng một nhóm.

• Tất cả các thể hiện consumer trong các nhóm khác nhau

• Mỗi thể hiện consumer trong các nhóm khác nhau không nhận được các tin nhắn được phát sóng trong nhóm khác.

• "Người đăng ký Logic" - Nhiều thể hiện consumer trong một nhóm

• Các consumer được thêm vào để mở rộng và đảm bảo tính chịu lỗi

• Mỗi thể hiện consumer đọc từ một hoặc nhiều phân vùng cho một chủ đề

• Không thể có nhiều thể hiện consumer hơn số phân vùng
#### Chia sẻ tải của Kafka consumer
• Thành viên của nhóm Consumer được xử lý bởi giao thức Kafka một cách động

• Nếu những Consumer mới tham gia nhóm Consumer, nó sẽ nhận một phần phân vùng

• Nếu một Consumer bị lỗi, các phân vùng của nó được chia thành các Consumer hoạt động trong nhóm Consumer còn lại
#### Kafka consumer khôi phục hệ thống
• Các Consumer thông báo cho broker khi xử lý thành công một bản ghi

• Tiến bộ offset ("__consumer_offset")

• Nếu một Consumer gặp sự cố trước khi gửi offset đã xác nhận cho Kafka broker

• Consumer khác có thể tiếp tục từ offset đã xác nhận cuối cùng

• Một số bản ghi Kafka có thể được xử lý lại

• Hành vi ít nhất một lần

• Tin nhắn nên có tính chất idempotent, tức là việc xử lý lại các tin nhắn không làm thay đổi kết quả cuối cùng.
#### Có thể tiêu thụ những gì (What can be consumed)
• "Log end offset" là offset của bản ghi cuối cùng được ghi vào partition log và nơi mà Producer sẽ ghi tiếp

• "High watermark" là offset của bản ghi cuối cùng được sao chép thành công đến tất cả các partition follower

• Consumer chỉ đọc đến "high watermark". Consumer không thể đọc dữ liệu chưa được sao chép
#### Số lượng Consumer đối với số lượng phân vùng
• Chỉ một Consumer từ cùng một nhóm consumer có thể truy cập vào một Partition cụ thể

• Nếu số lượng nhóm consumer vượt quá số lượng Partition:

• Các Consumer dư thừa sẽ ở trạng thái không hoạt động; có thể sử dụng cho mục đích chuyển đổi lỗi

• Nếu có nhiều Partition hơn số lượng thể hiện nhóm consumer:

• Một số Consumer sẽ đọc từ nhiều phân vùng
#### Broker Kafka
• Cụm Kafka được tạo thành từ nhiều Broker Kafka

• Mỗi Broker có một ID (số)

• Broker chứa các partition log của chủ đề

• Kết nối với một broker sẽ khởi động client cho toàn bộ cụm

• Bắt đầu với ít nhất ba broker, cụm có thể có 10, 100, 1000 broker nếu cần thiết
### Tăng cường và tốc độ của Kafka
• Làm thế nào Kafka có thể mở rộng nếu có nhiều Producer và Consumer đọc/ghi vào cùng một log chủ đề của Kafka?

• Ghi nhanh: Ghi tuần tự vào hệ thống tệp nhanh (700MB hoặc hơn mỗi giây)

• Tăng cường ghi và đọc bằng cách chia tách:

• Partition log của chủ đề thành các Partition (các phần của log chủ đề)

• Partition chủ đề có thể được chia thành nhiều Partition khác nhau trên các máy tính/khác nhau ổ cứng

• Nhiều Producer có thể ghi vào các Partition khác nhau của cùng một chủ đề

• Nhiều nhóm Consumer có thể đọc từ các partition khác nhau một cách hiệu quả

•  Tốc độ xử lý cao và độ trễ thấp

• Gom nhóm các tin nhắn riêng lẻ để giảm khối lượng mạng và gom nhóm các phần tử để ghi nhật ký và tiêu thụ cùng nhau

• Đảm bảo hiệu quả từ đầu đến cuối từ Producer đến hệ thống tệp tin đến Consumer

• Cung cấp nén dữ liệu hiệu quả hơn. Giảm độ trễ I/O

• Sử dụng I/O không sao chép bằng cách sử dụng sendfile (phương thức transferTo của Java’s NIO FileChannel).

• Triển khai cuộc gọi hệ thống sendfile() của Linux giúp tránh sao chép không cần thiết

• Phụ thuộc nhiều vào Linux PageCache

• Bộ điều lập I/O sẽ gom nhóm các ghi nhỏ liên tiếp thành các ghi lớn hơn về mặt vật lý để cải thiện tốc độ xử lý.

• Bộ điều lập I/O sẽ cố gắng tái sắp xếp các ghi để giảm thiểu sự di chuyển của đầu đọc đĩa và cải thiện tốc độ xử lý.

• Tự động sử dụng toàn bộ bộ nhớ trống trên máy tính
### Phân phối dữ liệu
• Ít nhất một lần

• Tin nhắn không bao giờ bị mất nhưng có thể được gửi lại

• Tối đa một lần

• Tin nhắn bị mất nhưng không bao giờ được gửi lại

• Đúng một lần

• Tin nhắn được gửi đúng một lần duy nhất

+ Cách đạt được tính chất đúng một lần

• Phải cân nhắc hai thành phần

• Đảm bảo tính bền vững khi xuất bản một tin nhắn

• Đảm bảo tính bền vững khi tiêu thụ một tin nhắn

• Producer

• Điều gì sẽ xảy ra khi một yêu cầu ghi được gửi nhưng gặp lỗi mạng trước khi nhận được phản hồi (ack)?

• Sử dụng một writer duy nhất cho mỗi phân vùng và kiểm tra giá trị đã ghi nhận mới nhất sau khi gặp lỗi mạng

• Consumer

• Bao gồm một ID duy nhất (ví dụ: UUID) để loại bỏ trùng lặp.

• Xem xét lưu trữ vị trí (offset) cùng với dữ liệu

## 4.2 Apache Nifi

Apache nifi được sử dụng để tự động hóa và kiểm soát các luồng dữ liệu giữa các hệ thống. Nó cung cấp cho chúng ta một giao diện trên nền web mà có thể thu thập, xử lý, phân tích dữ liệu .

NiFi được biết đến với khả năng xây dựng luồng chuyển dữ liệu tự động giữa các hệ thống. Đặc biết là hỗ trợ rất nhiều kiểu nguồn và đích khác nhau như:hệ thống file, cơ sở dữ liệu quan hệ, phi quan hệ,… Ngoài ra Nifi sẽ hỗ trợ các thao tác với dữ liệu như lọc chỉnh sửa, thêm bớt nội dung

Các thành phần chính

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/1eb764db-7515-40da-8770-bba01fdc38b2)

Flowfile: Đại diện cho đơn vị dữ liệu được thực hiện trong luồng ví dụ như 1 bản ghi text, 1 file ảnh… gồm 2 phần:

Content: chính là dữ liệu nó đại diện

Attribute: thuộc tính của flow file (key-value)

Flowfile processor: Đây là những thứ thực hiện công việc trong nifi, bên trong nó đã có chứa sẵn code thực thi các tác vụ trong các trường hợp với input và output. Khối xử lý sinh ra các flowfile. Các processor hoạt động song song với nhau

Connection: Connection đóng vai trò kết nối giữa các processors. Ngoài ra nó còn là một hàng đợi chứa các flowfile chưa được xử lý:

• Xác định thời gian flowfile tồn tại trong queue

• Phân chia flowfile đến các node trong cụm (load balancing)

• Xác định tần suất flowfile nhả ra cho hệ thống

• Kiến trúc hệ thống

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/5d65eb87-4258-4b10-aea6-643be594b793)

Web server: cung cấp giao diện cho người dùng sử dụng các thao tác

Flow Controller: cung cấp tài nguyên cho quá trình hoạt động của hệ thống

Extensions: Bao gồm các thành phần xây dựng nên luồng dữ liệu trong nifi: các processors có nhiệm vụ xử lý, điều hướng; Các log, Controller service chứa các chức năng dùng cho các extensions khác

Flowfile repository: Chỉ lưu lại các metadata của flowfile vì flowfile lưu dữ liệu rồi.

Content repository: Lưu trữ dữ liệu thực đang được xử lý trong luồng. Nifi lưu lại tất cả các phiên bản dữ liệu trước và sau khi được xử lý
Provenance repository: Lưu lại toàn bộ lịch sử của flowfile

Các đặc điểm nổi bật Nifi

• Khả năng quản lý nguồn dữ liệu

• Đảm bảo tính an toàn: Mỗi đơn vị dữ liệu trong luồng sẽ được lưu dưới dạng 1 object là flowfile. Nó sẽ ghi lại thông tin về khối dữ liệu đang được xử lý ở đâu, di chuyển đi đâu… Provenance Repo được sử dụng để lưu các flowfile giúp ta có thể truy vết

• Data Buffering: Giải quyết vấn đề tốc độ dữ liệu ghi vào nhanh hơn dữ liệu đọc giữa hai khối xử lý. Dữ liệu này sẽ được lưu ở RAM, nếu quá một ngưỡng thì sẽ được lưu xuống ổ cứng

• Thiết lập độ ưu tiên: Trong xử lý dữ liệu có những dữ liệu ta phải xử lý ưu tiên

• Đánh đổi tốc độ và khả năng chịu lỗi: Nifi hỗ trợ cài đặt để cân bằng 2 yếu tố này

• Sử dụng dễ dàng
 • Nifi hỗ trợ UI cho việc xây dựng luồng dữ liệu
 
 • Tính tái sử dụng khi ta có thể lưu được các luồng dữ liệu thành 1 template
 
 • Theo dõi trực quan lịch sử

• Mở rộng theo chiều ngang

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/a5cf9e65-05c8-4d24-bb97-4c1a2d67a22b)

Cụm Nifi tuân theo nguyên tắc Zero-master nghĩa là các server nào cũng có công việc giống nhau nhưng xử lý dữ liệu khác nhau. 

• Một Node sẽ được chọn làm quản lý cụm (Cluster Coordinator) thông qua zookeeper. 

• Tất cả các node trong cụm sẽ gửi trạng thái cho node này, và node này có trách nhiệm ngắt kết nối các node mà không gửi trạng thái trong một khoảng thời gian nào đó. 

• Ngoài ra Node này sẽ chịu trách nhiệm cho việc node mới tham gia vào cụm. 

• Node mới phải kết nối trước với node này để dữ liệu được cập nhật
