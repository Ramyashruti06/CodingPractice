package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for which you required to get Factorial");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Factorial from Forward Loop::" + " " + result);
    }

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

