package codetalksdna.Loops;

import java.io.File;

public class CountOfProgramInLoops {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\Loops\\");
        return file.listFiles().length;
    }
}
