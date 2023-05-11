package codetalksdna.Loops;

import java.util.Scanner;
public class PrintTheMultiplicationUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i =  1;
        System.out.println("The multiplication of " + n + " is :");
        while(i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }

    }
}
