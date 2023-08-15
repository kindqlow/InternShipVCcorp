# 6. Spark
## 6.1 Hạn chế của Map Reduce
Map Reduce: Công việc lặp

• Công việc lặp bao gồm nhiều hoạt động đọc/ghi từ đĩa cho mỗi vòng lặp

• Đọc/ghi từ đĩa rất chậm!

Yêu cầu một hệ thống phân tích dữ liệu thống nhất cho xử lý dữ liệu quy mô lớn hỗ trợ tốt hơn cho:

• Thuật toán lặp

• Khai thác dữ liệu tương tác

• Khả năng chịu lỗi, tối ưu dữ liệu cục bộ, khả năng mở rộng

• Ẩn đi sự phức tạp: giúp người dùng tránh việc viết mã cho cơ chế phân tán.
## 6.2 Khái niệm 
Spark là một động cơ phân tích thống nhất cho việc xử lý dữ liệu quy mô lớn

• Tốc độ: thực hiện công việc nhanh gấp 100 lần

• Hiệu suất cao cho cả dữ liệu batch và streaming

• Tính toán chạy trong bộ nhớ
## 6.3 Đặc điểm
Dễ sử dụng: viết ứng dụng nhanh chóng bằng Java, Scala, Python, R, SQL

• Cung cấp hơn 80 toán tử cấp cao

• Sử dụng chúng theo cách tương tác từ Scala, Python, R và SQL

Tính tổng quát: kết hợp SQL, Streaming và phân tích phức tạp

• Cung cấp các thư viện bao gồm SQL và DataFrames, Spark Streaming, MLib, GraphX,

• Hỗ trợ một loạt các công việc, ví dụ: ứng dụng batch, thuật toán tương tác, truy vấn tương tác, streaming.

Dễ dàng chạy trên mọi nền tảng:

• Chạy trên Hadoop, Apache Mesos, Kubernetes, độc lập hoặc trên đám mây.

• Truy cập dữ liệu trên HDFS, Aluxio, Apache Cassandra, Apache Hbase, Apache Hive, v.v.
## 6.4 So sánh Spark và Map Reduce
Sự khác nhau giữa Spark and Map Reduce

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/533cfc90-1c27-4923-a86b-dbaf28577a81)

## 6.5 Thành phần của Spark stack

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/28638c49-f8e5-4ccd-a090-88681e048cce)

+Spark Core:

• Bao gồm các chức năng cơ bản của Spark bao gồm lập lịch công việc, quản lý bộ nhớ, phục hồi lỗi, v.v.

• Cung cấp API để xây dựng và điều chỉnh RDDs.

+SparkSQL

• Cho phép truy vấn dữ liệu có cấu trúc qua SQL, Hive Query Language.

• Cho phép kết hợp truy vấn SQL và thao tác dữ liệu bằng Python, Java, Scala.

+ Spark Streaming: Cho phép xử lý dữ liệu trực tiếp thông qua API.

+Spark Mlib:

• Chứa các chức năng thông thường của máy học.

• Cung cấp nhiều loại thuật toán: phân loại, hồi quy, gom cụm, v.v.

+ GraphX:

• Thư viện để điều chỉnh đồ thị và thực hiện tính toán song song trên đồ thị.

• Mở rộng Spark RDD API.

+ Cluster Managers

• Hadoop Yarn

• Apache Mesos

• Standalone Schedular (quản lý đơn giản trong Spark).
## 6.6 Resilient Distributed Dataset (RDD)
• RDDs là cấu trúc dữ liệu phân tán bền vững, chịu lỗi và song song cho phép người dùng lưu trữ rõ ràng các kết quả trung gian trong bộ nhớ, kiểm soát việc phân vùng để tối ưu vị trí dữ liệu và điều khiển chúng bằng cách sử dụng một tập hợp phong phú các toán tử.

• Sự chuyển đổi thô (coarse-grained) so với các cập nhật tinh vi (fine-grained)

• Ví dụ: map, filter và join) là những phép toán áp dụng cùng một thao tác cho nhiều mục dữ liệu cùng một lúc.

RDD có thể được tạo ra theo hai cách:

• Tạo song song một bộ sưu tập (Parallelize)

• Đọc dữ liệu từ nguồn bên ngoài (S3, C*, HDFS, v.v.)

