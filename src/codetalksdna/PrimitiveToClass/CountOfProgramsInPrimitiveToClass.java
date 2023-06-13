package codetalksdna.PrimitiveToClass;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInPrimitiveToClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\PrimitiveToClass\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
