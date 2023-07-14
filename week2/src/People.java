import java.util.HashSet;
import java.util.Objects;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        People person = (People) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        HashSet<People> people = new HashSet<>();

        People person1 = new People("Alice", 25);
        People person2 = new People("Bob", 30);
        People person3 = new People("Alice", 25); // Đối tượng trùng lặp

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println("Number of people: " + people.size()); // Kết quả: 2
    }
}
