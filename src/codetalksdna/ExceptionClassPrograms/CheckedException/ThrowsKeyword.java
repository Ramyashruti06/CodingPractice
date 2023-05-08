package codetalksdna.ExceptionClassPrograms.CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\nbhushan\\Downloads\\Shivam.pdf");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("Hey ! I Got the file !!");
    }
}
