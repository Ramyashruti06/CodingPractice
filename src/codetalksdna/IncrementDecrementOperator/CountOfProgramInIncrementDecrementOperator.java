package codetalksdna.IncrementDecrementOperator;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramInIncrementDecrementOperator {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\IncrementDecrementOperator\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
