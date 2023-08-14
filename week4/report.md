Em đã thực hiện tìm hiểu công việc tuần 4 như sau:

# MySQL
MySQL là một Hệ thống quản lý cơ sở dữ liệu quan hệ, nó được hỗ trợ bởi Công ty Oracle và hoạt động nhanh, có thể mở rộng, dễ sử dụng. MySQL hỗ trợ nhiều hệ điều hành như Windows, Linux, MacOS, vv. MySQL được phát triển và hỗ trợ bởi MySQL AB - một Công ty Thụy Điển và viết bằng ngôn ngữ lập trình C và C++. Kiến trúc của MySQL mô tả mối quan hệ giữa các thành phần khác nhau của Hệ thống MySQL.
Kiến trúc MySQL bao gồm ba lớp chính:

•	Lớp Client Layer: Lớp này giúp khách hàng gửi yêu cầu tới máy chủ thông qua dòng lệnh hoặc giao diện người dùng. Các dịch vụ quan trọng của lớp khách hàng bao gồm Quản lý Kết nối (Connection Handling), Xác thực (Authentication) và Bảo mật (Security).

•	Lớp Server Layer: Lớp này chịu trách nhiệm cho tất cả các chức năng logic của hệ thống quản lý cơ sở dữ liệu quan hệ MySQL. Các thành phần con của MySQL server bao gồm Quản lý Luồng (Thread Handling), Trình phân tích cú pháp (Parser), Bộ tối ưu hóa (Optimizer), Bộ nhớ đệm Truy vấn (Query Cache), Bộ nhớ đệm và Bộ nhớ cache (Buffer and Cache), Bộ nhớ đệm siêu dữ liệu bảng (Table Metadata Cache) và Bộ nhớ đệm khóa (Key Cache).

•	Lớp Storage Layer: Lớp này làm cho MySQL trở nên độc đáo và phổ biến với các nhà phát triển. Lớp Lưu trữ MySQL sử dụng nhiều loại máy chủ lưu trữ khác nhau như InnoDB, MyISAM, NDB, Memory, v.v. tùy thuộc vào tình huống và yêu cầu.

# Truy vấn và tối ưu hóa truy vấn
Em đã thực hiện tạo một cơ sở dữ  liệu và lấy ví dụ 5 câu truy vấn  không tốt cũng như tối ưu hóa trong file Test1SQL

# Các loại cơ sở dữ liệu
## Cơ sở dữ liệu quan hệ
Cơ sở dữ liệu quan hệ (Relational Databases) là một loại hệ thống quản lý cơ sở dữ liệu dựa trên mô hình dữ liệu quan hệ. Trong mô hình này, dữ liệu được tổ chức thành các bảng có mối quan hệ với nhau thông qua các khóa chính và khóa ngoại. Cơ sở dữ liệu quan hệ rất phổ biến và được sử dụng rộng rãi trong các ứng dụng do tính linh hoạt, đáng tin cậy và dễ sử dụng.
Dưới đây là các khái niệm quan trọng và đặc điểm của cơ sở dữ liệu quan hệ:

•	Bảng (Table): Là thành phần chính của cơ sở dữ liệu quan hệ. Mỗi bảng đại diện cho một loại dữ liệu cụ thể và bao gồm các hàng và cột. Các hàng trong bảng thể hiện các bản ghi riêng lẻ và các cột đại diện cho các thuộc tính của bản ghi đó.

•	Khóa chính (Primary Key): Là một hoặc nhiều cột trong bảng được sử dụng để duy nhất định danh mỗi bản ghi trong bảng. Khóa chính đảm bảo tính duy nhất và hỗ trợ trong việc thiết lập mối quan hệ giữa các bảng.

•	Khóa ngoại (Foreign Key): Là cột trong bảng được sử dụng để tham chiếu đến khóa chính của bảng khác. Khóa ngoại thiết lập mối quan hệ giữa các bảng và giúp duy trì tính toàn vẹn dữ liệu.

•	Truy vấn (Query): Là câu lệnh được sử dụng để truy xuất, chèn, cập nhật hoặc xóa dữ liệu trong cơ sở dữ liệu quan hệ. Ngôn ngữ truy vấn phổ biến cho các cơ sở dữ liệu quan hệ là SQL (Structured Query Language).

•	Mối quan hệ (Relationship): Là mối liên kết giữa các bảng dựa trên khóa chính và khóa ngoại. Mối quan hệ cho phép dữ liệu được phân tán và liên kết giữa các bảng để tạo ra các truy vấn phức tạp và báo cáo.

•	Tính bảo mật: Cơ sở dữ liệu quan hệ cung cấp kiểm soát truy cập dựa trên quyền của người dùng. Quản trị viên có thể xác định quyền của từng người dùng đối với các bảng và truy vấn cụ thể.

•	Đặc điểm ACID: Cơ sở dữ liệu quan hệ thường tuân thủ các nguyên tắc ACID (Atomicity, Consistency, Isolation, Durability) để đảm bảo tính toàn vẹn và nhất quán của dữ liệu trong các giao dịch.
Các hệ quản trị cơ sở dữ liệu quan hệ phổ biến bao gồm MySQL, PostgreSQL, Microsoft SQL Server, Oracle Database, và SQLite. Mỗi hệ quản trị có các tính năng và hiệu suất khác nhau, và việc lựa chọn phù hợp phụ thuộc vào nhu cầu và yêu cầu của dự án hoặc ứng dụng cụ thể.
## Cơ sở dữ liệu phi quan hệ
Cơ sở dữ liệu phi quan hệ (Non-Relational Databases), còn được gọi là NoSQL Databases, là một loại hệ thống quản lý cơ sở dữ liệu không sử dụng mô hình dữ liệu quan hệ truyền thống được sử dụng trong cơ sở dữ liệu quan hệ. Thay vì lưu trữ dữ liệu trong các bảng với mối quan hệ giữa chúng, cơ sở dữ liệu phi quan hệ sử dụng các cơ chế lưu trữ dữ liệu khác nhau, cho phép linh hoạt và mở rộng hơn để xử lý các loại dữ liệu phức tạp và số lượng lớn.
Dưới đây là các loại cơ sở dữ liệu phi quan hệ phổ biến và đặc điểm của chúng:
### Cơ sở dữ liệu key-value:

•	Đặc điểm: Lưu trữ dữ liệu dưới dạng cặp key-value, trong đó key là một chuỗi duy nhất và value có thể là bất kỳ kiểu dữ liệu nào.

•	Ví dụ: Redis, Riak.

### Cơ sở dữ liệu cột gia tăng (Column-family):

•	Đặc điểm: Lưu trữ dữ liệu dưới dạng các cột nhóm lại thành các gia đình (column family). Mỗi cột có tên và các giá trị tương ứng.

