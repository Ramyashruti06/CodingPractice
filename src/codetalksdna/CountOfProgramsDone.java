package codetalksdna;

import codetalksdna.AbstractionUsingAbstractClassPrograms.CountOfFilesInAbstractionUsingAbstractClass;
import codetalksdna.AbstractionUsingInterfacePrograms.CountOfFilesInAbstractionUsingInterface;
import codetalksdna.ArithmeticOperationsPrograms.CountOfFilesInArithmeticOperations;
import codetalksdna.ArraysPrograms.OneDArrays.CountOfFilesIn1DArray;
import codetalksdna.ArraysPrograms.TwoDArrays.CountOfFilesIn2DArray;
import codetalksdna.CodingPrograms.CountOfFilesInCodingPrograms;
import codetalksdna.Collections.CountOfProgramsInCollections;
import codetalksdna.ConstructorPrograms.CountOfFilesInConstructor;
import codetalksdna.EncapsulationPrograms.CountOfFilesInEncapsulation;
import codetalksdna.ExceptionClassPrograms.UnCheckedException.CountOfFilesInExceptionClass;
import codetalksdna.IncrementDecrementOperator.CountOfProgramInIncrementDecrementOperator;
import codetalksdna.InheritancePrograms.CountOfProgramInInheritance;
import codetalksdna.Loops.CountOfProgramInLoops;
import codetalksdna.PolymorphismPrograms.CountOfProgramInPolymorohism;
import codetalksdna.PrimitiveToClass.CountOfProgramsInPrimitiveToClass;
import codetalksdna.StringClassMethodsPrograms.CountOfProgramsInStringClassPrograms;
import codetalksdna.SuperKeyword.CountOfProgramsInSuperKeyword;
import codetalksdna.UserInputPrograms.CountOfProgramsInUserInputPrograms;
import codetalksdna.fileIO.CountOfFilesInFileIO;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInAbstractionUsingAbstractClass countOfFilesInAbstractionUsingAbstractClass = new CountOfFilesInAbstractionUsingAbstractClass();
        CountOfFilesInAbstractionUsingInterface countOfFilesInAbstractionUsingInterface = new CountOfFilesInAbstractionUsingInterface();
        CountOfFilesInArithmeticOperations countOfFilesInArithmeticOperations = new CountOfFilesInArithmeticOperations();
        CountOfFilesIn1DArray countOfFilesIn1DArray = new CountOfFilesIn1DArray();
        CountOfFilesIn2DArray countOfFilesIn2DArray = new CountOfFilesIn2DArray();
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfProgramsInCollections countOfProgramsInCollections = new CountOfProgramsInCollections();
        CountOfFilesInConstructor countOfFilesInConstructor = new CountOfFilesInConstructor();
        CountOfFilesInEncapsulation countOfFilesInEncapsulation = new CountOfFilesInEncapsulation();
        CountOfFilesInExceptionClass countOfFilesInExceptionClass = new CountOfFilesInExceptionClass();
        CountOfFilesInFileIO countOfFilesInFileIO = new CountOfFilesInFileIO();
        CountOfProgramInIncrementDecrementOperator countOfProgramInIncrementDecrementOperator = new CountOfProgramInIncrementDecrementOperator();
        CountOfProgramInInheritance countOfProgramInInheritance = new CountOfProgramInInheritance();
        CountOfProgramInLoops countOfProgramInLoops = new CountOfProgramInLoops();
        CountOfProgramInPolymorohism countOfProgramInPolymorohism = new CountOfProgramInPolymorohism();
        CountOfProgramsInPrimitiveToClass countOfProgramsInPrimitiveToClass = new CountOfProgramsInPrimitiveToClass();
        CountOfProgramsInStringClassPrograms countOfProgramsInStringClassPrograms = new CountOfProgramsInStringClassPrograms();
        CountOfProgramsInSuperKeyword countOfProgramsInSuperKeyword = new CountOfProgramsInSuperKeyword();
        CountOfProgramsInUserInputPrograms countOfProgramsInUserInputPrograms = new CountOfProgramsInUserInputPrograms();

        int[] files = {countOfFilesInAbstractionUsingAbstractClass.returnFileCount(), countOfFilesInAbstractionUsingInterface.returnFileCount(), countOfFilesInArithmeticOperations.returnFileCount(), countOfFilesIn1DArray.returnFileCount(), countOfFilesIn2DArray.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInConstructor.returnFileCount(), countOfFilesInEncapsulation.returnFileCount(), countOfFilesInExceptionClass.returnFileCount(), countOfFilesInFileIO.returnFileCount(), countOfProgramInInheritance.returnFileCount(), countOfProgramInLoops.returnFileCount(), countOfProgramInPolymorohism.returnFileCount(), countOfProgramsInUserInputPrograms.returnFileCount(), countOfProgramInIncrementDecrementOperator.returnFileCount(), countOfProgramsInCollections.returnFileCount(), countOfProgramsInSuperKeyword.returnFileCount(), countOfProgramsInStringClassPrograms.returnFileCount(), countOfProgramsInPrimitiveToClass.returnFileCount()};
        sumOfProgramsWeDidTillNow(files, countOfFilesInCodingPrograms);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files, CountOfFilesInCodingPrograms countOfFilesInCodingPrograms) {
        int sum = 0;
        for (int file : files) {
            sum = sum + file;
        }
        System.out.println("Programs in Coding Practice" + " " + countOfFilesInCodingPrograms.returnFileCount());
        System.out.println("Total Number of Packages" + "::" + files.length);
        System.out.println("Total Number of Programs Done till Now" + "::" + sum);
    }
}
