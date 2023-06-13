package codetalksdna.ConstructorPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInConstructor {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\ConstructorPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
