package codetalksdna.CodingProblems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = sc.nextInt();
        int FirstTerm = 0, SecondTerm = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(FirstTerm + ",");
            int NextTerm = FirstTerm + SecondTerm;
            FirstTerm = SecondTerm;
            SecondTerm = NextTerm;
        }
        //System.out.println("The output of fibonacci series is : " + SecondTerm);

    }
}
