package codetalksdna.Collections.Queue;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInQueue {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\Collections\\Queue\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