1. Tạo song song (Parallelize)

Lấy một bộ sưu tập tồn tại trong bộ nhớ và truyền nó vào phương thức parallelize của SparkContext

Thường không được sử dụng bên ngoài mục đích prototyping và testing vì nó đòi hỏi toàn bộ tập dữ liệu trong bộ nhớ trên một máy tính

2. Đọc từ Tệp Văn Bản (Read from Text File)

Có các phương pháp khác để đọc dữ liệu từ HDFS, C*, S3, HBase, v.v.

Các hoạt động trên Dữ liệu Phân tán

• Hai loại hoạt động: biến đổi (transformations) và hành động (actions)

• Các biến đổi được thực hiện chậm (không tính toán ngay lập tức)

• Các biến đổi được thực hiện khi một hành động được chạy

• Lưu trữ (cache) dữ liệu phân tán trong bộ nhớ hoặc đĩa
### 6.6.1 Các loại RDD
+ logLinesRDD: Đây là một RDD (Resilient Distributed Dataset) chứa các dòng log. Được sử dụng để lưu trữ và thao tác với các tệp log hoặc dữ liệu log.

+ errorsRDD: Đây là một RDD chứa các bản ghi log được phát hiện là lỗi. Được tạo ra thông qua việc lọc (filter) các dòng log và chỉ giữ lại những dòng log có nội dung đánh dấu là lỗi.

+ cleanedRDD: Đây là một RDD chứa các bản ghi log đã được làm sạch, tức là loại bỏ các dòng log không cần thiết hoặc dữ liệu log không hợp lệ. Thông thường, quá trình làm sạch (cleaning) có thể bao gồm việc xóa các dòng trắng, loại bỏ ký tự đặc biệt không mong muốn hoặc xử lý các thành phần dữ liệu log để chuẩn hóa chúng.

Các RDD trên giúp thực hiện các thao tác và xử lý dữ liệu log trong môi trường phân tán sử dụng Spark.
### 6.6.2 DAG
DAG execution (Directed Acyclic Graph execution) là quá trình thực hiện các phép biến đổi và action trên Spark RDDs (Resilient Distributed Datasets) theo mô hình DAG.

Trên phương diện logic

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/ee3c1842-82cc-40c6-981b-9d3e2b1ea1dd)

Trên phương diện vật lý

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/cfdd1f9f-4f47-4f98-b695-8ad94c236eb7)

Tổng quát

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/72c05f30-6601-4a64-b530-6e473e5a3a2a)

Trong DAG execution, các RDDs và các phép biến đổi (transformations) được tổ chức thành một đồ thị không chu trình (DAG). Các phép biến đổi là các bước biến đổi dữ liệu từ RDD gốc thông qua các phép biến đổi toán học và logic được áp dụng. Trên đồ thị DAG, mỗi đỉnh đại diện cho một RDD và mỗi cạnh thể hiện quan hệ phụ thuộc giữa các RDD dựa trên các phép biến đổi.

Khi quá trình DAG execution bắt đầu, Spark sẽ tối ưu hóa thứ tự thực hiện các phép biến đổi dựa trên dependency trong đồ thị DAG, nhằm tối đa hiệu suất tính toán. Spark cũng có thể thực hiện các phép biến đổi song song (parallel) khi có thể để tận dụng sức mạnh tính toán của nhiều worker node trong hệ thống phân tán.

Quá trình DAG execution cho phép Spark tối ưu hóa tính toán và tận dụng khả năng song song, giúp thực hiện các phép biến đổi trên dữ liệu một cách hiệu quả và nhanh chóng.
### 6.6.3 Triển khai RDD
Resilient Distributed Dataset (RDD)

• RDD ban đầu trên đĩa (HDFS, v.v.)

• RDD trung gian trong bộ nhớ RAM

• Khôi phục lỗi dựa trên lineage

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/67ade01d-e8e4-4bd9-bc74-a420434b0005)

• Các hoạt động trên RDD được phân tán
## 6.7 DataFrame
• DataFrame là một trừu tượng chính trong Spark 2.0.

• Một khi được tạo, DataFrame là bất biến (immutable).

• Theo dõi thông tin lineage để tính lại dữ liệu bị mất một cách hiệu quả.

• Cho phép thực hiện các hoạt động trên tập hợp các phần tử song song.

