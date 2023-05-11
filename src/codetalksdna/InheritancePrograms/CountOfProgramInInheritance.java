package codetalksdna.InheritancePrograms;

import java.io.File;

public class CountOfProgramInInheritance {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\InheritancePrograms\\");
        return file.listFiles().length;
    }
}