•	Ví dụ: Apache Cassandra, HBase.
### Cơ sở dữ liệu tài liệu (Document):

•	Đặc điểm: Lưu trữ dữ liệu dưới dạng tài liệu có cấu trúc hoặc phi cấu trúc, thường là các định dạng JSON hoặc BSON (binary JSON).

•	Ví dụ: MongoDB, Couchbase.
### Cơ sở dữ liệu đồ thời gian (Time-series):

•	Đặc điểm: Dành riêng cho việc lưu trữ và truy vấn dữ liệu theo thời gian và có tính chất liên tục.

•	Ví dụ: InfluxDB, Prometheus.
### Cơ sở dữ liệu biểu đồ (Graph):

•	Đặc điểm: Lưu trữ dữ liệu dưới dạng các đỉnh (vertex) và cạnh (edge) để biểu diễn mối quan hệ giữa các đối tượng.

•	Ví dụ: Neo4j, ArangoDB.

Đặc điểm chung của các cơ sở dữ liệu phi quan hệ bao gồm:

•	Khả năng mở rộng: Các cơ sở dữ liệu phi quan hệ thường có khả năng mở rộng tốt và có thể xử lý các lượng dữ liệu lớn và quy mô cao hơn.

•	Tính linh hoạt: Không yêu cầu sự cố định về cấu trúc dữ liệu, cho phép lưu trữ các loại dữ liệu đa dạng.

•	Hiệu suất cao: Do không sử dụng mô hình quan hệ truyền thống, các cơ sở dữ liệu phi quan hệ thường có hiệu suất cao hơn trong một số trường hợp.

Tuy nhiên, cũng có một số hạn chế của các cơ sở dữ liệu phi quan hệ, như khó khăn trong việc thực hiện các truy vấn phức tạp và hạn chế về tính bảo mật. Việc lựa chọn cơ sở dữ liệu phù hợp phụ thuộc vào yêu cầu và tính chất của ứng dụng hoặc dự án cụ thể.
## Ví dụ
### Cơ sở dữ liệu quan hệ
Các loại cơ sở dữ liệu SQL:

#### Cơ sở dữ liệu Quan hệ (Relational database)
Mô tả:

Cơ sở dữ liệu quan hệ là một hệ thống quản lý cơ sở dữ liệu dựa trên mô hình quan hệ, nơi dữ liệu được tổ chức thành các bảng có hàng và cột. Mỗi bảng trong cơ sở dữ liệu quan hệ đại diện cho một thực thể hoặc một đối tượng cụ thể trong thế giới thực, và các hàng trong bảng đại diện cho các phiên bản của thực thể đó. Các cột trong bảng đại diện cho các thuộc tính hoặc đặc điểm của thực thể. Mối quan hệ giữa các bảng được xác định bằng các khóa chính và khóa ngoại, cho phép liên kết dữ liệu giữa các bảng.

Ưu điểm:

•	Cấu trúc rõ ràng: Dữ liệu được tổ chức một cách cụ thể và rõ ràng trong các bảng, hàng và cột. Điều này giúp cho việc lưu trữ và truy xuất dữ liệu dễ dàng và hiệu quả.

•	Hiệu suất cao cho các truy vấn phức tạp: Cơ sở dữ liệu quan hệ hỗ trợ các truy vấn phức tạp và các phép kết hợp dữ liệu từ nhiều bảng thông qua các mệnh đề JOIN. Các truy vấn phức tạp có thể được thực hiện một cách hiệu quả nhờ sử dụng chỉ mục và kỹ thuật tối ưu truy vấn.

•	Tính nhất quán và an toàn: Cơ sở dữ liệu quan hệ hỗ trợ các tính năng ACID (Atomicity, Consistency, Isolation, Durability), đảm bảo tính nhất quán và an toàn cho dữ liệu trong các giao dịch.

•	Quản lý dữ liệu có cấu trúc: Cơ sở dữ liệu quan hệ phù hợp cho việc lưu trữ và quản lý dữ liệu có cấu trúc như thông tin khách hàng, đơn hàng, sản phẩm, và nhiều dạng dữ liệu khác có sự tương quan.

•	Phân quyền và bảo mật: Cơ sở dữ liệu quan hệ hỗ trợ quản lý quyền truy cập và phân quyền, cho phép quản trị viên kiểm soát quyền truy cập vào dữ liệu của người dùng.

Nhược điểm:

•	Khó khăn khi mở rộng quy mô: Trong môi trường có lượng dữ liệu lớn và yêu cầu mở rộng quy mô cao, cơ sở dữ liệu quan hệ có thể gặp khó khăn và chi phí cao trong việc mở rộng.

•	Không phù hợp cho dữ liệu phi cấu trúc: Cơ sở dữ liệu quan hệ không thích hợp cho việc lưu trữ và xử lý dữ liệu không có cấu trúc hoặc có cấu trúc phức tạp như dữ liệu JSON hay các tài liệu phi cấu trúc khác.

•	Nhược điểm trong hiệu suất với một số truy vấn phức tạp: Mặc dù cơ sở dữ liệu quan hệ hỗ trợ truy vấn phức tạp, nhưng với một số truy vấn đặc biệt có thể gặp khó khăn về hiệu suất, đòi hỏi các biện pháp tối ưu truy vấn.

•	Cần kiến thức và kỹ năng về thiết kế cơ sở dữ liệu: Thiết kế và triển khai cơ sở dữ liệu quan hệ đòi hỏi kiến thức và kỹ năng chuyên môn, đặc biệt là trong việc xác định các quan hệ và mối quan hệ giữa các bảng.

#### Cơ sở dữ liệu Thẻ (Object-Oriented Database)
Mô tả:

Cơ sở dữ liệu Thẻ (Object-Oriented Database - OODB) là một loại cơ sở dữ liệu phi quan hệ được thiết kế để lưu trữ và quản lý dữ liệu của các đối tượng (objects) trong ngôn ngữ lập trình hướng đối tượng (Object-Oriented Programming - OOP). Trong OODB, dữ liệu được tổ chức thành các đối tượng, mỗi đối tượng chứa dữ liệu và phương thức (hành vi) của nó. Các đối tượng có thể kế thừa từ nhau, có đa hình và được truy cập bằng các cơ chế của OOP như gọi phương thức, truy xuất thuộc tính.

Ưu điểm:

•	Tích hợp với lập trình hướng đối tượng: Cơ sở dữ liệu thẻ tương thích và tích hợp chặt chẽ với lập trình hướng đối tượng. Việc lưu trữ và truy xuất dữ liệu dựa trên các đối tượng hỗ trợ sự tương thích và tối ưu với các ngôn ngữ lập trình hướng đối tượng như Java, C++, Python, và C#.

