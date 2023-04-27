package codetalksdna.ArithmeticOperations;

public class AdditionOfNumbers {
    public static void main(String[] args) {
        Number number = new Number();
        int sum = number.sumOfNumber();
        System.out.println("The Sum of Two Digit is::" + sum);
    }
}

class Number {
    public int sumOfNumber() {
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        return sum;
    }
}
