package codetalksdna.fileIO;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("bhushan/output.txt");
        file.delete();

        File fileDirectory = new File("bhushan");
        fileDirectory.delete();
    }
}
