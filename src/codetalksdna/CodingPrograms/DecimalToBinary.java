package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        long num = sc.nextLong();
        long binary = decimalToBinaryConverter(num);
        System.out.println("The Binary" + " " + binary);
    }

    public static long decimalToBinaryConverter(long num) {
        long b = 0, i = 0;
        return b;
    }
}
