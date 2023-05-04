package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class PrintNNumberOfPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value till which you want to check the series::? ");
        int n = sc.nextInt();
        checkFirstNPrimeNumber(n);
    }

    private static void checkFirstNPrimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            int value = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    value++;
                    break;
                }
            }
            if (value == 0) {
                System.out.println(i);
            }
        }
    }
}
