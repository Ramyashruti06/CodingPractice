package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = sc.nextInt();
        for (n != 10; n = n / 10; n++) {
            System.out.println("The number of digits is : " + n);
        }
    }
