Em xin báo cáo nhiệm vụ tuần 2 như sau:

# 2.1. Collection(s)

## Về HashMap, HashSet, ArrayList
Các cấu trúc dữ liệu HashMap, HashSet và ArrayList là các cấu trúc dữ liệu phổ biến trong Java và cung cấp các phương thức để lưu trữ và quản lý dữ liệu.

### HashMap:

•	HashMap là một cấu trúc dữ liệu dựa trên khóa-giá trị trong Java.

•	Nó lưu trữ các cặp khóa-giá trị, trong đó mỗi khóa là duy nhất trong HashMap.

•	HashMap cho phép tìm kiếm, chèn và xóa các cặp khóa-giá trị trong thời gian gần như là hằng số (O(1)).

•	Phương thức quan trọng của HashMap bao gồm put(), get(), remove(), containsKey(), và keySet().

### HashSet:

•	HashSet là một cấu trúc dữ liệu dựa trên tập hợp trong Java.

•	Nó lưu trữ các phần tử duy nhất, không có thứ tự cụ thể.

•	HashSet cung cấp thời gian truy cập, chèn và xóa gần như là hằng số (O(1)).

•	Các phương thức quan trọng của HashSet bao gồm add(), remove(), contains() và size().

### ArrayList:

•	ArrayList là một cấu trúc dữ liệu dựa trên mảng có thể thay đổi kích thước trong Java.

•	Nó lưu trữ các phần tử theo thứ tự trong danh sách và cho phép truy cập ngẫu nhiên theo chỉ số.

•	ArrayList cung cấp thời gian truy cập và cập nhật O(1) cho các phần tử dựa trên chỉ số.

•	Một số phương thức quan trọng của ArrayList bao gồm add(), get(), set(), remove() và size().

### So sánh:

D: Duplicate elements is allowed? (phần tử trùng lặp)

O: Elements are ordered? (Có thứ tự)

S: Elements are sorted? (Sắp xếp thứ tự)

TS: The collection is thread-safe (cấu trúc dữ liệu hoặc lớp có thể an toàn sử dụng đồng thời bởi nhiều luồng (threads) mà không gây ra các lỗi hoặc sự không nhất quán dữ liệu.)

|  Collection  |     D     |     O      |      S     |      TS    |
|--------------|-----------|------------|------------|------------|
|    HashMap   |    No     |     No     |     No     |     No     |
|    HashSet   |    No     |     No     |     No     |     No     |
|   ArrayList  |    Yes    |     Yes    |     No     |     No     | 

## Về hashcode, equals
Khái niệm hashcode và equals liên quan chặt chẽ đến việc xác định tính duy nhất của các phần tử trong một Set, như HashSet.

### Phương thức hashCode():

- Phương thức hashCode() được định nghĩa trong lớp Object và trả về một giá trị số nguyên (hash code) đại diện cho đối tượng.

- Hash code là một số được tính toán dựa trên nội dung của đối tượng.

- Các đối tượng khác nhau có thể có cùng một hash code, nhưng cùng một đối tượng luôn có cùng một hash code.

- Trong một Set, hash code được sử dụng để xác định vị trí lưu trữ và tìm kiếm nhanh chóng.

### Phương thức equals():

- Phương thức equals(Object obj) được định nghĩa trong lớp Object và kiểm tra xem đối tượng hiện tại có bằng với đối tượng khác không.

- Phương thức equals() được sử dụng để so sánh tính bằng nhau của hai đối tượng.

- Phương thức equals() phải tuân thủ các quy tắc sau:

- Phải là phép so sánh đối xứng: a.equals(b) phải cho kết quả tương tự như b.equals(a).

- Không được tham chiếu đến null: a.equals(null) phải trả về false.

- Phải tuân thủ quy tắc tính chuẩn: Nếu hai đối tượng a và b bằng nhau (a.equals(b) trả về true), thì giá trị của phương thức hashCode() phải giống nhau.

## Thực hiện
### HashMap, HashSet, ArrayList
Em đã minh họa trong các file HashMapExample, HashSetExample, ArrayListExample
### hashCode và equals
Em đã thực hiện minh họa trong lớp Person

•	Lớp People: Lớp này đại diện cho một đối tượng "người" với hai thuộc tính là name (tên) và age (tuổi). Lớp này triển khai hai phương thức hashCode() và equals().

•	Phương thức hashCode():

+ Phương thức hashCode() được sử dụng để tính toán giá trị băm (hash code) của một đối tượng People. Giá trị băm này được sử dụng bởi cấu trúc dữ liệu HashSet để xác định vị trí lưu trữ của các phần tử trong bộ nhớ.

