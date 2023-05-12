package codetalksdna.fileIO;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("name.txt");
        file.createNewFile();
    }
}
