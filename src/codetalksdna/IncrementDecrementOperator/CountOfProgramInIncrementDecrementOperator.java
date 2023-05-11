package codetalksdna.IncrementDecrementOperator;

import java.io.File;

public class CountOfProgramInIncrementDecrementOperator {
    public int returnFileCount() {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\IncrementDecrementOperator\\");
        return file.listFiles().length;
    }
}