+ Trong đoạn mã, phương thức hashCode() sử dụng phương thức Objects.hash() để tính toán giá trị băm dựa trên thuộc tính name và age của đối tượng People.
    
+ Việc tính toán giá trị băm như vậy đảm bảo rằng hai đối tượng People có cùng giá trị name và age sẽ có cùng giá trị băm, từ đó giúp cải thiện hiệu suất khi tìm kiếm và so sánh trong HashSet.

•	Phương thức equals():

+ Phương thức equals() được sử dụng để so sánh hai đối tượng People để xác định xem chúng có tương đương nhau hay không.

+ Trong đoạn mã, phương thức equals() so sánh hai đối tượng People dựa trên các điều kiện sau:
    
+ Kiểm tra xem hai đối tượng có cùng tham chiếu không (this == obj). Nếu có, nghĩa là hai đối tượng đang được so sánh là cùng một đối tượng và trả về true.
    
+ Kiểm tra xem đối tượng obj có là null hoặc không thuộc lớp People hay không. Nếu đúng, phương thức trả về false.
    
+ Kiểm tra xem giá trị của thuộc tính name và age của hai đối tượng có bằng nhau hay không, sử dụng phương thức Objects.equals(). Nếu cả hai thuộc tính đều bằng nhau, phương thức trả về true, ngược lại trả về false.

•	Phương thức equals() được sử dụng bởi cấu trúc dữ liệu HashSet để kiểm tra tính duy nhất của các phần tử trong tập hợp. Nếu hai đối tượng People được coi là tương đương theo quy tắc so sánh của phương thức equals(), thì chỉ có một trong hai đối tượng được cho vào HashSet, trong khi đối tượng còn lại bị loại bỏ vì trùng lặp.

•	Phương thức main(): Phương thức này được sử dụng để chạy ví dụ. Trong phương thức này, chúng ta tạo một HashSet có tên people. Chúng ta khởi tạo ba đối tượng People với các thông tin khác nhau. Đối tượng thứ ba (person3) là một bản sao của đối tượng đầu tiên (person1) với cùng giá trị của name và age.

# 2.2. Design Pattern
Em đã đọc hiểu các DesignPattern trong Java ở trang web: https://www.tutorialspoint.com/design_pattern

Dưới đây là 3 DesignPattern em đã tham khảo ở trang web trên và trình bày lại

## Abstract Factory Pattern 
Abstract Factory Pattern là một mô hình thiết kế phần mềm thuộc nhóm Creational Pattern. Mô hình này cung cấp một cách để tạo ra các đối tượng liên quan và tương thích mà không cần chỉ định rõ các lớp cụ thể của chúng.
    
Với Abstract Factory Pattern, chúng ta có thể dễ dàng thay đổi nhà máy được sử dụng để tạo ra các sản phẩm, mà không ảnh hưởng đến mã nguồn sử dụng các sản phẩm đó. Điều này giúp tăng tính linh hoạt và khả năng mở rộng của hệ thống, đồng thời giúp chúng ta duy trì sự tương thích giữa các sản phẩm trong một nhóm logic.

Em đã triển khai Abstract Factory Pattern trong package DesignPatternAbstractFactory

Cụ thể

•	Interface Shape định nghĩa phương thức draw()

•	Các lớp RoundedRectangle, RoundedSquare, Rectangle, Square triển khai giao diện Shape

•	Lớp trừu tượng AbstractFactory định nghĩa phương thức trừu tượng getShape() để tạo ra các đối tượng của lớp Shape.

•	Các lớp RoundedShapeFactory và ShapeFactory triển khai phương thức getShape()

•	Lớp FactoryProducer tạo ra các đối tượng Factory dựa trên giá trị rounded

## Facade Pattern
Facade Pattern là một mô hình thiết kế phần mềm thuộc nhóm Structural patterns. Mô hình này cung cấp một giao diện đơn giản và thân thiện để tương tác với một hệ thống phức tạp, giúp che giấu sự phức tạp bên trong và cung cấp một điểm truy cập chung cho các chức năng của hệ thống.
    
Façade Pattern thường được sử dụng trong các hệ thống lớn và phức tạp, nơi có nhiều thành phần và tương tác phức tạp giữa chúng. Nó giúp cải thiện khả năng bảo trì, mở rộng và kiểm thử của hệ thống, đồng thời cung cấp một giao diện đơn giản và trực quan cho người sử dụng cuối.

Em đã triển khai Façade Pattern trong package DesignPatternFacade

Cụ thể

•	Interface Shape định nghĩa phương thức draw()

