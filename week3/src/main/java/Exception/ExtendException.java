package Exception;


//Lớp cha chứa Checked Exception
class Shape {
 // Phương thức khai báo ném Checked Exception (Exception)
 public void draw() throws Exception {
     throw new Exception("Error while drawing the shape");
 }
}

//Lớp con thứ nhất kế thừa từ lớp cha
class Circle extends Shape {
// public void draw() { 
//     System.out.println("Draw the Circle");
// }
}

//Lớp con thứ hai kế thừa từ lớp cha
class Triangle extends Shape {
 public void draw() {
	 System.out.println("Draw the Triangle");
 }
}

public class ExtendException {
 public static void main(String[] args) {
     Shape circle = new Circle();
     Shape triangle = new Triangle();

     try {
         // Gọi phương thức của lớp con Circle
         circle.draw();
     } catch (Exception e) {
         System.out.println("Error in Circle: " + e.getMessage());
     }

     try {
         // Gọi phương thức của lớp con Triangle
         triangle.draw();
     } catch (Exception e) {
         System.out.println("Error in Triangle: " + e.getMessage());
     }
 }
}