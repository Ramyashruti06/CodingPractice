package codetalksdna.fileIO;

import java.io.File;

public class CountOfFilesInFileIO {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\fileIO\\");
        return file.listFiles().length;
    }
}
