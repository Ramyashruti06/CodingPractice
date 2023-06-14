package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        long n = sc.nextLong();
        long Decimal = binaryToDecimalConversion(n);
        System.out.println("Conversion of Binary " + n + " to Decimal is " + Decimal);

    }
    public static long binaryToDecimalConversion(long n) {
        long d = 0, i = 0;
        while(n != 0){
            long remainder = n % 10;
            n = n / 10;
            d += remainder * Math.pow(2, i);
            i++;
        }
        return d;
    }
}


