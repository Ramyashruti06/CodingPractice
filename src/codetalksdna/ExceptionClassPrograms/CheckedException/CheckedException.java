package codetalksdna.ExceptionClassPrograms.CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            File file = new File("C:\\Users\\nbhushan\\Downloads\\Shivam.pdf");
            fis = new FileInputStream(file);
            System.out.println("Hey ! I Got the file !!");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            fis.close();
        }
    }
}
