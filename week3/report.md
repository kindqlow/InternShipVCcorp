Em xin trình bày kết quả tìm hiểu và thực hiện tuần 3 của em như sau:
# 1 Exception
Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.

Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình. Một vài ngoại lệ xảy ra bởi lỗi của người dùng, một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý. Chẳng hạn như:

•	Người dùng nhập dữ liệu không hợp lệ.

•	Truy cập ngoài chỉ số mảng.

•	Một file cần được mở nhưng không thể tìm thấy.

•	Kết nối mạng bị ngắt trong quá trình thực hiện giao tiếp hoặc JVM hết bộ nhớ.

•	….
## 1.1 Checked Exception
Là loại exception xảy ra trong lúc compile time, nó cũng có thể được gọi là compile time exceptions. Loại exception này không thể bỏ qua được trong quá trình compile, bắt buộc ta phải handle nó.

Các lớp extends từ lớp Throwable ngoại trừ RuntimeException và Error được gọi là checked exception.
## 1.2 Unchecked Exception
Là loại exception xảy ra tại thời điểm thực thi chương trình, nó cũng có thể gọi là runtime exceptions đó là programming bugs, lỗi logic của chương trình… Loại exception này được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó.

Các lớp extends từ RuntimeException được gọi là unchecked exception
## 1.3 Ví dụ về Exception
### 1.3.1 Checked Exception
Em đã triển khai trong File CheckedException với ví dụ đọc file

Ở đây file nguồn không được tìm thấy nên ngoại lệ được ném ra
### 1.3.2 Unchecked Exception
Em đã triển khai trong file Unchecked Exception

Ở đây lỗi truy cập bộ nhớ được đưa ra và thông báo trong khối finally
# 2. Concurrency
## 2.1 Runnable
Em đã thực hiện viết 1 luồng chạy ngầm kế thừa Runnable sử dụng java trong file MultiThreadExample
## 2.2 Threadpool
Em đã viết chương trình sử dụng threadpool bằng ngôn ngữ java trong file 

Trong ví dụ trên, em đã sử dụng newFixedThreadPool(poolSize) để tạo một thread pool với kích thước được chỉ định. Sau đó, em đã thêm 10 công việc vào thread pool bằng cách tạo các WorkerThread và thực hiện chúng bằng execute(worker). Cuối cùng, đợi tất cả các công việc trong pool hoàn thành bằng cách sử dụng shutdown() và isTerminated().
## 2.3 Lock 
Trong Java, Lock là một cơ chế đồng bộ hóa mạnh mẽ hơn so với synchronized block. Lock cung cấp khả năng kiểm soát truy cập vào các phần tài nguyên được chia sẻ giữa các luồng thực thi. Bằng cách sử dụng Lock, có thể tạo ra các khu vực "đoạn mã được khóa" để chỉ cho một luồng thực thi duy nhất có quyền thực hiện đoạn mã này tại một thời điểm.

Các đặc điểm và tính năng quan trọng của Lock trong Java bao gồm:

•	Khả năng bất đồng bộ (Non-blocking): Lock cho phép bạn thực hiện các thao tác bất đồng bộ khi cố gắng giành giữ lock. Điều này nghĩa là nếu một luồng không thể giành giữ lock ngay lập tức, nó có thể tiếp tục thực hiện các công việc khác thay vì bị chặn (như trong synchronized block).

•	Thời gian chờ (Timeout): Lock cung cấp cơ chế thời gian chờ khi cố gắng giành giữ lock. Bạn có thể thiết lập thời gian tối đa mà một luồng có thể chờ để giành giữ lock. Nếu lock không được giành giữ trong khoảng thời gian này, luồng có thể tiếp tục thực hiện các công việc khác hoặc thực hiện hành động thay thế.

•	Fairness (Công bằng): Lock hỗ trợ cơ chế "fairness" để đảm bảo các luồng được lựa chọn thực thi theo thứ tự yêu cầu lock. Điều này giúp tránh hiện tượng "starvation", trong đó một số luồng luôn bị ưu tiên và các luồng khác bị chặn mãi mãi.

•	Multiple Conditions (Điều kiện đa dạng): Lock hỗ trợ nhiều điều kiện (Conditions), cho phép bạn tạo ra nhiều điều kiện cho các luồng thực thi đồng bộ hóa và quản lý chúng một cách hiệu quả.

Em đã thực hiện minh họa trong file BankTransactionExample
## 2.4 AtomicInteger
AtomicInteger là một lớp trong Java thuộc gói java.util.concurrent.atomic, được sử dụng để thực hiện các hoạt động trên một biến nguyên (integer) một cách nguyên tử (atomic). Các hoạt động atomic là những hoạt động mà không có hai luồng nào cùng thực hiện cùng một lúc, điều này đảm bảo tính đồng bộ và an toàn trong môi trường đa luồng. AtomicInteger giúp đơn giản hóa hoạt động atomic bằng cách cung cấp các phương thức đã được đồng bộ hóa sẵn.

