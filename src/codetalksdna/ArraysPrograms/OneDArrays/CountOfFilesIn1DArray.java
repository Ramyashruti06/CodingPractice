package codetalksdna.ArraysPrograms.OneDArrays;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesIn1DArray {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"src\\codetalksdna\\ArraysPrograms\\OneDArrays\\");
        return file.listFiles().length;
    }
}
