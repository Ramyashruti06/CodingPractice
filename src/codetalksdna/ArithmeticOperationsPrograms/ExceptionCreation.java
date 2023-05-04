package codetalksdna.arithmeticOperations;

public class ExceptionCreation {
    public static void main(String[] args) {
        handlingException();
    }

    private static void handlingException() {
        int number = 10;
        int result = 0;
        try {
            result = number / 0;
            System.out.println("Result in try Block" + " " + result);
        } catch (Exception e) {
            System.out.println("Result in Catch Block" + " " + result);
        }
    }
}