•	Hỗ trợ tính kế thừa và đa hình: Cơ sở dữ liệu thẻ cho phép các đối tượng kế thừa thuộc tính và phương thức từ các đối tượng cha, giúp giảm thiểu việc lặp lại mã và quản lý dữ liệu một cách linh hoạt.

•	Hỗ trợ dữ liệu phức tạp: Cơ sở dữ liệu thẻ hỗ trợ lưu trữ dữ liệu phức tạp, bao gồm dữ liệu đa cấp, đối tượng lồng nhau và các mối quan hệ phức tạp giữa các đối tượng.

•	Hiệu suất cao với các truy vấn phức tạp: Cơ sở dữ liệu thẻ thường cung cấp hiệu suất cao khi xử lý các truy vấn phức tạp liên quan đến các đối tượng và mối quan hệ.

•	Quản lý dữ liệu đồ thị: Cơ sở dữ liệu thẻ phù hợp cho các ứng dụng liên quan đến dữ liệu đồ thị, nơi các đối tượng có mối quan hệ phức tạp với nhau.

Nhược điểm:

•	Khó khăn trong việc tích hợp với ứng dụng hiện có: Cơ sở dữ liệu thẻ có thể khó tích hợp với các ứng dụng đã tồn tại và không được thiết kế dựa trên OOP.

•	Khả năng di chuyển giữa các hệ thống: Do cơ sở dữ liệu thẻ thường có cấu trúc riêng biệt và phụ thuộc vào ngôn ngữ lập trình hướng đối tượng, việc di chuyển dữ liệu giữa các hệ thống có thể gặp khó khăn.

•	Phức tạp trong việc quản lý và thiết kế: Thiết kế cơ sở dữ liệu thẻ đòi hỏi kiến thức chuyên sâu về lập trình hướng đối tượng và quản lý dữ liệu phức tạp.

•	Khó khăn trong tối ưu hóa: Các cơ sở dữ liệu thẻ có thể gặp khó khăn trong việc tối ưu hóa hiệu suất cho các truy vấn phức tạp hoặc trong trường hợp dữ liệu lớn.

#### Cơ sở dữ liệu Lưới (Grid database)
Mô tả:

Cơ sở dữ liệu Lưới (Grid Database) là một hệ thống quản lý cơ sở dữ liệu phân tán, trong đó dữ liệu được phân tán và lưu trữ trên nhiều vị trí và các nút khác nhau. Cơ sở dữ liệu lưới thường được sử dụng để xử lý các tác vụ có tính phân tán và song song, giúp tăng hiệu suất và khả năng mở rộng của hệ thống. Các nút trong lưới thường hoạt động độc lập và có khả năng xử lý một phần của dữ liệu và tác vụ.

Ưu điểm:

•	Mở rộng quy mô cao: Cơ sở dữ liệu lưới cho phép mở rộng quy mô dự án một cách dễ dàng bằng cách thêm nút hoặc máy chủ mới vào hệ thống. Điều này giúp cải thiện hiệu suất và xử lý lượng dữ liệu lớn.

•	Hiệu suất cao và đáng tin cậy: Với việc phân tán dữ liệu và tác vụ, cơ sở dữ liệu lưới có khả năng xử lý song song, giúp tăng hiệu suất và đáng tin cậy của hệ thống.

•	Tích hợp với hệ thống phân tán: Cơ sở dữ liệu lưới thích hợp cho các hệ thống phân tán và có khả năng tích hợp với các dịch vụ phân tán khác nhau.

•	Phân tán dữ liệu: Dữ liệu được phân tán và sao chép trên nhiều nút trong lưới, giúp cải thiện tính sẵn sàng và bảo mật của dữ liệu.

•	Xử lý tác vụ phức tạp: Cơ sở dữ liệu lưới hỗ trợ xử lý các tác vụ phức tạp và song song, như tính toán khoa học, phân tích dữ liệu lớn, và xử lý số liệu thời gian thực.

Nhược điểm:

•	Khó khăn trong thiết kế và triển khai: Thiết kế và triển khai cơ sở dữ liệu lưới đòi hỏi kiến thức chuyên sâu về các công nghệ phân tán và kiến trúc hệ thống phức tạp.

•	Quản lý phức tạp: Quản lý cơ sở dữ liệu lưới có thể phức tạp và đòi hỏi kiến thức cao về quản lý hệ thống phân tán.

•	Chi phí cao: Triển khai và vận hành cơ sở dữ liệu lưới có thể đòi hỏi chi phí cao về cơ sở hạ tầng và phần mềm.

•	Khó khăn trong xử lý các truy vấn phức tạp: Mặc dù cơ sở dữ liệu lưới có thể xử lý các tác vụ song song, nhưng với một số truy vấn phức tạp, có thể gặp khó khăn trong việc tối ưu hóa hiệu suất.

### Cơ sở dữ liệu phi quan hệ
Cơ sở dữ liệu NoSQL:

#### Cơ sở dữ liệu Dựa trên tài liệu (Document-Based)
Mô tả:

Cơ sở dữ liệu Dựa trên tài liệu là một loại cơ sở dữ liệu phi quan hệ, trong đó dữ liệu được tổ chức và lưu trữ dưới dạng các tài liệu độc lập nhau. Các tài liệu thường được lưu trữ dưới dạng các cặp khóa-giá trị, trong đó mỗi tài liệu chứa thông tin về một đối tượng cụ thể, thường là dạng JSON (JavaScript Object Notation) hoặc BSON (Binary JSON). Cơ sở dữ liệu dựa trên tài liệu hỗ trợ các cấu trúc phức tạp và linh hoạt, cho phép thêm hoặc xóa thuộc tính mà không cần thay đổi cấu trúc toàn bộ tài liệu.

Ưu điểm:

•	Linh hoạt và không cần cấu trúc cụ thể: Dữ liệu được lưu trữ dưới dạng tài liệu độc lập, giúp cho việc thêm hoặc xóa thuộc tính trong tài liệu dễ dàng mà không cần thay đổi cấu trúc toàn bộ cơ sở dữ liệu.

•	Tích hợp với các ứng dụng web: Cơ sở dữ liệu dựa trên tài liệu phù hợp cho các ứng dụng web vì dữ liệu thường được lưu trữ dưới dạng JSON, tương tự như dữ liệu JavaScript.

•	Hiệu suất cao với dữ liệu đa cấp: Cơ sở dữ liệu dựa trên tài liệu cho phép lưu trữ dữ liệu đa cấp (nested data) một cách hiệu quả và có thể truy vấn dữ liệu phức tạp dễ dàng.

•	Phân tán và có khả năng mở rộng: Cơ sở dữ liệu dựa trên tài liệu có thể được triển khai trên nhiều nút, hỗ trợ mô hình dữ liệu phân tán và có khả năng mở rộng.

