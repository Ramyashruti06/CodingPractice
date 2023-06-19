package codetalksdna.CodingPrograms;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (MyCustomException ex) {
            System.out.println("Custom Exception Caught: " + ex.getMessage());
        }
    }
    public static int divide(int dividend, int divisor) throws MyCustomException {
        if (divisor == 0) {
            throw new MyCustomException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }
}
