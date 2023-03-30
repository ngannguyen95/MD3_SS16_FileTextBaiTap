package copyFile;

import java.io.*;

public class CopyFileText {

    public void copyFileText(String sourceFile, String targetFile) {
        try {
            // đọc file đầu vào theo đường dẫn
            File sourceF = new File(sourceFile);
            //đọc file đích theo nguồn dẫn
            File targetF = new File(targetFile);
            // kiểm tra xem tệp nguồn có tồn tại không , và tệp đích có tồn tại không
            if (!sourceF.exists() || targetF.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter =new FileWriter(targetFile);
            FileReader fileReader = new FileReader(sourceF);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                fileWriter.write(line + "\r");
            }
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("Tệp nguồn không tồn tại hoặc tệp đích đã tồn tại");
        }

    }
}