•	Thích hợp cho các ứng dụng có dữ liệu không cấu trúc: Cơ sở dữ liệu dựa trên tài liệu phù hợp cho việc lưu trữ và xử lý dữ liệu không có cấu trúc hoặc có cấu trúc phức tạp như các tài liệu văn bản, dữ liệu sensor, logs, vv.

Nhược điểm:

•	Khả năng truy vấn phức tạp hạn chế: Mặc dù cơ sở dữ liệu dựa trên tài liệu hỗ trợ truy vấn phức tạp, nhưng so với cơ sở dữ liệu quan hệ, nó có hạn chế trong việc thực hiện các truy vấn phức tạp liên quan đến nhiều bảng hoặc tương tác giữa các tài liệu.

•	Khó khăn trong việc thực hiện các truy vấn liên kết (JOIN): Cơ sở dữ liệu dựa trên tài liệu không hỗ trợ truy vấn kiểu JOIN giống như cơ sở dữ liệu quan hệ, việc truy xuất dữ liệu từ nhiều tài liệu phụ thuộc vào khóa ngoại có thể gặp khó khăn.

•	Không hỗ trợ ACID: Phần lớn cơ sở dữ liệu dựa trên tài liệu không hỗ trợ các tính năng ACID (Atomicity, Consistency, Isolation, Durability) như cơ sở dữ liệu quan hệ, dẫn đến mức độ đáng tin cậy và nhất quán dữ liệu thấp hơn.

#### Cơ sở dữ liệu Khóa - Giá trị (Key-Value Stores)
Mô tả:

Cơ sở dữ liệu Khóa - Giá trị là một loại cơ sở dữ liệu phi quan hệ, trong đó dữ liệu được lưu trữ dưới dạng các cặp khóa-giá trị. Mỗi cặp khóa-giá trị đại diện cho một đối tượng hoặc mục dữ liệu cụ thể, trong đó khóa là duy nhất và giúp xác định mục dữ liệu đó. Giá trị có thể là bất kỳ dữ liệu nào, bao gồm cả dữ liệu cấu trúc và không cấu trúc.

Ưu điểm:

•	Tốc độ truy xuất cao: Cơ sở dữ liệu khóa-giá trị được thiết kế để đạt được tốc độ truy xuất dữ liệu cao, cho phép truy xuất nhanh chóng các mục dữ liệu thông qua khóa.

•	Đơn giản và dễ triển khai: Cơ sở dữ liệu khóa-giá trị thường có thiết kế đơn giản, dễ triển khai và vận hành. Việc lưu trữ dữ liệu dưới dạng cặp khóa-giá trị không đòi hỏi quan hệ giữa các mục dữ liệu.

•	Hỗ trợ lưu trữ dữ liệu phi cấu trúc: Cơ sở dữ liệu khóa-giá trị cho phép lưu trữ và truy xuất dữ liệu không có cấu trúc hoặc có cấu trúc đơn giản một cách linh hoạt.

•	Dễ dàng mở rộng quy mô: Cơ sở dữ liệu khóa-giá trị có khả năng mở rộng quy mô một cách dễ dàng bằng cách thêm nút hoặc máy chủ mới vào hệ thống.

•	Thích hợp cho bộ nhớ cache: Cơ sở dữ liệu khóa-giá trị thường được sử dụng như một bộ nhớ cache cho việc lưu trữ tạm thời dữ liệu, giúp cải thiện hiệu suất ứng dụng.

Nhược điểm:

•	Không hỗ trợ truy vấn phức tạp: Cơ sở dữ liệu khóa-giá trị hạn chế trong việc thực hiện các truy vấn phức tạp, đòi hỏi phải biết trước khóa để truy xuất dữ liệu.

•	Không hỗ trợ ACID: Phần lớn cơ sở dữ liệu khóa-giá trị không hỗ trợ các tính năng ACID (Atomicity, Consistency, Isolation, Durability) giống như cơ sở dữ liệu quan hệ.

•	Không thích hợp cho các mối quan hệ phức tạp: Do dữ liệu được lưu trữ dưới dạng các cặp khóa-giá trị độc lập, cơ sở dữ liệu khóa-giá trị không thích hợp cho việc lưu trữ và xử lý các mối quan hệ phức tạp giữa các mục dữ liệu.

•	Chi phí tăng lên với lượng dữ liệu lớn: Cơ sở dữ liệu khóa-giá trị có thể trở nên đắt đỏ và phức tạp trong việc quản lý khi phải xử lý một lượng dữ liệu lớn.

#### Cơ sở dữ liệu Đồ thị (Graph Databases):
Mô tả:

Cơ sở dữ liệu Đồ thị là một loại cơ sở dữ liệu phi quan hệ được thiết kế để lưu trữ và quản lý thông tin về các đối tượng (nút) và các mối quan hệ (cạnh) giữa chúng. Dữ liệu được tổ chức dưới dạng đồ thị, trong đó các nút đại diện cho các thực thể và các cạnh đại diện cho mối quan hệ giữa các thực thể. Mỗi nút và cạnh có thể có thuộc tính riêng, cho phép lưu trữ thông tin chi tiết về các đối tượng và quan hệ.

Ưu điểm:

•	Quản lý mối quan hệ phức tạp: Cơ sở dữ liệu đồ thị hỗ trợ lưu trữ và xử lý các mối quan hệ phức tạp giữa các đối tượng, cho phép dễ dàng tìm kiếm và truy xuất thông tin liên quan đến mối quan hệ.

•	Hiệu suất cao cho truy vấn đồ thị: Cơ sở dữ liệu đồ thị được thiết kế để đạt hiệu suất cao cho các truy vấn đồ thị, bao gồm các truy vấn liên quan đến đường đi ngắn nhất, các mối quan hệ giữa các nút, và các truy vấn phức tạp khác.

•	Dễ dàng mở rộng quy mô: Cơ sở dữ liệu đồ thị có khả năng mở rộng quy mô một cách dễ dàng bằng cách thêm nút hoặc máy chủ mới vào hệ thống.

•	Phân tán và có khả năng mở rộng: Cơ sở dữ liệu đồ thị hỗ trợ mô hình dữ liệu phân tán và có khả năng mở rộng, cho phép xử lý dữ liệu lớn và phức tạp.

•	Thích hợp cho các ứng dụng xã hội và mạng xã hội: Cơ sở dữ liệu đồ thị thích hợp cho các ứng dụng xã hội và mạng xã hội, nơi mối quan hệ giữa các thành viên và các đối tượng khác đóng vai trò quan trọng.

Nhược điểm:

•	Khả năng phức tạp trong việc quản lý: Thiết kế và triển khai cơ sở dữ liệu đồ thị đòi hỏi kiến thức chuyên sâu về kiến trúc đồ thị và các thuật toán tối ưu hóa.

