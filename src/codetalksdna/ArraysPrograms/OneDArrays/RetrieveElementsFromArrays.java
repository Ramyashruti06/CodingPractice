package codetalksdna.ArraysPrograms.OneDArrays;

public class RetrieveElementsFromArrays {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 20;
        numbers[1] = 30;

        System.out.println("The Size of an Element::" + " " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
