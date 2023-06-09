package codetalksdna.Map;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfProgramsInMap {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\Map\\");
        return file.listFiles().length;
    }
}
