package codetalksdna.ArithmeticOperationsPrograms;

public class Simplification {
    public static void main(String[] args) {
        Equation eq = new Equation();
        int e = eq.simplifyingEquation();
        System.out.println(e);
    }
}

class Equation {
    public static int simplifyingEquation() {
        int num1 = 80;
        int num2 = 3;
        int num3 = 13;
        int num4 = 15;
        int num5 = 8;
        int num6 = 2;
        int num7 = 7;
        int total1 = num1 - num2 * num3 + (num4 - num5) - num6 * num7;
        return total1;
    }
}