•	Không hỗ trợ ACID hoàn toàn: Một số cơ sở dữ liệu đồ thị không hỗ trợ đầy đủ các tính năng ACID (Atomicity, Consistency, Isolation, Durability) như cơ sở dữ liệu quan hệ.

•	Khó khăn trong việc thực hiện các truy vấn phức tạp: Mặc dù cơ sở dữ liệu đồ thị hỗ trợ truy vấn đồ thị phức tạp, nhưng so với cơ sở dữ liệu quan hệ, nó có hạn chế trong việc thực hiện các truy vấn phức tạp liên quan đến nhiều đỉnh và cạnh.

# Tìm hiểu thêm
## Tìm hiểu về MongoDB

### Định nghĩa
•	MongoDB là một cơ sở dữ liệu mã nguồn mở và là cơ sở dữ liệu NoSQL(*) hàng đầu, được hàng triệu người sử dụng. MongoDB được viết bằng C++.

•	Ngoài ra, MongoDB là một cơ sở dữ liệu đa nền tảng, hoạt động trên các khái niệm Collection và Document, nó cung cấp hiệu suất cao, tính khả dụng cao và khả năng mở rộng dễ dàng.
### Lợi thế của MongoDB
•	Ít schema hơn: Vì schema được sinh ra là để nhóm các đối tượng vào một cụm, dễ quản lý. 

•	Ví dụ như tạo 1 schema tên là Students chẳng hạn thì chỉ có những gì liên quan đến student thì mới được cho vào schema này. Trong khi đó trong mongodb thì chỉ 1 collection ta có thể chứa nhiều document khác nhau. Với mỗi document thì số trường, nội dung, kích thước lại có thể khác nhau.  

•	Cấu trúc của một đối tượng rõ ràng.

•	Không có các Join phức tạp.

•	Khả năng mở rộng cực lớn: việc mở rộng dữ liệu mà không phải lo đến các vấn đề như khóa ngoại, khóa chính, kiểm tra ràng buộc, ... MongoDB cho phép thực hiện replication và sharding nên việc mở rộng cũng thuận lợi hơn.  

•	Sử dụng bộ nhớ trong để lưu giữ cửa sổ làm việc cho phép truy cập dữ liệu nhanh hơn. Việc cập nhật được thực hiện nhanh gọn nhờ update tại chỗ (in-place).  

So sánh với cơ sở dữ liệu quan hệ

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/5179d01e-76bc-4dbf-9a76-6b09d060578d)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/62d069c4-1c05-4456-b1c3-29c5adffa8fb)
### Khi nào nên dùng MongoDB
Sử dụng MongoDB trong trường hợp:

•	Nếu website của có tính chất INSERT cao. Bởi vì mặc định MongoDB có sẵn cơ chế ghi với tốc độ cao và an toàn. Website của ở dạng thời gian thực nhiều, nghĩa là nhiều người thao tác với ứng dung. Nếu trong quá trình load bị lỗi tại một điểm nào đó thì nó sẽ bỏ qua phần đó nên sẽ an toàn.

•	Website có quá nhiều dữ liệu. Giả sử web bạn có đến 10 triệu records thì đó là cơn ác mộng với MYSQL. Bởi vì MongoDB có khả năng tìm kiếm thông tin liên quan cũng khá nhanh nên trường hợp này nên dùng nó.

•	Máy chủ không có hệ quản trị CSDL Trường hợp này thường bạn sẽ sử dụng SQLITE hoặc là MongoDB.
### Khi nào không nên sử dụng
•	Các ứng dụng cần sử dụng nhiều transaction (như ngân hàng) do Mongodb không có cơ chế transaction (giao dịch) để phục vụ cho các ứng dụng ngân hàng

•	Các ứng dụng cần SQL (sử dụng joins).
### Các thuật ngữ hay sử dụng
•	_id – Là trường bắt buộc có trong mỗi document. Trường _id đại diện cho một giá trị duy nhất trong document MongoDB. Trường _id cũng có thể được hiểu là khóa chính trong document. Nếu bạn thêm mới một document thì MongoDB sẽ tự động sinh ra một _id đại diện cho document đó và là duy nhất trong cơ sở dữ liệu MongoDB.

•	Collection – Là nhóm của nhiều document trong MongoDB. Collection có thể được hiểu là một bảng tương ứng trong cơ sở dữ liệu RDBMS (Relational Database Management System). Collection nằm trong một cơ sở dữ liệu duy nhất. Các collection không phải định nghĩa các cột, các hàng hay kiểu dữ liệu trước.

•	Cursor – Đây là một con trỏ đến tập kết quả của một truy vấn. Máy khách có thể lặp qua một con trỏ để lấy kết quả.

•	Database – Nơi chứa các Collection, giống với cơ sở dữ liệu RDMS chúng chứa các bảng. Mỗi Database có một tập tin riêng lưu trữ trên bộ nhớ vật lý. Một mấy chủ MongoDB có thể chứa nhiều Database.

•	Document – Một bản ghi thuộc một Collection thì được gọi là một Document. Các Document lần lượt bao gồm các trường tên và giá trị.

•	Field – Là một cặp name – value trong một document. Một document có thể có không hoặc nhiều trường. Các trường giống các cột ở cơ sở dữ liệu quan hệ.

•	JSON – Viết tắt của JavaScript Object Notation. Con người có thể đọc được ở định dạng văn bản đơn giản thể hiện cho các dữ liệu có cấu trúc. Hiện tại JSON đang hỗ trợ rất nhiều ngôn ngữ lập trình.

•	Index – Là những cấu trúc dữ liệu đặc biệt, dùng để chứa một phần nhỏ của các tập dữ liệu một cách dễ dàng để quét. Chỉ số lưu trữ giá trị của một fields cụ thể hoặc thiết lập các fields, sắp xếp theo giá trị của các fields này. Index hỗ trợ độ phân tích một cách hiệu quả các truy vấn. Nếu không có chỉ mục, MongoDB sẽ phải quét tất cả các documents của collection để chọn ra những document phù hợp với câu truy vấn. Quá trình quét này là không hiệu quả và yêu cầu MongoDB để xử lý một khối lượng lớn dữ liệu.

Sự khác biệt của các trường và _id trong một document: Một _id được dùng để đại diện cho một document và chúng được sinh ra khi thêm một Document vào Collection.
### Mô hình dữ liệu trong MongoDB
•	Dữ liệu trong MongoDB có một schema linh hoạt. Các tài liệu trong cùng một bộ sưu tập không cần phải có cùng một tập hợp các trường hoặc cấu trúc. Các trường chung trong các tài liệu của một bộ sưu tập có thể chứa các loại dữ liệu khác nhau.
Thiết kế Mô hình Dữ liệu (Data Model Design)

