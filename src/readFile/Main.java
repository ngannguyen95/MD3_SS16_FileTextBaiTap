package readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào đường dẫn : ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        readFile(path);
    }
    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc có lỗi");
        }
    }

}
