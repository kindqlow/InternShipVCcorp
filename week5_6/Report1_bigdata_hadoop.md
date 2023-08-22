# 1 Bigdata
## 1.1 Khái niệm
Big Data (dữ liệu lớn) là một khái niệm được sử dụng để mô tả các tập dữ liệu có kích thước lớn, phức tạp và đa dạng mà các công cụ và phương pháp truyền thống không thể xử lý hiệu quả. 
## 1.2 Đặc trưng
5 Đặc trưng của Big Data:
+ Volume (lượng dữ liệu lớn)
+ Velocity (tốc độ xử lý nhanh)
+ Variety (đa dạng dữ liệu)
+ Veracity (tính xác thực)
+ Value (giá trị)
## 1.3 Nguồn dữ liệu
Lượng dữ liệu lớn trong Big Data có thể đến từ nhiều nguồn khác nhau như hệ thống giao dịch, mạng xã hội, thiết bị IoT (Internet of Things) và các nguồn dữ liệu khác. Các công nghệ Big Data được sử dụng để xử lý, lưu trữ và phân tích dữ liệu này nhằm tìm ra thông tin hữu ích, mô hình dự đoán và các hiểu biết mới.
## 1.4 Công nghệ sử dụng
Trong quá trình xử lý dữ liệu lớn, các công nghệ Big Data như Hadoop, Spark và công nghệ cơ sở dữ liệu phi cấu trúc NoSQL (Not Only SQL) thường được sử dụng. 
+ Hadoop là một framework mã nguồn mở được sử dụng để lưu trữ và xử lý dữ liệu lớn trên các cụm máy tính. 
+ Spark là một hệ sinh thái dữ liệu lớn nhanh chóng và linh hoạt, cho phép thực hiện xử lý và phân tích dữ liệu thời gian thực. 
+ Công nghệ cơ sở dữ liệu NoSQL cho phép lưu trữ và truy xuất dữ liệu phi cấu trúc, linh hoạt và có thể mở rộng.
## 1.5 Đánh giá 
Big Data mang lại nhiều lợi ích, bao gồm khả năng tìm kiếm thông tin, phân tích dữ liệu và hiểu biết sâu sắc hơn về các mô hình và xu hướng. Nó đã có ứng dụng rộng rãi trong nhiều lĩnh vực, bao gồm kinh doanh, khoa học, y tế, tài chính, xã hội học và quản lý đô thị. Tận dụng Big Data có thể giúp các tổ chức đưa ra quyết định thông minh, tối ưu hóa hoạt động và tạo ra giá trị mới.
# 2 Hadoop và hệ sinh thái hadoop
## 2.1 Khái niệm Hadoop
Apache Hadoop là một framework cho phép xử lý phân tán các tập dữ liệu lớn trên các cụm máy tính sử dụng mô hình lập trình đơn giản. Nó được thiết kế để mở rộng từ máy chủ đơn lên hàng ngàn máy tính, mỗi máy tính đều cung cấp tính toán và lưu trữ cục bộ. Thay vì phụ thuộc vào phần cứng để đạt được khả năng sẵn có cao, thư viện này được thiết kế để phát hiện và xử lý sự cố ở tầng ứng dụng, đem lại dịch vụ có sẵn lúc nào trên một cụm máy tính, mà mỗi máy tính có thể gặp các sự cố.
## 2.2 Hadoop ecosystem
Cơ sở cốt lõi của Hadoop bao gầm Yarn, HDFS, MapReduce và gồm nhiều công cụ khác
### 2.2.1 Công cụ tích hợp Hadoop
![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/0e02b766-2663-4f72-a115-5b1ac4c43b50)

Nhiều công cụ liên quan tích hợp với Hadoop.

• Phân tích dữ liệu

• Tích hợp cơ sở dữ liệu

• Quản lý luồng công việc (workflow management)

Những công cụ này không được xem là 'Hadoop cốt lõi' (core Hadoop). Thay vào đó, chúng thuộc phạm vi của 'Hệ sinh thái Hadoop' (Hadoop ecosystem).

Nhiều công cụ này cũng là các dự án mã nguồn mở của Apache.
### 2.2.2 Apache Pig
• PIG có hai phần: Pig Latin, ngôn ngữ và pig runtime, môi trường thực thi. Có thể hiểu nó tốt hơn như Java và JVM.

