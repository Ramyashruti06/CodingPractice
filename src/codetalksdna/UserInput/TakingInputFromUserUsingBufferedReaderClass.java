package codetalksdna.UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputFromUserUsingBufferedReaderClass {
    public static void main(String[] args) throws IOException {
        Number number = new Number();
        int sum = number.sumOfNumber();
        System.out.println("The Sum of Two Digit is::" + sum);
    }
}

class Number {
    public int sumOfNumber() throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        System.out.println("Enter the First Number?");
        int number1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the Second Number?");
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int sum = number1 + number2;
        return sum;
    }
}
