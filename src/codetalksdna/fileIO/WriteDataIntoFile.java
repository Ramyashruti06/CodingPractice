package codetalksdna.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("bhushan/output.txt");
        fileWriter.write("welcome to Java");
        fileWriter.close();
    }
}
