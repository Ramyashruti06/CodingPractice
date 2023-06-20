package codetalksdna.CodingPrograms;

public class ReverseWord {
    public static void main(String[] args) {
        String name = "Nitesh I am happy";
        String reversedWord = "";
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            reversedWord = chars[i] + reversedWord;
        }
        System.out.println(reversedWord);
    }
}
