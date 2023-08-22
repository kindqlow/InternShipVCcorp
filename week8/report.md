# 1. Shell Linux
## 1.1 Tổng quan
Shell Linux là một giao diện dòng lệnh trong hệ điều hành Linux, cho phép người dùng tương tác với hệ thống bằng cách gõ lệnh và nhận kết quả tương ứng. Shell hỗ trợ nhiều tính năng như: 
   + Thực thi lệnh
   + Quản lý tập tin và thư mục
   + Các tính năng như biến môi trường, cấu trúc điều khiển, chuyển hướng đầu vào/đầu ra, kết nối lệnh thông qua pipe
   + Viết script để tự động hóa các tác vụ. 
   + Giúp người dùng khai thác được sức mạnh và linh hoạt của dòng lệnh trong hệ điều hành Linux.  
## 1.2 Lịch sử
   + Shell Linux bắt đầu từ việc phát triển các shell trong hệ điều hành Unix. Shell Bourne (sh) là shell đầu tiên và đã trở thành tiêu chuẩn trong các phiên bản Linux Unix. Shell C (csh) và shell Korn (ksh) cũng được phát triển và trở nên phổ biến trong thập kỷ 1980. Trong những năm 1990, shell Bash (Bourne Again Shell) được phát triển và trở thành một shell mạnh mẽ và phổ biến trong hệ điều hành Linux.   
   + Ngoài ra, còn có các loại shell khác như Zsh, fish shell và csh/tcsh. Shell Linux đóng vai trò quan trọng trong việc tương tác dòng lệnh và viết script, giúp người dùng tận dụng sức mạnh của hệ điều hành Linux.  
## 1.3 Các command căn bản
- cd: lệnh để chuyển đến thư mục làm việc mong muốn
- ls: Liệt kê danh sách file và thư mục có trong thư mục hiện tại
- cp: Copy nội dung file và thư mục trong phần tham số
- mv: Di chuyển file đến vị trí mong muốn, đổi tên file nếu trong cùng thư mục
- mkdir: Lệnh tạo thư mục mới
- cat: Hiển thị nội dung file 
- head: hiển thị số dòng chỉ định trong nội dung file
## 1.4 Các command liên quan đến quyền
- chmod: Dùng để thay đổi quyền truy cập vào tập tin hoặc thư mục
- chown: Thay đổi chủ sở hữu của tập tin và thư mục
- ls –l: Hiển thị chi tiết danh sách file và thư mục có trong file bao gồm các thông tin về quyền truy cập, chủ sở hữu, nhóm, kích thước, thời gian chỉnh sửa 
## 1.5 Các command thực hiện song song
Sử dụng ký tự “ | “ giữa 2 lệnh để thực hiện như là một toán tử đường ống. Đầu ra của lệnh trước đó được lấy làm đầu vào cho lệnh tiếp theo
- wc: đếm sô dòng, số từ, số ký tự trong một file, wc –l chỉ đếm số dòng
- grep: thực hiện tìm kiếm chuỗi ký tự và hiển thị những dòn chứa cụm đó trong file
- echo thực hiện ghi dữ liệu vào file chỉ định
## 1.6 Sử dụng vim
Vim là một trình soạn thảo văn bản mạnh mẽ và nhỏ gọn trong Linux. Nó được phát triển từ trình soạn thảo vi trong Unix và đi kèm với hầu hết các phiên bản Linux. Vim có giao diện dòng lệnh và giao diện đồ họa. Nó cung cấp các tính năng như chế độ chỉnh sửa và chế độ xem, cú pháp kiểm tra và tô màu, lưu trữ và khôi phục phiên làm việc. Vim được sử dụng phổ biến trong việc chỉnh sửa tập tin văn bản, lập trình và quản lý tệp tin.  
Sử dụng lệnh vim để tiến hành tạo file hoặc thực hiện truy hập vào nội dung file để sửa đổi.
 - :w để lưu tác vụ sửa đổi. 
- :q để thoát tác vụ 
- :q! để thoát tác vụ mà không thay đổi nội dụng file.
## 1.7 Lệnh quản lý tiến trình 
htop là một công cụ quản lý tiến trình dòng lệnh cho hệ điều hành Linux. Nó hiển thị danh sách các tiến trình và thông tin về tài nguyên chúng đang sử dụng như CPU, bộ nhớ và băng thông mạng. Htop có giao diện sắp xếp dễ nhìn và hỗ trợ các tính năng như tìm kiếm, sắp xếp và theo dõi tiến trình. Điều này giúp htop trở thành một công cụ hữu ích cho giám sát và quản lý tiến trình trên Linux.  
- htop để thực hiện hiển thị các tiến trình đang chạy, tài nguyên sử dụng và tương tác với chúng
- ps aux: Cung cấp thông tin chi tiết về các tiến trình đang chạy bao gồm danh sách tiến trình, ID, tệp thực thi, người dùng,…
- kill -9: Lệnh thực hiện cưỡng chế dừng hoạt động của một tiến trình kể cả khi công việc của tiến trình chưa thực hiện được
# 2 Docker
## 2.1 Tổng quan
Docker là một nền tảng mã nguồn mở cho phát triển, vận chuyển và chạy ứng dụng. Bằng cách sử dụng Docker, có thể tách lớp ứng dụng ra khỏi hạ tầng và triển khai chúng một cách nhanh chóng. Điều này giúp quản lý hạ tầng và ứng dụng dễ dàng hơn. 
## 2.2 Chức năng
Docker có thể dùng để  thực hiện các công việc sau:
   + Docker giúp phát triển và triển khai ứng dụng nhanh chóng và nhất quán bằng cách sử dụng các container địa phương, đồng thời hỗ trợ quy trình CI/CD.
   + Với Docker, có thể di chuyển và tỷ lệ mở rộng ứng dụng dễ dàng trên nhiều môi trường như máy tính cá nhân, máy chủ vật lý hoặc ảo, đám mây hoặc môi trường kết hợp.
   + Docker cho phép chạy nhiều công việc trên cùng phần cứng một cách linh hoạt và hiệu quả, giúp tiết kiệm tài nguyên và chi phí.
