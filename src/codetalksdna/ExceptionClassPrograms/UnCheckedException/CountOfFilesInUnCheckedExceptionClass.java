package codetalksdna.ExceptionClassPrograms.UnCheckedException;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInUnCheckedExceptionClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\ExceptionClassPrograms\\UnCheckedException\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
