package codetalksdna.CodingPrograms;

public class PassMethodAsArgument {
    public int mul(int a, int b) {
        return a * b;
    }
    public void square(int num) {
        int result = num * num;
        System.out.println(result);
    }

    public static void main(String[] args) {
        PassMethodAsArgument passMethodAsArgument = new PassMethodAsArgument();
        passMethodAsArgument.square(passMethodAsArgument.mul(15, 9));
    }
}