package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class PrintEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number?");
        int num = scanner.nextInt();

        // % is known as Modulus.
        if (num % 2 == 0) {
            System.out.println("The Number" + " " + num + " " + "is Even Number");
        } else {
            System.out.println(num + " " + "Odd Number");
        }
    }
}
