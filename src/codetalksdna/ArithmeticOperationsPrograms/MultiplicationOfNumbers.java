package codetalksdna.ArithmeticOperationsPrograms;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int mul = calculation.multiplyingDigits();
        System.out.println("Multiplication of Two Number is::" + " " + mul);
    }
}

class Calculation {
    public int multiplyingDigits() {
        int number1 = 10;
        int number2 = 15;
        int mul = number1 * number2;
        return mul;
    }
}
