package codetalksdna.ExceptionClassPrograms.UnCheckedException;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println(array[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(array[3]);
    }
}
