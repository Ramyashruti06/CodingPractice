package codetalksdna.ExceptionClassPrograms.UnCheckedException;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInExceptionClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\ExceptionClassPrograms\\");
        return file.listFiles().length;
    }
}
