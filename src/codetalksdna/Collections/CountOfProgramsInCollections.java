package codetalksdna.Collections;

import java.io.File;

public class CountOfProgramsInCollections {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\Collections\\");
        return file.listFiles().length;
    }
}
