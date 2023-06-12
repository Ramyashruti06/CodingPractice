package codetalksdna.serialization;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInSerialization {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\serialization\\");
        return file.listFiles().length;
    }
}