• Để tạo DataFrame:
   - Bằng cách song song hóa các bộ sưu tập Python hiện có (các danh sách).
   - Bằng cách biến đổi một DataFrame Spark hoặc pandas hiện có.
   - Từ các tệp tin trong HDFS hoặc hệ thống lưu trữ khác.
### 6.7.1 Các biến đổi (Transformations)
• Tạo ra DataFrame mới từ một DataFrame hiện có.

• Sử dụng đánh giá lười biếng (lazy evaluation).

• Không có gì được thực thi ngay lập tức.

• Spark lưu trữ công thức cho nguồn biến đổi.

Các Transformatons phổ biến:

select(*cols) - Chọn cột từ DataFrame hiện tại.

drop(col) - Trả về một DataFrame mới bỏ đi cột cụ thể.

filter(func) - Trả về một DataFrame mới được tạo bằng cách lựa chọn các dòng của nguồn mà func trả về true.

where(func) - Where là bí danh của filter.

distinct() - Trả về một DataFrame mới chứa các dòng duy nhất của nguồn DataFrame.

sort(*cols, **kw) - Trả về một DataFrame mới được sắp xếp theo các cột đã chỉ định và theo thứ tự sắp xếp được chỉ định bởi kw.
### 6.7.2 Các hành động (Actions)
• Chạy công thức biến đổi nguồn để Spark thực thi.

• Cung cấp các cơ chế để lấy kết quả ra khỏi Spark.

Các Actions phổ biến 

show(n, truncate) - In ra n dòng đầu tiên của DataFrame này.

take(n) - Trả về n dòng đầu tiên dưới dạng danh sách các Row.

collect() - Trả về tất cả các bản ghi dưới dạng danh sách các Row (*).

count() - Trả về số lượng dòng trong DataFrame này.

describe(*cols) - Hàm phân tích dữ liệu thống kê tính toán các thống kê (số lượng, trung bình, độ lệch chuẩn, giá trị nhỏ nhất, giá trị lớn nhất) cho các cột số học.

(*) Lưu ý: collect() có thể không nên sử dụng trên các DataFrame lớn vì nó có thể gây áp lực lên bộ nhớ và gây gián đoạn trong việc thực thi.
### 6.7.3 Quy trình lập trình Spark
• Tạo DataFrames từ dữ liệu bên ngoài hoặc tạo DataFrame từ một bộ sưu tập trong chương trình trình điều khiển (driver program).

• Chuyển đổi chúng một cách lười biếng (Lazily transform) thành các DataFrame mới.

• Lưu trữ bộ nhớ đệm (cache()) một số DataFrames để sử dụng lại.

• Thực hiện các hành động để thực thi tính toán song song và tạo ra kết quả.
### 6.7.4 DataFrames so với RDDs
• Đối với người dùng mới quen với khái niệm các bảng dữ liệu (data frames) trong các ngôn ngữ lập trình khác, API (Application Programming Interface - Giao diện lập trình ứng dụng) này sẽ giúp họ dễ dàng tiếp cận và sử dụng.

• Đối với người dùng Spark hiện có, API này sẽ giúp lập trình Spark dễ dàng hơn so với việc sử dụng RDDs.

• Đối với cả hai nhóm người dùng, DataFrames sẽ cải thiện hiệu suất thông qua tối ưu hóa thông minh và tạo mã tự động.
### 6.7.5 Tiện ích của DataFrames
Ghi ít mã hơn: Input và Output

Giao diện thống nhất để đọc/ghi dữ liệu trong nhiều định dạng khác nhau

Ghi ít mã hơn: Các hoạt động cấp cao

• Giải quyết các vấn đề thông thường một cách ngắn gọn với các hàm DataFrame:

• chọn các cột và lọc dữ liệu

• kết hợp các nguồn dữ liệu khác nhau

• tóm tắt (đếm, tổng, trung bình, v.v.)

• biểu đồ kết quả (ví dụ: với Pandas)
### 6.7.6 Dataset
1. Định nghĩa

+ Dataset là một cấu trúc dữ liệu trong SparkSQL được xác định rõ kiểu dữ liệu và ánh xạ tới một schema quan hệ. Nó biểu diễn các truy vấn có cấu trúc với các bộ mã hóa. Nó là một phần mở rộng của API data frame. Spark Dataset cung cấp cả tính an toàn kiểu và giao diện lập trình hướng đối tượng. Chúng ta biết đến việc phát hành dataset trong Spark 1.6.