•	MongoDB cung cấp hai loại mô hình dữ liệu: Mô hình dữ liệu nhúng và Mô hình dữ liệu chuẩn hóa. Tùy thuộc vào yêu cầu, bạn có thể sử dụng mô hình nào trong quá trình chuẩn bị tài liệu của bạn.
Mô hình Dữ liệu Nhúng (Embedded Data Model)

•	Trong mô hình này, bạn có thể nhúng (embed) tất cả dữ liệu liên quan vào một tài liệu duy nhất, nó cũng được gọi là mô hình dữ liệu không chuẩn hóa. 
Mô hình Dữ liệu Chuẩn hóa (Normalized Data Model)

•	Trong mô hình này, bạn có thể tham chiếu các tài liệu con trong tài liệu gốc bằng cách sử dụng các tham chiếu.  
### Câu lệnh trong MongoDB
+Tạo DataBases use DATABASE_NAME

+Xóa DataBases db.dropDatabase()

+Tạo Collection db.createCollection(name, options) với options là: Chỉ định các tùy chọn về kích thước bộ nhớ và lập chỉ mục

+Xóa Collection db.collection.drop()

+Chèn Document insert()/insertOne() hoặc save()

+Truy vấn Document 

•	Truy vấn dữ liệu từ collection find()

•	In kết quả theo định dạng pretty()

•	Các toán tử And, or, not, nor cú pháp 
>db.my_database.find({ $TT: [ {<key1>:<value1>}, { <key2>:<value2>} ] })

+ Cập nhật Document update()/updateOne()/updateMany()/save()

+ Xóa Document remove((deletion criteria), (justOne))

+ Giới hạn bản ghi limit()

+ Sắp xếp bản ghi sort()

+ Lập chỉ mục createIndex() dropIndex()

•	Chỉ mục hỗ trợ việc giải quyết câu truy vấn một cách hiệu quả. Nếu không có chỉ mục, MongoDB phải quét tất cả các tài liệu của một bộ sưu tập để chọn ra những tài liệu phù hợp với câu truy vấn. Quá trình quét này rất không hiệu quả và đòi hỏi MongoDB xử lý một lượng dữ liệu lớn.

•	Chỉ mục là các cấu trúc dữ liệu đặc biệt, lưu trữ một phần nhỏ của bộ dữ liệu theo một cách dễ dàng để điều hướng. Chỉ mục lưu trữ giá trị của một trường cụ thể hoặc một tập hợp các trường, được sắp xếp theo giá trị của trường như được chỉ định trong chỉ mục.  

+ Phép tổng hợp (Aggregation) aggregate(AGGREGATE_OPERATION)

•	Sao lưu (replication) là quy trình đồng bộ dữ liệu trên nhiều máy chủ. Sao lưu cung cấp tính sẵn có và tăng khả năng khả dụng dữ liệu với nhiều bản sao của dữ liệu trên các máy chủ cơ sở dữ liệu khác nhau. Sao lưu bảo vệ cơ sở dữ liệu khỏi việc mất một máy chủ duy nhất. Sao lưu cũng cho phép bạn khôi phục từ sự cố về phần cứng và gián đoạn dịch vụ. Với các bản sao thêm của dữ liệu, bạn có thể dành riêng một bản sao cho khôi phục sau thảm họa, báo cáo hoặc sao lưu.

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/e21487eb-337b-4644-8208-6c1c2c31745e)

+ Sharding

Sharding là quá trình lưu trữ các bản ghi dữ liệu trên nhiều máy tính và đây là phương pháp của MongoDB để đáp ứng yêu cầu về tăng trưởng dữ liệu. Khi kích thước dữ liệu tăng lên, một máy tính đơn lẻ có thể không đủ để lưu trữ dữ liệu cũng như cung cấp khả năng đọc và ghi ổn định. Sharding giải quyết vấn đề này bằng cách mở rộng theo chiều ngang. Với sharding, bạn có thể thêm nhiều máy tính hơn để hỗ trợ việc tăng trưởng dữ liệu và yêu cầu về các thao tác đọc và ghi.  

Sơ đồ sau đây cho thấy Sharding trong MongoDB bằng cách sử dụng cụm phân mảnh.

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/73669bb7-911c-4f80-9433-b731055a2f06)
 
•	Shards - Shard được sử dụng để lưu trữ dữ liệu. Chúng cung cấp tính sẵn có cao và tính nhất quán của dữ liệu. Trong môi trường sản xuất, mỗi shard là một replica set riêng biệt.

•	Config Servers - Config servers lưu trữ siêu dữ liệu của cluster. Dữ liệu này chứa bản đồ của tập dữ liệu của cluster đến các shard. Query router sử dụng siêu dữ liệu này để chọn shards cụ thể để thực hiện các thao tác. Trong môi trường sản xuất, các sharded clusters có chính xác 3 config servers.

•	Query Routers - Query routers là các phiên bản của MongoDB, tương tác với ứng dụng client và chuyển hướng các thao tác đến shard phù hợp. Query router xử lý và chọn shards để thực hiện các thao tác, sau đó trả kết quả về cho clients. Một cluster đã chia có thể chứa nhiều hơn một query router để phân chia tải yêu cầu từ clients. Client gửi yêu cầu tới một query router. Thông thường, một sharded cluster có nhiều query router.  

+ Backup và Restore

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/ca0ce9d6-46ca-4831-b41e-52c61f43a7af)

•	Restore mongorestore 
+ Quan hệ trong MongoDB

•	Các mối quan hệ có thể được mô hình hóa thông qua các phương pháp được nhúng và tham chiếu. Các mối quan hệ như vậy có thể là 1:1, 1:N, N:1 hoặc N:N.
+ Tham chiếu cơ sở dữ liệu: Sử dụng dbRef
Truy vấn được bảo đảm (covered query) là một truy vấn trong đó:

•	Tất cả các trường trong truy vấn đều là một phần của một chỉ mục.

•	Tất cả các trường trả về trong truy vấn đều nằm trong cùng một chỉ mục.

Vì tất cả các trường có trong truy vấn đều là một phần của chỉ mục, MongoDB khớp các điều kiện truy vấn và trả về kết quả bằng cách sử dụng cùng một chỉ mục mà không thực sự xem xét bên trong các tài liệu. Vì chỉ mục có sẵn trong RAM, việc truy xuất dữ liệu từ chỉ mục nhanh hơn nhiều so với việc truy xuất dữ liệu bằng cách quét các tài liệu.
+ Phân tích truy vấn (Analyzing Queries) là một khía cạnh rất quan trọng trong việc đo lường mức độ hiệu quả của cơ sở dữ liệu và thiết kế lập chỉ mục. 

