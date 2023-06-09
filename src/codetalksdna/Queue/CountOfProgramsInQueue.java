package codetalksdna.Queue;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInQueue {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\Queue\\");
        return file.listFiles().length;
    }
}
