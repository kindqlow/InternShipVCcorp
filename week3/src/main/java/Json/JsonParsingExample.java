package Json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonParsingExample {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

        // Parse JSON thành JsonObject
        JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);

        // Lấy giá trị từ JsonObject
        String name = jsonObject.get("name").getAsString();
        int age = jsonObject.get("age").getAsInt();
        String city = jsonObject.get("city").getAsString();

        // In ra các giá trị đã lấy
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Chuyển JsonObject thành chuỗi
        String jsonOutput = jsonObject.toString();
        System.out.println("JsonObject sau khi chuyển thành chuỗi: " + jsonOutput);
    }
}

