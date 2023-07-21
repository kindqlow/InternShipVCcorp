package Json;

import com.google.gson.Gson;

public class GsonJsonParsingExample {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

        // Sử dụng Gson để parse JSON
        Gson gson = new Gson();
        Person person = gson.fromJson(jsonString, Person.class);

        // Truy cập vào các giá trị của đối tượng person
        String name = person.getName();
        int age = person.getAge();
        String city = person.getCity();

        // In ra các giá trị đã lấy
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}


