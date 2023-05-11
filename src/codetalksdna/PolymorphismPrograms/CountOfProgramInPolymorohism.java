package codetalksdna.PolymorphismPrograms;

import java.io.File;

public class CountOfProgramInPolymorohism {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\PolymorphismPrograms\\");
        return file.listFiles().length;
    }
}
