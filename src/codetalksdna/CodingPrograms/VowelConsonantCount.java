package codetalksdna.CodingPrograms;

import java.util.Scanner;
public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;

            } else if ((c >= 'a' && c <= 'z')) {
                consonants++;

            }
        }
        System.out.println("The number of vowels in the string are : " + vowels);
        System.out.println("The number of consonants in the string are : " + consonants);


    }
}

