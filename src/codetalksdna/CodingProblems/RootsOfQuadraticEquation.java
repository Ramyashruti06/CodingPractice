package codetalksdna.CodingProblems;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a");
        double a = sc.nextDouble();
        System.out.println("Enter the values of b");
        double b = sc.nextDouble();
        System.out.println("Enter the values of c");
        double c = sc.nextDouble();

        double root1 = 0, root2 = 0;

        double det = b * b - 4 * a * c;
        System.out.println("Determinant of the Following Equation is ::" + " " + det);
        if (det > 0) {
            root1 = (-b + Math.sqrt(det)) / (2 * a);
            root2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.println("Roots of Quadratic Equations are" + " " + root1 + " , " + root2);
        }
        if (det == 0) {
            System.out.println("Roots of Quadratic Equations are Equal" + " " + root1 + " , " + root2);
        }
    }
}
