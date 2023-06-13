package codetalksdna.CodingPrograms;

public class ArmStrongNumberInLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            if (temp == armStrongValidation(temp)) {
                System.out.println("It is an ArmStrong Number" + " " + temp);
            }
        }
    }

    private static int armStrongValidation(int temp) {
        int sum = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp = temp / 10;
        }
        return sum;
    }
}
