package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r :");
        int r = sc.nextInt();
        Double pi = 3.141592, area;
        area = pi * r * r;
        System.out.println("The area of circle is : " + area);
    }
}
