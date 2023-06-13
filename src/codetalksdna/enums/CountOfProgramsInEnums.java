package codetalksdna.enums;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInEnums {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\multithreading\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
