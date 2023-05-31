package codetalksdna.CodingPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInCodingPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\CodingPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
