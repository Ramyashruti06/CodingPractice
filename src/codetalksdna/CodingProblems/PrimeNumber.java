package codetalksdna.CodingProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for which you want to check the series::? ");
        int n = sc.nextInt();
        checkPrimeNumber(n);
    }

    private static void checkPrimeNumber(int n) {
        int value = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                value++;
                break;
            }
        }
        if (value > 0) {
            System.out.println("Number is a not prime Number");
        } else {
            System.out.println("Number is a prime Number");
        }
    }
}
