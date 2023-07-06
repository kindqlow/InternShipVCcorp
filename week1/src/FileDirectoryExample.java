import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDirectoryExample {
    public static void main(String[] args) {
        // Đường dẫn của thư mục
        String directoryPath = "E:\\internVcc\\week1";

        // Liệt kê các file trong thư mục
        listFilesInDirectory(directoryPath);

        // Đọc nội dung của file
        String filePath = "E:\\internVcc\\week1\\datatext.txt";
        readFileContent(filePath);
        String filePath1 = "E:\\internVcc\\week1\\databinary.txt";
        readFileContent(filePath1);
    }

    // Liệt kê các file trong thư mục
    private static void listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            System.out.println("Các file trong thư mục:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }
    }

    // Đọc nội dung của file
    private static void readFileContent(String filePath) {
        try {
            Path path = Paths.get(filePath);
            String content = Files.readString(path);
            System.out.println("Nội dung của file:");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
