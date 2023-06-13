package codetalksdna.EncapsulationPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInEncapsulation {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\EncapsulationPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