•	$explain cung cấp thông tin về truy vấn, chỉ mục được sử dụng trong truy vấn và các thống kê khác. Nó rất hữu ích khi phân tích các chỉ mục được tối ưu hóa tốt như thế nào.

•	$hint buộc trình tối ưu hóa truy vấn sử dụng chỉ mục đã chỉ định để chạy truy vấn. Điều này đặc biệt hữu ích khi muốn kiểm tra hiệu năng của một truy vấn với các chỉ mục khác nhau.

+ Atomic Operations trong MongoDB là các hoạt động mà MongoDB duy trì tính toàn vẹn của dữ liệu được thực hiện trong một tài liệu duy nhất, mà không bị can thiệp bởi các hoạt động của các tài liệu khác. Bao gồm tạo, đọc, cập nhật và xóa (CRUD) dữ liệu.

+ Chỉ mục nâng cao 

•	Chỉ mục trường mảng trong MongoDB là quy trình tạo chỉ mục cho các trường chứa các giá trị mảng. Khi sử dụng chỉ mục trường mảng, MongoDB có thể hiệu quả tìm kiếm, lọc và sắp xếp các tài liệu dựa trên các giá trị trong mảng.

•	Chỉ mục trường con trong MongoDB là quá trình tạo chỉ mục cho các trường chứa các tài liệu con. Khi sử dụng chỉ mục trường con, MongoDB có thể hiệu quả truy vấn, lọc và sắp xếp các tài liệu dựa trên các giá trị trong tài liệu con.

+ Giới hạn chỉ mục

•	Một bộ sưu tập không thể có nhiều hơn 64 chỉ mục.

•	Độ dài của tên chỉ mục không thể dài hơn 125 ký tự.

•	Một chỉ mục kết hợp có thể có tối đa 31 trường được chỉ mục.  

+ GridFS

•	GridFS là một phương pháp lưu trữ và tìm kiếm tệp tin lớn trong MongoDB. Khi tải lên các tệp tin có dung lượng lớn hơn giới hạn 16MB của MongoDB, GridFS sẽ tách chúng thành các phần nhỏ hơn và lưu trữ trong hai bộ sưu tập: một bộ sưu tập cho các tệp tin dữ liệu và một bộ sưu tập cho các mảnh tin.

•	GridFS sử dụng một cơ chế ghi chéo (chunking) để chia tệp tin thành các phần nhỏ gọi là các mảnh, và lưu trữ những mảnh này trong bộ sưu tập chunk. Mỗi mảnh có kích thước mặc định là 255kB, nhưng có thể được thay đổi theo yêu cầu. Thông qua việc chia nhỏ dữ liệu, GridFS cho phép tăng hiệu suất truy xuất và lưu trữ các tệp tin lớn.



### Kiểu dữ liệu trong MongoDB
MongoDB hỗ trợ các kiểu dữ liệu sau:

•	Chuỗi: Đây là kiểu dữ liệu được sử dụng phổ biến nhất để lưu giữ dữ liệu. Chuỗi trong MongoDB phải là UTF-8 hợp lệ.

•	Số nguyên: Kiểu dữ liệu này được sử dụng để lưu một giá trị số. Số nguyên có thể là 32 bit hoặc 64 bit phụ thuộc vào Server của bạn.

•	Boolean: Kiểu dữ liệu này được sử dụng để lưu giữ một giá trị Boolean (true/false).

•	Double: Kiểu dữ liệu này được sử dụng để lưu các giá trị số thực dấu chấm động.

•	Min/ Max keys: Kiểu dữ liệu này được sử dụng để so sánh một giá trị với các phần tử BSON thấp nhất và cao nhất.

•	Mảng: Kiểu dữ liệu này được sử dụng để lưu giữ các mảng hoặc danh sách hoặc nhiều giá trị vào trong một key.

•	Timestamp: Đánh dấu thời điểm một Document được sửa đổi hoặc được thêm vào.

•	Object: Kiểu dữ liệu này được sử dụng cho các Document được nhúng vào.

•	Null: Kiểu dữ liệu này được sử dụng để lưu một giá trị Null.

•	Symbol: Kiểu dữ liệu này được sử dụng giống như một chuỗi

•	Date: Kiểu dữ liệu này được sử dụng để lưu giữ date và time hiện tại trong định dạng UNIX time.

•	Object ID: Kiểu dữ liệu này được sử dụng để lưu giữ ID của Document.

•	Binary data: Kiểu dữ liệu này được sử dụng để lưu giữ dữ liệu nhị phân.

•	Code: Kiểu dữ liệu này được sử dụng để lưu giữ JavaScrip code vào trong Document.

•	Regular expression: Kiểu dữ liệu này được sử dụng để lưu giữ Regular Expresion.
### Hoạt động của MongoDB

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/ba28a1c8-b5a6-4ac2-be42-d831fe2d0d3f)

•	MongoDB hoạt động dưới một tiến trình ngầm service, luôn mở một cổng (Cổng mặc định là 27017) để lắng nghe các yêu cầu truy vấn, thao tác từ các ứng dụng gửi vào sau đó mới tiến hành xử lý.

•	Mỗi một bản ghi của MongoDB được tự động gắn thêm một field có tên “_id” thuộc kiểu dữ liệu ObjectId mà nó quy định để xác định được tính duy nhất của bản ghi này so với bản ghi khác, cũng như phục vụ các thao tác tìm kiếm và truy vấn thông tin về sau. Trường dữ liệu “_id” luôn được tự động đánh index (chỉ mục) để tốc độ truy vấn thông tin đạt hiệu suất cao nhất.

•	Mỗi khi có một truy vấn dữ liệu, bản ghi được cache (ghi đệm) lên bộ nhớ Ram, để phục vụ lượt truy vấn sau diễn ra nhanh hơn mà không cần phải đọc từ ổ cứng.

•	Khi có yêu cầu thêm/sửa/xóa bản ghi, để đảm bảo hiệu suất của ứng dụng mặc định MongoDB sẽ chưa cập nhật xuống ổ cứng ngay, mà sau 60 giây MongoDB mới thực hiện ghi toàn bộ dữ liệu thay đổi từ RAM xuống ổ cứng.

+ Nhược điểm của Mongodb:

•	Dữ liệu được caching, lấy RAM làm trọng tâm hoạt động vì vậy khi hoạt động yêu cầu một bộ nhớ RAM lớn

•	Mọi thay đổi về dữ liệu mặc định đều chưa được ghi xuống ổ cứng ngay lập tức vì vậy khả năng bị mất dữ liệu từ nguyên nhân mất điện đột xuất là rất cao.

## Tìm hiểu về index
MySQL cung cấp 3 kiểu chỉ mục khác nhau cho dữ liệu, đó là chỉ mục B-Tree, Hash và R-Tree.

