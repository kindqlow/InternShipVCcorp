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
