package codetalksdna.EncapsulationPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInEncapsulation {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\EncapsulationPrograms\\");
        return file.listFiles().length;
    }
}
