package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class AvgUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] num = new Double[6];
        double sum = 0.0d;
        num[0] = sc.nextDouble();
        num[1] = sc.nextDouble();
        num[2] = sc.nextDouble();
        num[3] = sc.nextDouble();
        num[4] = sc.nextDouble();
        num[5] = sc.nextDouble();
        for(Double n : num ) {
            sum = sum + n;
        }
        double avg = sum / num.length;
        System.out.println("The average of elements in the given array is : " + avg);
    }
}
