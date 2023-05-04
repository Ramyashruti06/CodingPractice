package codetalksdna.CodingPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the values of n2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the values of n3: ");
        int n3 = sc.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("The largest number among 3 numbers is : " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("The largest number among 3 numbers is : " + n2);
        } else
            System.out.println("The largest number among 3 numbers is : " + n3);

    }
}
