package codetalksdna.AbstractionUsingInterfacePrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInAbstractionUsingInterface {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\AbstractionUsingInterfacePrograms\\");
        return file.listFiles().length;
    }
}
