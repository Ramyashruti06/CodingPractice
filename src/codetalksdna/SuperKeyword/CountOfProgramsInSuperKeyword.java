package codetalksdna.SuperKeyword;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInSuperKeyword {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\AbstractionUsingAbstractClassPrograms\\");
        return file.listFiles().length;
    }
}