• Nó hỗ trợ ngôn ngữ Pig Latin, có cấu trúc lệnh giống SQL.

Apache Pig giúp giảm gánh nặng lập trình

10 dòng Pig Latin = khoảng 200 dòng mã Java Map-Reduce

Thực chất các công việc MapReduce được thực hiện

• Trình biên dịch chuyển đổi Pig Latin thành MapReduce bên trong. Nó tạo ra một tập hợp tuần tự các công việc MapReduce, và đó là một sự trừu tượng (hoạt động như hộp đen).

• PIG ban đầu được phát triển bởi Yahoo.

• Nó cung cấp một nền tảng để xây dựng luồng dữ liệu cho ETL (Trích xuất, Biến đổi và Tải), xử lý và phân tích các tập dữ liệu lớn.
Làm thế nào Pig hoạt động?

• Trong PIG, lệnh load được sử dụng để tải dữ liệu. Sau đó, thực hiện các chức năng khác nhau trên nó như nhóm, lọc, ghép nối, sắp xếp, v.v. Cuối cùng, bạn có thể đổ dữ liệu lên màn hình hoặc lưu kết quả trở lại HDFS.  
Apache Pig xây dựng trên nền tảng Hadoop để cung cấp xử lý dữ liệu cấp cao.

• Pig đặc biệt tốt trong việc kết hợp và biến đổi dữ liệu.
Trình thông dịch Pig chạy trên máy khách (client machine).

• Biến đổi các kịch bản PigLatin thành các công việc MapReduce.	

• Gửi những công việc đó tới cụm (cluster).
### 2.2.3 Apache Hive
• Facebook đã tạo ra HIVE cho những người thông thạo SQL. Như vậy, HIVE giúp họ cảm thấy thoải mái khi làm việc trong môi trường Hadoop.

• Cơ bản, HIVE là một thành phần data warehousing dùng để đọc, ghi và quản lý các tập dữ liệu lớn trong môi trường phân tán sử dụng giao diện giống SQL.
HIVE + SQL = HQL

• Ngôn ngữ truy vấn của Hive được gọi là Hive Query Language (HQL), tương tự như SQL.
Nó gồm có 2 thành phần cơ bản: Giao diện dòng lệnh Hive và JDBC/ODBC driver.

• Giao diện dòng lệnh Hive được sử dụng để thực thi các lệnh HQL.

• Trong khi đó, Java Database Connectivity (JDBC) và Object Database Connectivity (ODBC) được sử dụng để thiết lập kết nối từ lưu trữ dữ liệu.

Hive có khả năng mở rộng cao. Nó có thể phục vụ cả xử lý tập dữ liệu lớn (xử lý truy vấn theo lô) và xử lý thời gian thực (xử lý truy vấn tương tác).

Nó hỗ trợ tất cả các kiểu dữ liệu nguyên thủy của SQL.

Bạn có thể sử dụng các hàm được xác định trước, hoặc viết các hàm định nghĩa người dùng tùy chỉnh (UDF) để đáp ứng nhu cầu cụ thể của bạn.  

Một sự trừu tượng khác phía trên MapReduce

• Giảm thời gian phát triển

• HiveQL: Ngôn ngữ giống SQL

Trình thông dịch Hive chạy trên máy khách (client machine)

• Biến đổi các kịch bản HiveQL thành các công việc MapReduce

• Gửi những công việc đó tới cụm (cluster)
### 2.2.4 Apache Hbase

HBase là một hệ thống lưu trữ dữ liệu phân tán hướng cột được xây dựng trên nền tảng HDFS.

• Được coi là cơ sở dữ liệu Hadoop.

Dữ liệu được tổ chức logic thành các bảng, hàng và cột.

• Có thể lưu trữ hàng terabytes và thậm chí petabytes dữ liệu trong một bảng.

• Các bảng có thể có hàng ngàn cột.

HBase có khả năng mở rộng để cung cấp lưu lượng ghi rất cao.

• Có thể thực hiện hàng trăm nghìn lệnh chèn (insert) mỗi giây.

Tương đối nguyên thủy so với RDBMS (Hệ quản trị cơ sở dữ liệu quan hệ).

