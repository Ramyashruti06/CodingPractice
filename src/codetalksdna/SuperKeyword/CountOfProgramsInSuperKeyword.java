package codetalksdna.SuperKeyword;

import java.io.File;

public class CountOfProgramsInSuperKeyword {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\AbstractionUsingAbstractClassPrograms\\");
        return file.listFiles().length;
    }
}
