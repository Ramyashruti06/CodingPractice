package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class AvgUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] num = new Double[6];
        double sum = 0.0d;
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the" + " " + (i+1) + " " + "number?");
            num[i] = sc.nextDouble();
        }
        for (Double n : num) {
            sum = sum + n;
        }
        double avg = sum / num.length;
        System.out.println("The average of elements in the given array is : " + avg);
    }
}
