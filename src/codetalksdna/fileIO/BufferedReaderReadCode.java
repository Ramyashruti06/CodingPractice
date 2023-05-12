package codetalksdna.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderReadCode {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("bhushan/output.txt"));
        System.out.println(bufferedReader.readLine());
    }
}
