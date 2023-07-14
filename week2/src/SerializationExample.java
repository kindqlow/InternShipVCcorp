//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class Person implements Serializable{
//	private String name;
//	private int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//}
//
//public class SerializationExample {
//	public static void main(String[] args) {
//		//Tạo một đối tượng Person
//		Person person = new Person("John Doe", 30);
//		
//		//Serializa đối tượng
//		try {
//			FileOutputStream fileOut = new FileOutputStream("E:\\internVcc\\week2\\persion.txt");
//			ObjectOutputStream out = new ObjectOutputStream(fileOut);
//			out.writeObject(person);
//			fileOut.close();
//			System.out.println("Serialize và lưu thành công");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//Deserialize đối tượng
//		Person deserializedPerson = null;
//		try {
//			FileInputStream fileIn = new FileInputStream("E:\\internVcc\\week2\\persion.txt");
//			ObjectInputStream in = new ObjectInputStream(fileIn);
//			deserializedPerson = (Person) in.readObject();
//			in.close();
//			fileIn.close();
//		} catch (IOException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		// Kiểm tra deserialize thành công
//		if (deserializedPerson != null) {
//			System.out.println("Tên: " + deserializedPerson.getName());
//			System.out.println("Tuổi: " + deserializedPerson.getAge());
//		}
//	}
//}
//
import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // Serialize đối tượng thành file
        serializeObject("E:\\internVcc\\week2\\data.ser");

        // Deserialize đối tượng từ file
        Object obj = deserializeObject("E:\\internVcc\\week2\\data.ser");
        if (obj != null) {
            Data data = (Data) obj;
            System.out.println("Deserialized Object:");
            System.out.println("Name: " + data.getName());
            System.out.println("Age: " + data.getAge());
        }
    }

    // Serialize đối tượng thành file
    private static void serializeObject(String filePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            Data data = new Data("Alice", 25); // Đối tượng cần serialize
            objectOut.writeObject(data);
            objectOut.close();
            fileOut.close();
            System.out.println("Serialized Object has been saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize đối tượng từ file
    private static Object deserializeObject(String filePath) {
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject(); // Đối tượng được deserialize
            objectIn.close();
            fileIn.close();
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Data implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
