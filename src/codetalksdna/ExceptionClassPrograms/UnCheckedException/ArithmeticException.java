package codetalksdna.ExceptionClassPrograms.UnCheckedException;

public class ArithmeticException {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;
        try {
            result = number / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Result in try Block" + " " + result);
    }
}