• Là một hệ thống NoSQL: Không có ngôn ngữ truy vấn cấp cao.

• Sử dụng API để quét (scan) / lấy (get) / đặt (put) giá trị dựa trên các khóa.
### 2.2.5 Apache sqoop
Sqoop là một công cụ được thiết kế để chuyển dữ liệu hàng loạt giữa Apache Hadoop và các cơ sở dữ liệu có cấu trúc như cơ sở dữ liệu quan hệ.

Nó có thể nhập tất cả các bảng, một bảng duy nhất hoặc một phần của một bảng vào HDFS (Hadoop Distributed File System).

• Thông qua một tác vụ MapReduce hoặc chỉ Map.

• Kết quả là một thư mục trong HDFS chứa các tệp văn bản được phân cách bằng dấu phẩy (comma-delimited).

Sqoop cũng có thể xuất dữ liệu từ HDFS trở lại cơ sở dữ liệu.

Sự khác biệt lớn nhất giữa Flume và Sqoop là:

Flume chỉ lấy dữ liệu không có cấu trúc hoặc bán có cấu trúc vào HDFS. Trong khi đó, Sqoop có thể nhập và xuất dữ liệu có cấu trúc từ cơ sở dữ liệu quan hệ hoặc kho dữ liệu doanh nghiệp vào HDFS hoặc ngược lại. Hãy hiểu cách Sqoop hoạt động bằng sơ đồ dưới đây:
 
 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/0cd842f8-f660-49d7-b539-de7ac4b03226)

Khi chúng ta gửi lệnh Sqoop, nhiệm vụ chính của chúng ta được chia thành các nhiệm vụ phụ, được xử lý bởi các Map Task riêng lẻ bên trong. Map Task là các nhiệm vụ phụ, nhập một phần dữ liệu vào Hadoop Ecosystem. Tổng hợp, tất cả các Map Task nhập toàn bộ dữ liệu.

Việc xuất cũng hoạt động theo cách tương tự.

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/b139fdf3-513d-4298-b432-4a6e75baaccb)

Khi chúng ta gửi công việc của mình, nó sẽ được ánh xạ thành các Map Task, đưa ra một phần dữ liệu từ HDFS. Những phần dữ liệu này được xuất đến một đích dữ liệu có cấu trúc. Kết hợp tất cả những mảnh dữ liệu được xuất này, chúng ta nhận được toàn bộ dữ liệu tại đích, trong hầu hết các trường hợp là một hệ quản trị cơ sở dữ liệu quan hệ (MYSQL/Oracle/SQL Server).
### 2.2.6 Apache Oozie
Oozie là một hệ thống lập lịch luồng công việc (workflow scheduler) để quản lý các công việc Apache Hadoop.

Các công việc luồng công việc Oozie là các Đồ Thị Hướng Không Cyclic (Directed Acyclic Graphs - DAGs) của các hành động (actions).

Oozie hỗ trợ nhiều hành động trong luồng công việc, bao gồm:

• Thực thi các công việc MapReduce

• Chạy các tập lệnh Pig hoặc Hive

• Thực thi các chương trình Java hoặc lệnh shell tiêu chuẩn

• Xử lý dữ liệu thông qua các lệnh HDFS

• Chạy các lệnh từ xa bằng SSH

• Gửi các tin nhắn e-mail.

Hãy xem Apache Oozie như một dịch vụ đồng hồ hẹn giờ và báo động trong hệ sinh thái Hadoop. Đối với các tác vụ Apache, Oozie đã trở thành một bộ lên lịch. Nó lên lịch các tác vụ Hadoop và liên kết chúng với nhau như một công việc logic duy nhất.

Có hai loại tác vụ Oozie:

• Quy trình Oozie: Đây là một tập hợp tuần tự các hành động được thực thi. Bạn có thể tưởng tượng đây như một cuộc chạy tiếp sức, trong đó mỗi vận động viên đợi đến khi vận động viên trước đó hoàn thành phần của mình.