•	Chỉ mục B-Tree (cây cân bằng): Đây là kiểu chỉ mục phổ biến nhất trong MySQL. Chỉ mục B-Tree được sử dụng để tìm kiếm giá trị cụ thể, tìm kiếm phạm vi, và sắp xếp dữ liệu theo thứ tự. Chỉ mục B-Tree có thể được sử dụng cho các trường dạng số, chuỗi ký tự và datetime.

•	Chỉ mục Hash (băm): Chỉ mục Hash được sử dụng để tìm kiếm rất nhanh cho các giá trị cụ thể. Chỉ mục này sử dụng một hàm băm để ánh xạ dữ liệu vào chỉ mục. Tuy nhiên, chỉ mục Hash không hỗ trợ tìm kiếm phạm vi và không theo thứ tự.

•	Chỉ mục R-Tree (cây R-Tree): Chỉ mục R-Tree được sử dụng trong các trường dữ liệu địa lý. Nó được sử dụng để tìm kiếm các đối tượng dựa trên vị trí, ví dụ như các hình dạng và vùng đất. Chỉ mục R-Tree cung cấp các tính năng chính như tìm kiếm trong pham vi và tìm kiếm gần nhau dựa trên khoảng cách.

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/fd4a58af-25ee-43b5-83c8-b78bce576e4f)

•	Đánh index một trường
Đây là cách khá thông thường khi chúng ta lựa chọn 1 column được sử dụng nhiều khi tìm kiếm và đánh index cho nó.

Nhưng nếu số lượng giá trị unique hay giá trị khác NULL trong column đó quá thấp so với tổng số records của bảng thì việc đánh index lại không có nhiều ý nghĩa.

•	Đánh index nhiều trường (B-Tree Index)

Với trường hợp đánh index trên nhiều columns thì index chỉ có hiệu quả khi search theo thứ tự các trường của index.

## Tìm hiểu về các loại engine trong MySQL
### InnoDB
Đây là Storage Engine mặc định trong MySQL 5.7. InnoDB là một Storage Engine transaction-safe (tuân thủ ACID) cho MySQL có các commit, rollback và khả năng khôi phục lỗi để bảo vệ dữ liệu người dùng. Row-level locking của InnoDB và kiểu nonlocking read của Oracle-style làm tăng sự đồng thời và hiệu suất của nhiều người dùng. InnoDB lưu trữ dữ liệu người dùng trong các clustered indexes để giảm I/O cho các truy vấn thông thường dựa trên các primary key. Để duy trì tính toàn vẹn của dữ liệu, InnoDB cũng hỗ trợ các ràng buộc toàn vẹn Foreign Key.
### MyISAM
Table-level locking giới hạn hiệu suất read/write dữ liệu, vì vậy nó thường được sử dụng cho các công việc read-only hoặc read-mostly trong các cấu hình Web và lưu trữ dữ liệu.
### Memory
Lưu trữ tất cả dữ liệu trong RAM, để truy cập nhanh trong các môi trường đòi hỏi tra cứu nhanh các dữ liệu không quan trọng. Engine này trước đây gọi là HEAP Engine. Storage Engine này đang sử dụng ít dần, do InnoDB với vùng bộ đệm cung cấp một cách mục đích chung và bền để giữ hầu hết hoặc tất cả dữ liệu trong memory, và NDBCLUSTER cung cấp tra cứu giá trị quan trọng nhanh cho các bộ dữ liệu phân tán lớn.
### CSV
Các bảng của nó thực sự là các tập tin văn bản với các giá trị được phân cách bởi dấu phẩy. Các bảng CSV cho phép bạn nhập hoặc đổ dữ liệu ở định dạng CSV, để trao đổi dữ liệu với các tập lệnh và ứng dụng đọc và ghi cùng một định dạng. Vì bảng CSV không được lập chỉ mục, bạn thường giữ dữ liệu trong các bảng InnoDB trong quá trình hoạt động bình thường và chỉ sử dụng các bảng CSV trong giai đoạn nhập hoặc xuất.
### Archive
Các bảng nhỏ gọn, không biểu hiện này được dùng để lưu trữ và truy xuất số lượng lớn các thông tin kiểm tra lịch sử, lưu trữ, hoặc kiểm tra an toàn.
### Blackhole
Công cụ lưu trữ Blackhole chấp nhận nhưng không lưu dữ liệu, tương tự như /dev/null trên Unix. Các truy vấn luôn trả về một tập rỗng. Các bảng này có thể được sử dụng trong các cấu hình nhân bản, nơi các lệnh DML được gửi đến các máy chủ nô lệ, nhưng máy chủ chủ không giữ bản sao dữ liệu của chính nó.
### NDB (còn được gọi là NDBCLUSTER)
Công cụ cơ sở dữ liệu được nhóm lại này đặc biệt phù hợp với các ứng dụng đòi hỏi thời gian hoạt động và tính khả dụng cao nhất có thể.
### Merge
Cho phép một DBA MySQL hoặc nhà phát triển hợp lý nhóm một loạt các bảng MyISAM giống hệt nhau và tham chiếu chúng như một đối tượng. Tốt cho các môi trường VLDB như lưu trữ dữ liệu.
### Federated
Cung cấp khả năng liên kết máy chủ MySQL riêng biệt để tạo ra một cơ sở dữ liệu hợp lý từ nhiều máy chủ vật lý. Rất tốt cho môi trường phân phối hoặc dữ liệu mart.

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/ba9f07e1-01c5-4c21-b4ed-2e08b7618166)

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/a0d1479c-90b4-46e0-bf6e-3052c72eb6c9)

•	[1] InnoDB hỗ trợ cho việc Geospatial indexing từ MySQL 5.7.5 trở lên.

•	[2] InnoDB sử dụng Hash index nội bộ cho tính năng Hash Index của nó.

•	[3] InnoDB hỗ trợ FULLTEXT từ MySQL 5.6.4 và sau đó.

•	[4] Các bảng InnoDB đã nén được yêu cầu định dạng tệp InnoDB Barracuda.

•	[5] Các bảng MyISAM nén chỉ được hỗ trợ khi sử dụng định dạng dòng nén. Các bảng sử dụng định dạng nén với MyISAM chỉ được đọc (readonly).

•	[6] Thực hiện trên server (thông qua chức năng mã hóa). Mã hóa dữ liệu có sẵn từ MySQL 5.7 trở lên.

•	[7] Thực hiện trên server thay vì Storage Engine.

•	[8] Hỗ trợ cho khóa ngoại (foreign key) có sẵn từ MySQL Cluster NDB 7.3 và sau đó.

•	[9] Thực hiện trên server thay vì Storage Engine.
