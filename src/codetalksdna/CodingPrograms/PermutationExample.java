package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class PermutationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n?");
        int n = sc.nextInt();
        System.out.println("Enter the value of r?");
        int r = sc.nextInt();

        int nFactorial = FactorialOfANumber.factorial(n);
        int nSubRFactorial = FactorialOfANumber.factorial(n - r);
        System.out.println("nFactorial is "+ nFactorial);
        System.out.println("nFactorial is "+ nSubRFactorial);
        permutationCode(nFactorial, nSubRFactorial);

    }

    private static void permutationCode(int nFactorial, int nSubRFactorial) {
        int permutation = nFactorial / nSubRFactorial;
        System.out.println(permutation);
    }
}
