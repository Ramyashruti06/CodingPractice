package codetalksdna.UserInputPrograms;

import java.io.IOException;
import java.util.Scanner;

public class TakingInputFromUserUsingScannerClass{
    public static void main(String[] args) throws IOException {
        Numbers number = new Numbers();
        int sum = number.sumOfNumber();
        System.out.println("The Sum of Two Digit is::" + sum);
    }
}

class Numbers {
    public int sumOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number?");
        int number1 = scanner.nextInt();
        System.out.println("Enter the Second Number?");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        return sum;
    }
}