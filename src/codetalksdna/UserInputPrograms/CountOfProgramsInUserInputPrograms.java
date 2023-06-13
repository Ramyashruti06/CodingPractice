package codetalksdna.UserInputPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramsInUserInputPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\UserInputPrograms\\");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
