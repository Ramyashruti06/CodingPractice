package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class ValidShuffleOfTwoStrings {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of string 1: ");
        System.out.println("Enter the value of string 2: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = sc.nextLine();
        if(str1.length() + str2.length() != result.length()) {
            return false;
        }
        else
        return true;

    }
}
