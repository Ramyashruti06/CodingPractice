package codetalksdna.ExceptionClassPrograms.UnCheckedException;

public class NestedTryCatchBlock2 {
    public static void main(String[] args) {
        String name = "value";
        int number = 10;
        int result = 0;
        try {
            result = number / 0;
        } catch (Exception e) {
            try {
                Integer.parseInt(name);
            } catch (Exception ex) {
                System.out.println(ex);
            }
            System.out.println(e);
        }
        System.out.println("Result in try Block" + " " + result);
    }
}
