package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the value of divisor: ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        System.out.println("The quotient is :" + + quotient);
        int remainder = dividend % divisor;
        System.out.println("The remainder is :" + + remainder);

    }
}
