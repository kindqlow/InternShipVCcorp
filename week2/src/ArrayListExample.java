import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Tạo một đối tượng ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Duyệt qua các phần tử trong ArrayList
        for (String element : list) {
            System.out.println(element);
        }
        // Lấy phần tử ra khỏi list
        list.remove("Banana");
        for (String element : list) {
            System.out.println(element);
        }
        // truy cập phần tử thao chỉ mục
        System.out.println(list.get(1));
    }
}