• Trình bày Oozie: Đây là các tác vụ Oozie được kích hoạt khi dữ liệu được cung cấp cho nó. Hãy tưởng tượng rằng đây là phản ứng-kích thích trong cơ thể chúng ta. Cùng cách chúng ta phản ứng với một kích thích bên ngoài, một bộ lên lịch Oozie phản ứng với sự có sẵn dữ liệu và nghỉ nếu không có dữ liệu.  
### 2.2.7 Apache Zookeeper

• Apache Zookeeper là bộ điều phối của bất kỳ tác vụ Hadoop nào, bao gồm sự kết hợp của các dịch vụ khác nhau trong một môi trường Hadoop.

• Apache Zookeeper phối hợp với các dịch vụ khác nhau trong một môi trường phân tán.

• Trước khi có Zookeeper, việc phối hợp giữa các dịch vụ khác nhau trong Hadoop rất khó khăn và tốn thời gian. Các dịch vụ trước đây gặp nhiều vấn đề về tương tác như cấu hình chung khi đồng bộ dữ liệu. Ngay cả khi dịch vụ được cấu hình, thay đổi trong cấu hình các dịch vụ làm cho nó phức tạp và khó kiểm soát. Việc nhóm và đặt tên cũng là một yếu tố tốn thời gian.

• Do các vấn đề trên, Zookeeper được giới thiệu. Nó tiết kiệm rất nhiều thời gian bằng cách thực hiện đồng bộ hóa, bảo trì cấu hình, nhóm và đặt tên.

• Mặc dù nó là một dịch vụ đơn giản, nhưng nó có thể được sử dụng để xây dựng các giải pháp mạnh mẽ.  

Apache ZooKeeper là một dịch vụ phân phối phối hợp đáng tin cậy cao bao gồm các chức năng

• Quản lý hành viên nhóm

• Bầu cử người lãnh đạo

• Cấu hình động

• Giám sát trạng thái

Tất cả các loại dịch vụ này được sử dụng dưới một hình thức nào đó bởi các ứng dụng phân phối.
### 2.2.8 Apache Mhout

Mahout thực hiện bộ lọc cộng tác, phân cụm và phân loại. Một số người cũng coi việc thiếu tập hợp mục phổ biến là chức năng của Mahout. Hãy hiểu chúng theo cách riêng lẻ:

• Bộ lọc cộng tác: Mahout khai thác hành vi người dùng, mô hình và đặc điểm của họ dựa trên đó dự đoán và đưa ra gợi ý cho người dùng. Một trường hợp sử dụng điển hình là trang web thương mại điện tử.

• Phân cụm: Nó tổ chức một nhóm dữ liệu tương đồng với nhau như bài viết có thể chứa blog, tin tức, bài báo nghiên cứu, v.v.

• Phân loại: Đó có nghĩa là phân loại và phân loại dữ liệu vào các bộ phận con khác nhau như bài viết có thể được phân loại thành blog, tin tức, bài luận, bài báo nghiên cứu và các danh mục khác.

• Thiếu tập hợp mục phổ biến: Ở đây, Mahout kiểm tra xem các đối tượng nào có thể xuất hiện cùng nhau và đưa ra gợi ý nếu chúng thiếu. Ví dụ, điện thoại di động và ốp lưng thường được mua cùng nhau. Vì vậy, nếu bạn tìm kiếm điện thoại di động, nó cũng sẽ đề xuất cho bạn ốp lưng và vỏ.

Mahout cung cấp một dòng lệnh để triệu gọi các thuật toán khác nhau. Nó có một tập hợp đã được xác định trước các thư viện đã chứa các thuật toán tích hợp sẵn khác nhau cho các trường hợp sử dụng khác nhau.  
### 2.2.9 Apache Drill

Apache Drill, như tên của nó, được sử dụng để "khoét" vào bất kỳ loại dữ liệu nào. Đây là một ứng dụng mã nguồn mở hoạt động trong môi trường phân tán để phân tích các tập dữ liệu lớn.

• Drill của Apache là một phiên bản sao của Google Dremel.

• Nó hỗ trợ các loại cơ sở dữ liệu NoSQL và hệ thống tệp tin khác nhau, đây là một tính năng mạnh mẽ của Drill. Ví dụ: Azure Blob Storage, Google Cloud Storage, HBase, MongoDB, MapR-DB HDFS, MapR-FS, Amazon S3, Swift, NAS và các tệp tin cục bộ.

