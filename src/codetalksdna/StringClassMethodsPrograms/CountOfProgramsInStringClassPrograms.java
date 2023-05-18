package codetalksdna.StringClassMethodsPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInStringClassPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\StringClassMethodsPrograms\\");
        return file.listFiles().length;
    }
}
