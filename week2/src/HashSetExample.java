import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Tạo một đối tượng HashSet
        HashSet<String> set = new HashSet<>();

        // Thêm các phần tử vào HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Phần tử trùng lặp, sẽ không được thêm vào

        // Duyệt qua các phần tử trong HashSet
        for (String element : set) {
            System.out.println(element);
        }
        // Kích thước Set
        int size = set.size();
        System.out.println("Size of HashSet: " + size);
        
        // Kiểm tra tồn tại
        boolean containsOrange = set.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

    }
}
