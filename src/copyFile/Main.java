package copyFile;

import copyFile.CopyFileText;

public class Main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();

        copyFileText.copyFileText("src/copyFile/sourceFile.txt", "dai.txt");
    }
}
