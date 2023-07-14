import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Tạo một đối tượng HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // Thêm các cặp khóa-giá trị vào HashMap
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 95);

        // Lấy giá trị tương ứng với một khóa
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);
        
        // Duyệt qua các phần tử trong map
        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        
        // Kiểm tra sự tồn tại của một khóa
        boolean containsAlice = scores.containsKey("Alice");
        System.out.println("Contains Alice? " + containsAlice);

    
    }
}
