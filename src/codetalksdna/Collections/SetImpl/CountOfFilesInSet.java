package codetalksdna.Collections.SetImpl;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInSet {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\Collections\\SetImpl\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
