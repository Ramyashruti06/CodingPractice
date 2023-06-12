package codetalksdna.multithreading;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInMultithreading {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\multithreading\\");
        return file.listFiles().length;
    }
}