•	Các lớp Rectangle, Square, Circle triển khai giao diện Shape

•	Lớp ShapeMaker sử dụng các đối tượng hình (Circle, Rectangle, Square) để triển khai việc vẽ các hình khác nhau thông qua các phương thức drawCircle(), drawRectangle(), drawSquare().

## Iterator Pattern
Iterator Pattern là một mô hình thiết kế phần mềm thuộc nhóm Behavioral patterns. Mô hình này cung cấp một cách tiếp cận chuẩn hóa và đơn giản để truy cập và lặp qua các phần tử của một tập hợp mà không tiết lộ cấu trúc bên trong của tập hợp đó.

Em đã triển khai Iterator Pattern trong package DesignPatternIterator

Cụ thể 

•	Giao diện Iterator định nghĩa hai phương thức là hasNext() (kiểm tra xem liệu có phần tử tiếp theo hay không) và next() (trả về phần tử tiếp theo).

•	Giao diện Container định nghĩa phương thức getIterator() để lấy một đối tượng Iterator.

•	Lớp NameRepository triển khai giao diện Container. Lớp này chứa một mảng names[] chứa các tên. Nó triển khai phương thức getIterator() để trả về một đối tượng Iterator cụ thể là NameIterator.

•	Lớp NameIterator: Là một lớp con bên trong của NameRepository và cũng là một lớp triển khai của giao diện Iterator. Lớp này có biến index để theo dõi chỉ số của phần tử tiếp theo trong mảng names[]. Nó triển khai phương thức hasNext() để kiểm tra xem có phần tử tiếp theo hay không và phương thức next() để trả về phần tử tiếp theo trong mảng.

•	Lớp IteratorPatternDemo: Trong phương thức main(), chúng ta tạo một đối tượng NameRepository và sử dụng phương thức getIterator() để lấy một đối tượng Iterator. Sau đó, chúng ta sử dụng vòng lặp để lặp qua các phần tử trong Iterator và in ra tên tương ứng.

# 2.3. Serialize
Trong Java, serialize là quá trình chuyển đổi một đối tượng thành dạng chuỗi byte để có thể lưu trữ hoặc truyền tải đối tượng đó. Quá trình ngược lại, gọi là
deserialize, là quá trình chuyển đổi dữ liệu byte thành đối tượng ban đầu. Serializing một đối tượng cho phép lưu trữ dữ liệu và truyền tải qua mạng một cách dễ dàng.

Em đã triển khai trong file Serialization

•	Lớp Person: Lớp này triển khai giao diện Serializable và đại diện cho một đối tượng Person có hai thuộc tính là name (tên) và age (tuổi).

•	Lớp SerializationExample: Đây là lớp chính của chương trình. Nó bao gồm phương thức main() và hai phương thức hỗ trợ serializeObject() và deserializeObject().

•	Phương thức serializeObject(): Phương thức này sẽ tạo ra một đối tượng Data và serialize nó thành một file bằng cách sử dụng FileOutputStream và ObjectOutputStream.

•	Phương thức deserializeObject(): Phương thức này sẽ đọc dữ liệu từ file được serialize và deserialize nó thành một đối tượng Data bằng cách sử dụng FileInputStream và ObjectInputStream.

•	Lớp Data: Đây là lớp đại diện cho đối tượng cần serialize và deserialize. Nó cũng triển khai giao diện Serializable và có hai thuộc tính là name và age.

Trong phương thức main(), em thực hiện serialize đối tượng Data thành một file sử dụng phương thức serializeObject(). Sau đó, em thực hiện deserialize đối tượng từ file sử dụng phương thức deserializeObject(). Kết quả được hiển thị là tên và tuổi của đối tượng đã được deserialize.

Biến serialVersionUID được sử dụng để đảm bảo tính nhất quán trong quá trình Serialization và Deserialization. Khi một đối tượng được serialize thành dữ liệu byte, serialVersionUID được lưu trữ cùng với dữ liệu để xác định phiên bản của lớp được sử dụng để serialize.

Khi đọc dữ liệu và thực hiện quá trình deserialize, Java sẽ so sánh serialVersionUID của lớp đang được đọc với serialVersionUID của lớp đã được serialize trước đó. Nếu hai giá trị này không khớp, sẽ xảy ra lỗi InvalidClassException, chỉ ra rằng phiên bản lớp đã thay đổi và không tương thích với dữ liệu đã serialize trước đó.

Trong đoạn mã, serialVersionUID được đặt thành 1L, tức là phiên bản của lớp là phiên bản đầu tiên và không có sự thay đổi trong cấu trúc của lớp đã được thực hiện.
