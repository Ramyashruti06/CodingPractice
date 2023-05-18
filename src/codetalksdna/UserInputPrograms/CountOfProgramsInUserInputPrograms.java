package codetalksdna.UserInputPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInUserInputPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\UserInputPrograms\\");
        return file.listFiles().length;
    }
}