## 2.3 Kiến trúc

![image](https://github.com/kindqlow/internshipVccorp/assets/104091319/cd906f68-3799-4743-82a7-7fb5e212411b)

### 2.3.1 Kiến trúc Docker
+ Docker sử dụng một kiến trúc client-server.
+ Docker client trò chuyện với Docker daemon, làm nhiệm vụ xây dựng, chạy và phân phối các container Docker.
+ Docker client và daemon có thể chạy trên cùng một hệ thống hoặc có thể kết nối từ xa.
+ Docker client và daemon giao tiếp sử dụng REST API, qua socket UNIX hoặc giao diện mạng.
+  Một client Docker khác là Docker Compose, cho phép làm việc với các ứng dụng bao gồm một tập hợp các container.
Sơ đồ kiến trúc Docker
 
### 2.3.2 Daemon Docker
+ Daemon Docker (dockerd) lắng nghe các yêu cầu Docker API và quản lý các đối tượng Docker như images, container, networks và volumes. Một daemon cũng có thể truyền thông với các daemon khác để quản lý các dịch vụ Docker.
### 2.3.3 Client Docker
+ Client Docker (docker) là cách chính mà nhiều người dùng Docker tương tác với Docker. Khi sử dụng các lệnh như docker run, client gửi các lệnh này tới dockerd, và dockerd thực hiện chúng. Lệnh docker sử dụng Docker API. Client Docker có thể kết nối với nhiều daemon.
### 2.3.4 Docker Desktop
+ Docker Desktop là một ứng dụng dễ cài đặt cho môi trường Mac, Windows hoặc Linux, cho phép xây dựng và chia sẻ các ứng dụng và dịch vụ được đóng gói thành container. Docker Desktop bao gồm Docker daemon (dockerd), Docker client (docker), Docker Compose, Docker Content Trust, Kubernetes và Credential Helper.
### 2.3.5 Docker registries
+ Docker registry lưu trữ các Docker images. Docker Hub là một registry công cộng mà ai cũng có thể sử dụng, và Docker mặc định tìm kiếm images trên Docker Hub. Cũng có thể chạy một registry riêng.

+ Khi sử dụng lệnh docker pull hoặc docker run, Docker tải các image cần thiết từ registry đã được cấu hình. Khi sử dụng lệnh docker push, Docker đẩy image lên registry đã được cấu hình.  
### 2.3.6 Docker Object
Các đối tượng Docker là các thành phần quan trọng khi sử dụng Docker. Có những đối tượng chính như images và containers.
+ Images là các mẫu chỉ đọc để tạo ra các containers. Chúng được xây dựng từ các images khác, có thể tùy chỉnh bổ sung theo nhu cầu. Để tạo một image riêng, ta sử dụng một Dockerfile chứa các bước cần thiết để tạo ra image. Mỗi bước tạo ra một layer trong image, giúp image trở nên nhẹ và nhanh hơn.

+ Containers là phiên bản chạy của các image. Ta có thể tạo, khởi động, dừng, di chuyển và xóa containers. Containers có thể được kết nối với mạng và lưu trữ, và dễ dàng tạo ra các image mới dựa trên trạng thái hiện tại của container. Mỗi container được xác định bởi image và các tùy chọn cấu hình.

+ Ngoài images và containers, Docker còn có các đối tượng khác như network, volume và plugin. Chúng giúp quản lý cách container giao tiếp với môi trường bên ngoài và chia sẻ dữ liệu.  
### 2.3.7 Công nghệ cơ bản
+ Docker được viết bằng ngôn ngữ lập trình Go và tận dụng nhiều tính năng của nhân Linux để cung cấp các chức năng của nó. Docker sử dụng một công nghệ được gọi là namespaces để cung cấp không gian làm việc cách ly được gọi là container.
+ Khi chạy một container, Docker tạo ra một tập hợp các namespaces cho container đó. Các namespaces này cung cấp một lớp cách ly. Mỗi mặt của một container chạy trong một namespace riêng biệt và quyền truy cập của nó chỉ giới hạn trong namespace đó.  

