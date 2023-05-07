package codetalksdna.CodingPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int sum = 0;
        int num = 123;
        while (num != 0) {
            int digit = num % 10;
            sum = sum * 10 + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
