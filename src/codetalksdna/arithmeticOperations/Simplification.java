package codetalksdna.arithmeticOperations;

public class Simplification {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int total1 = solution.simplifyingsolution();
        int total2 = solution.simplifyingsolution();



        class Solution {
            public static int simplifyingsolution() {
                int num1 = 80;
                int num2 = 3;
                int num3 = 13;
                int num4 = 15;
                int num5 = 8;
                int num6 = 2;
                int num7 = 7;
                int sub1 = num4 - num5;
                int mul1 = num6 * num7;
                int mul2 = num2 * num3;
                int sub2 = num1 - mul2;
                int total1 = num1 - num2 * num3 + (num4 - num5) - num6 * num7;
                int total2 = sub2 + sub1 - mul1;
            }
        }

        System.out.println("Simplification of the given equation in one Way:" + "" + total1 + " " + "In Another way is " + "" + total2);
    }
}
