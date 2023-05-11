package codetalksdna.fileIO;

import java.io.File;

public class FileInAnDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\CodingPrograms\\");
        int length1 = file.listFiles().length;
        System.out.println(length1);
        File files = new File("C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\CodingPractice\\src\\codetalksdna\\AbstractionUsingAbstractClassPrograms\\");
        int length2 = files.listFiles().length;
        System.out.println(length2);

        int sumOfFiles = length1 + length2;
        System.out.println("Sum of Files" + "" + sumOfFiles);
    }
}