+ Bộ mã hóa là khái niệm chính trong framework (SerDes) của việc tuần tự hóa và giải tuần tự hóa trong Spark SQL. Bộ mã hóa dịch giữa các đối tượng JVM và định dạng nhị phân nội bộ của Spark. Spark tích hợp sẵn bộ mã hóa rất tiên tiến. Chúng tạo bytecode để tương tác với dữ liệu ngoài heap.

+ Bộ mã hóa cung cấp truy cập cần thiết vào các thuộc tính riêng lẻ mà không cần giải tuần tự hóa toàn bộ đối tượng. Để tối ưu thời gian và không gian nhập-xuất, Spark SQL sử dụng framework SerDe. Vì bộ mã hóa biết về schema của bản ghi, nó có thể thực hiện tuần tự hóa và giải ứng.

+ Spark Dataset là biểu diễn truy vấn có cấu trúc và trì hoãn (lazy) gây ra hành động. Bên trong, dataset biểu diễn một logical plan. Logical plan cho biết truy vấn tính toán mà chúng ta cần tạo ra dữ liệu. Logical plan là một logical query plan của toán tử logic để tạo thành kế hoạch truy vấn logic. Khi chúng ta phân tích và giải quyết điều này, chúng ta có thể tạo ra một physical query plan.

Dataset kết hợp các tính năng của RDD và DataFrame. Nó cung cấp:

•	Sự tiện lợi của RDD. 

•	Tối ưu hóa hiệu suất của DataFrame. 

•	An toàn kiểu tĩnh của Scala. 

Do đó, Dataset cung cấp một giao diện lập trình hướng chức năng hơn để làm việc với dữ liệu có cấu trúc.

2. Tầm quan trọng của Dataset trong Spark

Để vượt qua nhược điểm của RDD và Dataframe, Dataset đã ra đời. Trong Dataframe, không có sẵn tính an toàn kiểu dữ liệu vào thời điểm biên dịch. Dữ liệu không thể thay đổi mà không biết cấu trúc của nó. Trong RDD, không có sự tối ưu hóa tự động. Do đó, chúng ta phải tối ưu nó thủ công khi cần thiết.

3. Các tính năng của Dataset trong Spark

Sau khi đã được giới thiệu về Dataset, bây giờ hãy thảo luận về các tính năng khác nhau của Dataset trong Spark-

a. Truy vấn tối ưu hóa

Dataset trong Spark cung cấp truy vấn tối ưu hóa bằng cách sử dụng Catalyst Query Optimizer và Tungsten. Catalyst Query Optimizer là một framework không phụ thuộc vào việc thực thi. Nó biểu diễn và chỉnh sửa một đồ luồng dữ liệu. Bằng cách tối ưu hóa Spark job, Tungsten cải thiện quá trình như thực thi. Tungsten tập trung vào kiến trúc phần cứng của nền tảng mà Apache Spark chạy trên đó.

b. Phân tích tại thời điểm biên dịch

Sử dụng Dataset, chúng ta có thể kiểm tra cú pháp và phân tích tại thời điểm biên dịch. Điều này không thể thực hiện bằng Dataframe, RDD hoặc các truy vấn SQL thông thường.

c. Lưu trữ bền vững

Dataset trong Spark có thể được lưu trữ cả ở dạng serializable và có thể truy vấn được. Do đó, chúng ta có thể lưu trữ nó vào bộ nhớ lưu trữ

d. Chuyển đổi qua lại

Chúng ta có thể chuyển đổi Dataset với kiểu dữ liệu an toàn sang DataFrame "không có kiểu". Để thực hiện tác vụ này, Dataset cung cấp ba phương thức để chuyển đổi từ các loại Seq[T] hoặc RDD[T] sang Dataset[T]:

toDS(): Dataset[T]

toDF(): DataFrame

toDF(colNames: String*): DataFrame

e. Tính toán nhanh hơn

Thực hiện Dataset nhanh hơn cách thực hiện RDD. Điều này gia tăng hiệu xuất của hệ thống. Để đạt được hiệu xuất tương tự sử dụng RDD, người dùng phải xem xét thủ công cách biểu diễn tính toán để tối ưu hóa phân tán.

