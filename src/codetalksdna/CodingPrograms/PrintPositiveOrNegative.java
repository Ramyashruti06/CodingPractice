package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class PrintPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number?");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Number is +ve Number");
        } else {
            System.out.println("Number is -ve Number");
        }
    }
}
