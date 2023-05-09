package codetalksdna.ExceptionClassPrograms.UnCheckedException;

public class NestedTryCatchBlock1 {
    public static void main(String[] args) {
        String name = "value";
        int number = 10;
        int result = 0;
        try {
            try {
                Integer.parseInt(name);
            } catch (Exception e) {
                System.out.println(e);
            }
            result = number / 0;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Result in try Block" + " " + result);
    }
}
