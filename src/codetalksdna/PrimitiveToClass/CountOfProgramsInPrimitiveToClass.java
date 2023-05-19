package codetalksdna.PrimitiveToClass;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInPrimitiveToClass {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\PrimitiveToClass\\");
        return file.listFiles().length;
    }
}
