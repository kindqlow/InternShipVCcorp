Báo cáo bổ sung cho tuần 5_6
# Q1: Rack trong hdfs là gì?
   + Một rack trong Hadoop là tập hợp các DataNode (khoảng 30-50 nút dữ liệu) được kết nối bằng cùng một switch mạng. Nếu mạng gặp sự cố, toàn bộ rack sẽ không khả dụng. Một cụm Hadoop lớn được triển khai trong nhiều rack khác nhau.
   + Trong một cụm Hadoop lớn, có nhiều rack. Mỗi rack bao gồm các DataNode. Giao tiếp giữa các DataNode trên cùng một rack hiệu quả hơn so với giao tiếp giữa các DataNode ở các rack khác nhau.
   + Để giảm lưu lượng mạng trong quá trình đọc/ghi tệp tin, NameNode chọn DataNode gần nhất để phục vụ yêu cầu đọc/ghi của client. NameNode duy trì thông tin về rack của mỗi DataNode để đạt được thông tin rack này.
# Q2: Block report là gì?
 + Trong Hadoop, dữ liệu được lưu trữ dưới dạng các khối. Báo cáo khối là một báo cáo chứa thông tin về các khối dữ liệu được lưu trữ trên DataNode.
 + Mỗi DataNode trong một cụm Hadoop định kỳ gửi một báo cáo khối đến NameNode, chứa thông tin như ID khối, độ dài của khối và vị trí của khối
# Q3 Tại sao kích thước một block là 128MB ?
Không có kích thước block phù hợp với mọi dữ liệu mà chỉ có tính chất tương đối. Có vài nguyên nhân có thể kể ra như sau:
  + Để giảm chi phí tìm kiếm: Với các khối có kích thước lớn, thời gian để chuyển dữ liệu từ đĩa có thể lâu hơn so với thời gian để bắt đầu khối. Điều này dẫn đến việc chuyển nhiều khối với tốc độ chuyển đĩa.
  + Nếu khối nhỏ, sẽ có quá nhiều khối trong Hadoop HDFS và do đó có quá nhiều dữ liệu siêu dữ liệu để lưu trữ. Quản lý một số lượng khối và siêu dữ liệu lớn như vậy sẽ tạo ra công thêm và gây ra giao thông trên mạng.  
# Q4: Quá trình ghi khi client ghi đệm chưa đủ 1 block

Q6 khi nào việc ghi trong hdfs được coi là thành công?
Q7: Suffling
Q8: Nhiều key vào cùng 1 phân vùng => out phân vùng thì sao
Q9: Active RM đồng bộ standby RM ntn
Q10: Ưu nhược điểm của execution cluster & client mode:
Q11: Phép tính chỉ có thể thực hiện trên dataset mà k thể trên dataframe Transformation: narrow, wide (suffles-trao đổi giữa các partition)
Q12: Giải thích tại sao hadoop tiến hóa từ việc sử dụng secondary NameNode sang dùng standby NameNode
Q13: Giao thức Zab là  gì