Em đã thực hiện minh họa trong file AtomicCounterExample
## 2.5 ConcurrentHashMap
ConcurrentHashMap là một lớp trong Java thuộc gói java.util.concurrent, cung cấp một cấu trúc dữ liệu bảo mật đồng thời cho các tác vụ thêm, sửa đổi và xóa dữ liệu từ nhiều luồng một cách an toàn. ConcurrentHashMap thường được sử dụng trong các tình huống yêu cầu truy cập đồng thời từ nhiều luồng mà không cần đồng bộ hóa bằng synchronized hoặc Lock.

Một số đặc điểm và tính năng quan trọng của ConcurrentHashMap bao gồm:

•	Thao tác đồng thời an toàn: ConcurrentHashMap cho phép nhiều luồng truy cập đồng thời mà không làm hỏng cấu trúc dữ liệu hoặc gây ra các vấn đề đồng thời.

•	Phân chia khóa (Segmentation): ConcurrentHashMap chia các khóa vào nhiều phân đoạn (segment) để giảm thiểu việc cần đồng bộ hóa toàn bộ dữ liệu. Mỗi phân đoạn có thể được khóa độc lập, cho phép nhiều luồng thực hiện truy cập đồng thời mà không ảnh hưởng đến các phân đoạn khác.

•	Hỗ trợ thao tác không ghi đè (Read-Write): ConcurrentHashMap hỗ trợ các thao tác đọc (get) mà không ghi đè. Nhiều luồng có thể đọc từ bản sao của dữ liệu mà không cần đồng bộ hóa, do đó cải thiện hiệu suất đọc dữ liệu.

•	Phạm vi đồng bộ hóa cở sở: Thay vì đồng bộ hóa toàn bộ dữ liệu như synchronized hoặc Lock, ConcurrentHashMap cho phép đồng bộ hóa chỉ ở cấp độ phân đoạn, giúp tối ưu hiệu suất khi nhiều luồng truy cập vào các khóa khác nhau.
## 2.6 SafeThread, UnsafeThread,  DaemonThread
### 2.6.1 SafeThread
Thread safety là một tính chất của một đoạn mã (hoặc một lớp) đảm bảo rằng nó có thể được sử dụng đồng thời bởi nhiều luồng mà không gây ra lỗi hoặc xung đột dữ liệu. Khi nhiều luồng truy cập và sửa đổi dữ liệu cùng một lúc, có thể xảy ra các tình huống không mong muốn như đọc/ghi dữ liệu không đồng nhất, race condition (đua nhau), deadlock (kẹt luồng), và các vấn đề bảo mật khác.

Em đã triển khai ví dụ trong file ThreadSafetyExample
### 2.6.2 UnsafeThread
Ngược lại với SafeThread trong lập trình đa luồng, một tình huống được coi là không an toàn khi một hoặc nhiều luồng cùng truy cập và thay đổi dữ liệu chia sẻ mà không có bất kỳ bảo đảm đồng bộ nào.
### 2.6.3 Deamon Thread
Trong Java, một "daemon thread" là một loại luồng (thread) chạy trong nền mà không ngăn chặn quá trình thoát của chương trình. Nó tồn tại để hỗ trợ các luồng chính (main threads) và sẽ dừng khi tất cả các luồng chính dừng.

Em đã thực hiện ví dụ trong file DaemonThreadExample
# 3 Json
## 3.1 Json là gì
JSON (JavaScript Object Notation) là một định dạng dữ liệu phổ biến được sử dụng để truyền và trao đổi dữ liệu giữa các ứng dụng web và phần mềm. Nó là một dạng dữ liệu dựa trên văn bản, dễ đọc và dễ viết cho con người, và dễ dàng phân tích cú pháp và xử lý bởi các ngôn ngữ lập trình.

Đặc điểm chính của JSON bao gồm:

•	Dạng dữ liệu key-value: JSON dựa trên cấu trúc key-value, tương tự như các đối tượng trong các ngôn ngữ lập trình khác như JavaScript, Python, Java, v.v. Mỗi cặp key-value trong JSON được phân tách bằng dấu hai chấm (:) và các cặp được phân tách bằng dấu phẩy (,).

•	Các kiểu dữ liệu hỗ trợ: JSON hỗ trợ một số kiểu dữ liệu cơ bản bao gồm chuỗi ký tự (string), số (number), boolean (true hoặc false), mảng (array) và đối tượng (object). JSON không hỗ trợ các kiểu dữ liệu như ngày tháng hay hàm.

•	Cú pháp đơn giản: JSON sử dụng cú pháp đơn giản, cho phép dễ dàng đọc và viết bởi con người và các chương trình.

•	Không phụ thuộc vào ngôn ngữ: JSON là một định dạng dữ liệu độc lập với ngôn ngữ, có nghĩa là các ứng dụng được viết bằng các ngôn ngữ lập trình khác nhau có thể hiểu và sử dụng JSON một cách dễ dàng.

•	Dữ liệu lồng nhau: JSON cho phép lồng các đối tượng hoặc mảng vào trong nhau, tạo thành cấu trúc phức tạp hơn cho việc biểu diễn dữ liệu.
## 3.2 Java parse json
Em đã thực hiện sử dụng java parse json, lấy giá trị, chuyển jsonobject thành string trong file GsonJsonParsingExample
## 3.3 Gson
Em đã sử dụng thư viện gson để parse trực tiếp 1 string sang 1 object tương ứng và minh họa trong file GsonJsonParsingExample
