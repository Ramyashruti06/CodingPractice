package codetalksdna.CodingProblems;

import java.util.Scanner;

public class PrintIntegerByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number?");
        int num = scanner.nextInt();
        System.out.println("Number Entered By the User::" + " " + num);
    }
}
