package codetalksdna.CodingProblems;

import java.util.Scanner;
public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c" /*+ a + b + c*/);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double root1, root2;

        double det = b * b * 4 * a * c;
        if (det > 0) {
            root1 = (- b + Math.sqrt(det)) / (2 * a);
            root2 = (- b - Math.sqrt(det)) / (2 * a);
            System.out.println("root1 = %.2f and root2 = %.2f"+ root1 + root2);
        }

    }
}
