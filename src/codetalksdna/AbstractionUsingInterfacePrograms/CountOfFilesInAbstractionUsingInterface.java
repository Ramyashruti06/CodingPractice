package codetalksdna.AbstractionUsingInterfacePrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInAbstractionUsingInterface {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\AbstractionUsingInterfacePrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
