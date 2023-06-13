package codetalksdna.ExceptionClassPrograms.CheckedException;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInCheckedExceptionClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\ExceptionClassPrograms\\CheckedException\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
