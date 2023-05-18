package codetalksdna.Loops;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramInLoops {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\Loops\\");
        return file.listFiles().length;
    }
}
