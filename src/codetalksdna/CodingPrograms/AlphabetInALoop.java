package codetalksdna.CodingPrograms;

public class AlphabetInALoop {
    public static void main(String[] args) {
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
