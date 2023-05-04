package codetalksdna.CodingProblems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value till which you require to print the series::?");
        int n = sc.nextInt();
        int firstTerm, secondTerm = 0, nextTerm = 1;
        for (int i = 1; i <= n; i++) {
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            nextTerm = firstTerm + secondTerm;
            System.out.print(firstTerm + " ");
        }
    }
}
