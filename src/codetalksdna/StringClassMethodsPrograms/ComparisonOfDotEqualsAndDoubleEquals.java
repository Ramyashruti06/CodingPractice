package codetalksdna.StringClassMethodsPrograms;

public class ComparisonOfDotEqualsAndDoubleEquals {
    public static void main(String[] args) {
        String s1 = "Shruti";
        String s2 = "Shruti";
        String s3 = new String("Shruti");

        if (s1.equals(s2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (s1.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (s2.equals(s3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
