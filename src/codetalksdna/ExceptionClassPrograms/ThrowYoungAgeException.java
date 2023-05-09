package codetalksdna.ExceptionClassPrograms;

import java.util.Scanner;

public class ThrowYoungAgeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age of the Candidate");
        int age = scanner.nextInt();

        if (age < 18) {
            throw new YoungAgeException("You are Under Age for Voting");
        } else {
            System.out.println("You are eligible for Voting");
        }
    }
}
