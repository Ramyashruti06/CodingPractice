package codetalksdna.AbstractionUsingAbstractClassPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInAbstractionUsingAbstractClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\AbstractionUsingAbstractClassPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
