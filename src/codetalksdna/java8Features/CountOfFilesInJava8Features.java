package codetalksdna.java8Features;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInJava8Features {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\java8Features\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
