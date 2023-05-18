package codetalksdna.IncrementDecrementOperator;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramInIncrementDecrementOperator {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\IncrementDecrementOperator\\");
        return file.listFiles().length;
    }
}