f. Tiêu thụ ít bộ nhớ hơn

Khi lưu cache, nó tạo ra bố cục tối ưu hơn. Spark biết cấu trúc dữ liệu trong Dataset.

g. API đơn cho Java và Scala

Nó cung cấp một giao diện đơn cho Java và Scala. Sự đồng nhất này đảm bảo chúng ta có thể sử dụng giao diện Scala, ví dụ mã từ cả hai ngôn ngữ. Nó cũng giảm bớt gánh nặng của các thư viện. Vì bây giờ các thư viện không cần xử lý hai loại đầu vào khác nhau nữa.  

4. Để tạo một Dataset

a. SparkSession

SparkSession là điểm vào cho SparkSQL. Đây là đối tượng đầu tiên chúng ta tạo khi phát triển ứng dụng Spark SQL sử dụng trừu tượng dữ liệu Dataset có kiểu đầy đủ. Chúng ta có thể tạo một phiên bản SparkSession bằng cách sử dụng SparkSession.Builder và có thể dừng SparkSession bằng cách sử dụng phương thức stop (spark.stop).

b. QueryExecution

Chúng ta biểu diễn quá trình thực thi truy vấn có cấu trúc của dataset bằng cách sử dụng QueryExecution. Để truy cập QueryExecution của một Dataset, chúng ta sử dụng thuộc tính QueryExecution. Bằng cách thực thi logical plan trong Spark Session, chúng ta nhận được QueryExecution.

executePlan(plan: LogicalPlan): QueryExecution

Hàm executePlan thực thi logical plan đầu vào để tạo ra một QueryExecution trong SparkSession hiện tại.

c. Encoder

Một encoder cung cấp chức năng chuyển đổi giữa biểu diễn dạng bảng và các đối tượng JVM. Sử dụng encoder, chúng ta tuần tự hóa đối tượng. Encoder tuần tự hóa đối tượng để xử lý hoặc truyền qua mạng.  
## 6.8 Kiến trúc Spark
• Một kiến trúc loại master-worker

  • Một nút trình điều khiển (driver) hoặc master node

  • Các worker node

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/606068b9-3f0d-4986-8e1c-95fcafdf40d1)

• master nodes gửi công việc cho các worker node và chỉ định chúng để lấy dữ liệu từ bộ nhớ hoặc từ đĩa cứng (hoặc từ nguồn khác như S3 hoặc HDFS)

• Chương trình Spark đầu tiên tạo một đối tượng SparkContext

  • SparkContext cho biết Spark sẽ truy cập và dùng một cụm xử lý nào và ở đâu

  • Tham số master cho một SparkContext xác định loại và kích thước của cụm xử lý sẽ được sử dụng
### 6.8.1 Các tham số master 
local -  Chạy Spark một cách cục bộ với một luồng làm việc (không có song song hóa)

local[K] - Chạy Spark một cách cục bộ với K luồng làm việc (lý tưởng là số lõi CPU)

spark://HOST:PORT - Kết nối với cụm xử lý Spark độc lập

mesos://HOST:PORT - Kết nối với cụm xử lý Mesos

yarn - Kết nối với cụm xử lý YARN
### 6.8.2 Vòng đời một Job trong Spark

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/d4b073cd-736c-4940-8d72-74a4788e6265)

•	Sử dụng spark-submit, user gửi một ứng dụng.

•	Trong spark-submit, chúng ta gọi phương thức main() mà user chỉ định. Nó cũng khởi chạy chương trình trình điều khiển (driver program).

•	Chương trình trình điều khiển yêu cầu tài nguyên từ cluster manager mà chúng ta cần để khởi chạy các executor.

•	Cluster manager khởi chạy các executor thay mặt cho chương trình trình điều khiển.

•	Quá trình trình điều khiển chạy với sự giúp đỡ của ứng dụng người dùng. Dựa trên các hành động và biến đổi trên RDD, trình điều khiển gửi công việc cho các executor dưới dạng các nhiệm vụ (tasks).

•	Các executor xử lý nhiệm vụ và gửi kết quả trở lại trình điều khiển thông qua người quản lý cụm.  

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/e01a0a4d-897c-43a0-bf29-e493eb34b8f4)

RDD Objects 

•	Xây dựng DAG của các toán tử

