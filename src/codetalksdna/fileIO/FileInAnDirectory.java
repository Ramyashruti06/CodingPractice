package codetalksdna.fileIO;

import java.io.File;

public class FileInAnDirectory {
    String sakhiPath = "C:\\Users\\kramy\\IdeaProjects\\";
    static String niteshPath = "C:\\Users\\nbhushan\\Documents\\Intellij-Idea-Projects\\";

    public static void main(String[] args) {
        String path = niteshPath;
        File f2 = new File(path + "CodingPractice\\src\\codetalksdna\\AbstractionUsingAbstractClassPrograms");
        int l2 = f2.listFiles().length;
        System.out.println("Number of files in 2nd folder are :" + " " + l2);
        File f3 = new File(path + "CodingPractice\\src\\codetalksdna\\AbstractionUsingInterfacePrograms");
        int l3 = f3.listFiles().length;
        System.out.println("Number of files in 3rd folder are :" + " " + l3);
        File f4 = new File(path + "CodingPractice\\src\\codetalksdna\\ArithmeticOperationsPrograms");
        int l4 = f4.listFiles().length;
        System.out.println("Number of files in 4th folder are :" + " " + l4);
        File f5 = new File(path + "CodingPractice\\src\\codetalksdna\\ArraysPrograms\\OneDArrays");
        int l5 = f5.listFiles().length;
        System.out.println("Number of files in 5th folder are :" + " " + l5);
        File f6 = new File(path + "CodingPractice\\src\\codetalksdna\\ArraysPrograms\\TwoDArrays");
        int l6 = f6.listFiles().length;
        System.out.println("Number of files in 6th folder are :" + " " + l6);
        File f7 = new File(path + "CodingPractice\\src\\codetalksdna\\CodingPrograms");
        int l7 = f7.listFiles().length;
        System.out.println("Number of files in 7th folder are :" + " " + l7);
        File f8 = new File(path + "CodingPractice\\src\\codetalksdna\\ConstructorPrograms");
        int l8 = f8.listFiles().length;
        System.out.println("Number of files in 8th folder are :" + " " + l8);
        File f9 = new File(path + "CodingPractice\\src\\codetalksdna\\EncapsulationPrograms");
        int l9 = f9.listFiles().length;
        System.out.println("Number of files in 9th folder are :" + " " + l9);
        File f10 = new File(path + "CodingPractice\\src\\codetalksdna\\EncapsulationPrograms");
        int l10 = f10.listFiles().length;
        System.out.println("Number of files in 10th folder are :" + " " + l10);
        File f11 = new File(path + "CodingPractice\\src\\codetalksdna\\ExceptionClassPrograms\\CheckedException");
        int l11 = f11.listFiles().length;
        System.out.println("Number of files in 11th folder are :" + " " + l11);
        File f12 = new File(path + "CodingPractice\\src\\codetalksdna\\ExceptionClassPrograms\\UnCheckedException");
        int l12 = f12.listFiles().length;
        System.out.println("Number of files in 12th folder are :" + " " + l12);
        File f13 = new File(path + "CodingPractice\\src\\codetalksdna\\ExceptionClassPrograms");
        int l13 = f13.listFiles().length;
        System.out.println("Number of files in 13th folder are :" + " " + l13);
        File f14 = new File(path + "CodingPractice\\src\\codetalksdna\\fileIO");
        int l14 = f14.listFiles().length;
        System.out.println("Number of files in 14th folder are :" + " " + l14);
        File f15 = new File(path + "CodingPractice\\src\\codetalksdna\\IncrementDecrementOperator");
        int l15 = f15.listFiles().length;
        System.out.println("Number of files in 15th folder are :" + " " + l15);
        File f16 = new File(path + "CodingPractice\\src\\codetalksdna\\InheritancePrograms");
        int l16 = f16.listFiles().length;
        System.out.println("Number of files in 16th folder are :" + " " + l16);
        File f17 = new File(path + "CodingPractice\\src\\codetalksdna\\Loops");
        int l17 = f17.listFiles().length;
        System.out.println("Number of files in 17th folder are :" + " " + l17);
        File f18 = new File(path + "CodingPractice\\src\\codetalksdna\\PolymorphismPrograms");
        int l18 = f18.listFiles().length;
        System.out.println("Number of files in 18th folder are :" + " " + l18);
        File f19 = new File(path + "CodingPractice\\src\\codetalksdna\\StringClassMethodsPrograms");
        int l19 = f19.listFiles().length;
        System.out.println("Number of files in 19th folder are :" + " " + l19);
        File f20 = new File(path + "CodingPractice\\src\\codetalksdna\\SuperKeyword");
        int l20 = f20.listFiles().length;
        System.out.println("Number of files in 20th folder are :" + " " + l20);
        File f21 = new File(path + "CodingPractice\\src\\codetalksdna\\UserInputPrograms");
        int l21 = f21.listFiles().length;
        System.out.println("Number of files in 21th folder are :" + " " + l21);
        int sumOfFiles = l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9 + l10 + l11 + l12 + l13 + l14 + l15 + l16 + l17 + l18 + l19 + l20 + l21;
        System.out.println("Sum of Files : " + " " + sumOfFiles);
    }
}
