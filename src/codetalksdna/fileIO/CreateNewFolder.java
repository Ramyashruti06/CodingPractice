package codetalksdna.fileIO;

import java.io.File;
import java.io.IOException;

public class CreateNewFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("bhushan");
        file.mkdir();
        File files = new File("bhushan/output.txt");
        files.createNewFile();
    }
}
