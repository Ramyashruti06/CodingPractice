package codetalksdna.PolymorphismExamples;

public class MethodOverLoadingExample {
    public static void main(String[] args) {
        int sum1 = sumOfNumber(10, 20);
        int sum2 = sumOfNumber(10, 20, 30);
        System.out.println(sum1);
        System.out.println(sum2);

    }

    public static int sumOfNumber(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static int sumOfNumber(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        return sum;
    }
}
