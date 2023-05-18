package codetalksdna.ArithmeticOperationsPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInArithmeticOperations {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\ArithmeticOperationsPrograms\\");
        return file.listFiles().length;
    }
}
