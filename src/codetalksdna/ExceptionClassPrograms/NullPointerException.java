package codetalksdna.ExceptionClassPrograms;

public class NullPointerException {
    public static void main(String[] args) {
        Integer number = null;
        try {
            System.out.println(number + 10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
