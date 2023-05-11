package codetalksdna.ArithmeticOperationsPrograms;

import java.io.File;

public class CountOfFilesInArithmeticOperations {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\ArithmeticOperationsPrograms\\");
        return file.listFiles().length;
    }
}
