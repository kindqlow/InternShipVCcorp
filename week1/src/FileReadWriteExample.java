import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Đường dẫn của file
        String filePath = "E:\\internVcc\\week1\\datatext.txt";
        
        String filePath1 = "E:\\internVcc\\week1\\databinary.txt";

        // Ghi file dưới dạng binary
        writeBinaryFile(filePath1);

        // Đọc file dưới dạng binary
        readBinaryFile(filePath1);

        // Ghi file dưới dạng text
        writeTextFile(filePath);

        // Đọc file dưới dạng text
        readTextFile(filePath);
    }

    // Ghi file dưới dạng binary
    private static void writeBinaryFile(String filePath) {
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            byte[] data = { 0x48, 0x65, 0x6C, 0x6C, 0x6F }; // Dữ liệu binary
            outputStream.write(data);
            outputStream.close();
            System.out.println("Đã ghi file dưới dạng binary.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc file dưới dạng binary
    private static void readBinaryFile(String filePath) {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print(Integer.toHexString(byteRead) + " "); // In ra hex value của byte
            }
            inputStream.close();
            System.out.println("\nĐã đọc file dưới dạng binary.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi file dưới dạng text
    private static void writeTextFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String text = "Hello, world!"; // Dữ liệu text
            bufferedWriter.write(text);
            bufferedWriter.close();
            System.out.println("Đã ghi file dưới dạng text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc file dưới dạng text
    private static void readTextFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            System.out.println("Đã đọc file dưới dạng text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
