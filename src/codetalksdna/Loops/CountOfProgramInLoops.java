package codetalksdna.Loops;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramInLoops {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\Loops\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
