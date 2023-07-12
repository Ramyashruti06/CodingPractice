package codetalksdna.CodingPrograms;

public class AlphabetInALoop {
    public static void main(String[] args) {
        System.out.println("The Alphabets in the English Dictionary is :");
        char alphabet;
        for (alphabet = 'A'; alphabet <= 'Z'; ++alphabet) {
            System.out.print(alphabet + " ");
        }
        System.out.println(" ");
        for (alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            System.out.print(alphabet + " ");
        }
    }
}
