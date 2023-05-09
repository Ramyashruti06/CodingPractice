package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base : ");
        int base = sc.nextInt();
        System.out.println("Enter the value of exponent : ");
        int exp = sc.nextInt();
        long power = 1;
        for (int i = 1; i <= exp ; i++) {
            power = power * base;
        }
        System.out.println("The power of given number is : " + power);
    }
}
