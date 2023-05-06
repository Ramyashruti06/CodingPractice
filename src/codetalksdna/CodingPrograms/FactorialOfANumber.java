package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for which you required to get Factorial");
        int number = scanner.nextInt();
        int factorial1 = 1;
        int factorial2 = 1;

        for (int i = number; i > 1; i--) {
            factorial1 = factorial1 * i;
        }
        for (int j = 1; j <= number; j++) {
            factorial2 = factorial2 * j;
        }
        System.out.println("Factorial from Reverse Loop::" + " " + factorial1);
        System.out.println("Factorial from Forward Loop::" + " " + factorial2);
    }
}

