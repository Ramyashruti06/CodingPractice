package codetalksdna.ConstructorPrograms;

import codetalksdna.PathOfProgram.PathOfProgram;

import java.io.File;

public class CountOfFilesInConstructor {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath()+"\\src\\codetalksdna\\ConstructorPrograms\\");
        return file.listFiles().length;
    }
}
