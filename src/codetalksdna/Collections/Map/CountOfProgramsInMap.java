package codetalksdna.Collections.Map;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInMap {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\Collections\\Map\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
