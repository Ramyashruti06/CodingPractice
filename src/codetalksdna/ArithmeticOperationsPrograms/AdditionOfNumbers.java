package codetalksdna.ArithmeticOperationsPrograms;

public class AdditionOfNumbers {
    public static void main(String[] args) {
        Numbers number = new Numbers();
        int sum = number.sumOfNumber();
        System.out.println("The Sum of Two Digit is::" + sum);
    }
}

class Numbers {
    public int sumOfNumber() {
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        return sum;
    }
}
