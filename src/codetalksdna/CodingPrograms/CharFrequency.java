package codetalksdna.CodingPrograms;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char c = sc.next().charAt(1);
        int freq = 0;
        for(int i = 0; i <= str.length(); i++) {
            if(c == str.charAt(i)) {
                freq++;
            }
        }
        System.out.println("The frequency of a character in the string is : " + freq);
    }
}
