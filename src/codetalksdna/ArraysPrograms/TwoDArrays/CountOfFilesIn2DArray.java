package codetalksdna.ArraysPrograms.TwoDArrays;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesIn2DArray {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\ArraysPrograms\\TwoDArrays");
        return file.listFiles().length;
    }
}
