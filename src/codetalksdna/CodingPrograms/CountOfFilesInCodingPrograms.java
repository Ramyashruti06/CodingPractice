package codetalksdna.CodingPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInCodingPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\CodingPrograms\\");
        return file.listFiles().length;
    }
}
