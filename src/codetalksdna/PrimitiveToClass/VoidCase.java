package codetalksdna.PrimitiveToClass;

public class VoidCase {
    public static void main(String[] args) {
        int number = 10;
        int i = number + sumOfTwoValue(10, 20);
        sumOfValues(10, 20);
        System.out.println(i);
    }

    private static int sumOfTwoValue(int i, int i1) {
        int sum = i + i1;
        return sum;
    }

    private static void sumOfValues(int i, int i1) {
        int sum = i + i1;
        System.out.println(sum);
    }
}