DAG Scheduler 

•	Chia DAG thành các giai đoạn của các tác vụ

•	Gửi từng giai đoạn và tác vụ tương ứng khi sẵn sang

Task Scheduler

•	Khởi chạy tác vụ thông qua Master

•	Thử lại các tác vụ thất bại và trì trệ

Worker 

•	Thực hiện các tác vụ

•	Lưu trữ và phục vụ các khối dữ liệu
### 6.8.3 Chạy một công việc spark trên Yarn
+ Triển khai trên cụm cluster

•	Trong chế độ Cluster, trình điều khiển Spark chạy trong ApplicationMaster trên một máy chủ trong cụm. Một quá trình đơn trong một container YARN chịu trách nhiệm cho cả việc điều khiển ứng dụng và yêu cầu tài nguyên từ YARN. Khách hàng khởi chạy ứng dụng không cần chạy trong suốt thời gian tồn tại của ứng dụng.

•	Chế độ Cluster không phù hợp cho việc sử dụng Spark tương tác. Các ứng dụng Spark yêu cầu đầu vào từ người dùng, như spark-shell và pyspark, yêu cầu trình điều khiển Spark chạy bên trong quá trình khách hàng khởi tạo ứng dụng Spark.

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/f58dea52-4a5c-41a0-a9d1-6340a02e6742)
 
+ Triển khai chế độ Client

•	Trong chế độ khách hàng, trình điều khiển Spark chạy trên máy chủ nơi công việc được gửi. ApplicationMaster chỉ chịu trách nhiệm yêu cầu container thực thi từ YARN. Sau khi các container khởi động, khách hàng truyền thông với các container để lập lịch công việc.

 ![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/2867d945-3e81-49e7-9ea6-184cf1b94d71)

## 6.9 Hạn chế của Spark
a. Không hỗ trợ xử lý thời gian thực

Đối với Spark, xử lý gần thời gian thực chỉ tạm thời diễn ra trong Spark Streaming. Điều này có nghĩa là Spark không được coi là một hệ thống xử lý thời gian thực hoàn toàn.

b. Vấn đề với các tệp nhỏ

Trong RDD, mỗi tệp được chia thành các phân vùng nhỏ. Điều này có nghĩa là có một lượng lớn các phân vùng nhỏ trong RDD. Do đó, nếu chúng ta muốn hiệu suất trong quá trình xử lý, RDDs cần được phân vùng lại thành một định dạng có thể quản lý được. Điều này đòi hỏi sử dụng phương thức tráo đổi thông qua mạng rất phức tạp.

c. Thiếu hệ thống quản lý tệp

Một vấn đề lớn là Spark không có hệ thống quản lý tệp riêng. Thực tế, Spark phụ thuộc vào một nền tảng khác như Hadoop hoặc một nền tảng trên đám mây khác.

d. Đắt đỏ

Trong khi chúng ta mong muốn xử lý dữ liệu lớn với chi phí hiệu quả, Spark lại rất đắt đỏ. Do việc giữ dữ liệu trong bộ nhớ mất rất nhiều chi phí. Bên cạnh đó, tiêu thụ bộ nhớ rất cao và không được quản lý một cách thân thiện với người dùng. Hơn nữa, chúng ta cần nhiều RAM để chạy trong bộ nhớ, do đó chi phí của Spark cao hơn nhiều.

e. Số lượng thuật toán được hỗ trợ ít

Spark MLlib chỉ có số lượng thuật toán hỗ trợ ít. Ví dụ, khoảng cách Tanimoto.

f. Tối ưu hóa thủ công

Công việc Spark phải được tối ưu hóa thủ công và phải phù hợp với các bộ dữ liệu cụ thể. Hơn nữa, để phân vùng và lưu cache trong Spark đúng đắn, chúng ta phải điều khiển nó thủ công.

g. Xử lý lặp lại

Cơ bản, dữ liệu lặp đi lặp lại theo từng lô. Mỗi lần lặp lại được lên lịch và thực thi riêng biệt.

h. Độ trễ

So sánh với Flink, Apache Spark có độ trễ cao hơn.

i. Tiêu chí cửa sổ

Spark chỉ hỗ trợ tiêu chí cửa sổ dựa trên thời gian, không hỗ trợ tiêu chí cửa sổ dựa trên bản ghi.  
