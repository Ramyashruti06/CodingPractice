package codetalksdna.fileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {
    public static void main(String[] args) throws IOException {
        char[] chars = new char[15];
        FileReader fileReader = new FileReader("bhushan/output.txt");
        fileReader.read(chars);
        System.out.println(chars);
    }
}
