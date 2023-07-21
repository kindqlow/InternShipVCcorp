package Json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JSONSerializationExample {
    public static void main(String[] args) {
        // Serialize đối tượng vào file JSON
        Data data = new Data("Alice", 25);
        serializeObjectToJson(data, "E:\\internVcc\\week3\\data.json");

        // Deserialize đối tượng từ file JSON
        Data deserializedData = deserializeJsonToObject("E:\\internVcc\\week3\\data.json");
        if (deserializedData != null) {
            System.out.println("Deserialized Object:");
            System.out.println("Name: " + deserializedData.getName());
            System.out.println("Age: " + deserializedData.getAge());
        }
    }

    // Serialize đối tượng vào file JSON
    private static void serializeObjectToJson(Data data, String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(filePath), data);
            System.out.println("Serialized Object has been saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize đối tượng từ file JSON
    private static Data deserializeJsonToObject(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File(filePath), Data.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Data {
    private String name;
    private int age;

    public Data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
