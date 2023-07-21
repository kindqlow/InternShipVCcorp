package Exception;

public class UncheckedException {
    public static void main(String[] args) {
    	int[] numbers = {1, 2, 3};
        try {    
            int result = numbers[5]; // Lỗi ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index: " + e.getMessage());
        }
        finally {
        	System.out.println("Can't access number index more than " + numbers.length);
        }           
    }
}