Vì vậy, mục tiêu chính của Apache Drill là cung cấp khả năng mở rộng để xử lý petabytes và exabytes dữ liệu một cách hiệu quả (có thể nói là trong vài phút).

• Sức mạnh chính của Apache Drill nằm trong việc kết hợp nhiều lưu trữ dữ liệu chỉ với một truy vấn duy nhất.

• Apache Drill cơ bản tuân theo ANSI SQL.

• Nó có khả năng mở rộng mạnh mẽ trong việc hỗ trợ hàng triệu người dùng và phục vụ yêu cầu truy vấn trên dữ liệu quy mô lớn.  
### 2.2.10 Apache Flume
Tiến trình nhập dữ liệu là một phần quan trọng của hệ sinh thái Hadoop.

• Flume là một dịch vụ giúp nhập dữ liệu phi cấu trúc và bán cấu trúc vào HDFS.

• Nó đem lại cho chúng ta một giải pháp đáng tin cậy và phân tán, giúp thu thập, tổng hợp và di chuyển các tập dữ liệu lớn.

• Nó giúp chúng ta nhập dữ liệu luồng trực tuyến từ các nguồn khác nhau như luồng dữ liệu mạng, mạng xã hội, email, tập tin log, v.v. vào HDFS.
Kiến trúc của Flume:

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/22d45a8d-582e-4424-a5e5-c9e44fcb5026)

Có một đại diện Flume có nhiệm vụ nhập dữ liệu luồng từ các nguồn dữ liệu khác nhau vào HDFS. Từ sơ đồ, bạn dễ dàng nhận ra rằng máy chủ web chỉ định nguồn dữ liệu. Twitter là một trong những nguồn nổi tiếng để tạo dữ liệu luồng.

Flume agent bao gồm 3 thành phần: nguồn (source), đích (sink) và kênh (channel).

• Nguồn: nó nhận dữ liệu từ luồng đầu vào và lưu trử dữ liệu trong kênh (channel).

• Kênh: nó hoạt động như bộ nhớ đệm cục bộ hoặc lưu trữ chính. Kênh là nơi lưu trữ tạm thời giữa nguồn dữ liệu và dữ liệu vĩnh viễn trong HDFS.

• Đích: Sau đó, thành phần cuối cùng của chúng ta là Đích, thu thập dữ liệu từ kênh và ghi dữ liệu vào HDFS một cách vĩnh viễn.  
### 2.2.11 Apache Solr và Apache Lucene 
Là hai dịch vụ được sử dụng để tìm kiếm và đánh chỉ mục trong Hadoop Ecosystem.

• Apache Lucene dựa trên Java, cũng giúp kiểm tra chính tả (spell checking).

• Nếu Apache Lucene là động cơ, thì Apache Solr là chiếc xe được xây dựng xung quanh nó. Solr là một ứng dụng hoàn chỉnh được xây dựng quanh Lucene.

• Nó sử dụng thư viện tìm kiếm Lucene Java làm trung tâm cho việc tìm kiếm và chỉ mục đầy đủ.  
### 2.2.12 Apache Ambari
Ambari là một dự án của Tổ chức Phần mềm Apache nhằm tạo ra một hệ sinh thái Hadoop dễ quản lý hơn. Nó bao gồm phần mềm để cung cấp, quản lý và giám sát các cụm Apache Hadoop.

Ambari cung cấp:

• Cung cấp cụm Hadoop

•	Nó cung cấp quy trình từng bước để cài đặt các dịch vụ Hadoop trên nhiều máy chủ.

•	Nó cũng xử lý cấu hình các dịch vụ Hadoop trên một cụm.

• Quản lý cụm Hadoop

•	Nó cung cấp một dịch vụ quản lý trung tâm cho việc khởi động, dừng và cấu hình lại các dịch vụ Hadoop trên cụm.

• Giám sát cụm Hadoop:

•	Để giám sát trạng thái và sức khỏe, Ambari cung cấp cho chúng ta một bảng điều khiển.

•	Framework Amber Alert là một dịch vụ thông báo, thông báo cho người dùng khi có sự chú ý cần thiết. Ví dụ, nếu một node bị sập hoặc không gian đĩa thấp trên một node, v.v.  
