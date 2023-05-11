package codetalksdna.Loops;

import java.util.Scanner;
public class PrintTheArrayUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array : ");
        int[] n = new int[6];
        int index = 0;
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        n[3] = sc.nextInt();
        n[4] = sc.nextInt();
        n[5] = sc.nextInt();
        while(index <= n.length) {
            index++;
        }
        System.out.println("The array is : " + n);
    }
}
