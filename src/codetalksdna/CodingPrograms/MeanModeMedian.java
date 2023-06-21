package codetalksdna.CodingPrograms;

import java.util.*;

public class MeanModeMedian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the Array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("Generated Array: " + Arrays.toString(numbers));

        double mean = calculateMean(numbers);
        System.out.println("Mean of the Numbers: " + mean);

        double median = calculateMedian(numbers);
        System.out.println("Median of the Numbers: " + median);

        List<Integer> mode = calculateMode(numbers);
        System.out.println("Mode of the Numbers: " + mode);
    }

    public static double calculateMean(int[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        return (double) (numbers[middle] + numbers[middle - 1 + numbers.length % 2]) / 2;
    }

    public static List<Integer> calculateMode(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;

        for (int number : numbers) {
            int count = countMap.merge(number, 1, Integer::sum);
            maxCount = Math.max(maxCount, count);
        }

        List<Integer> mode = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mode.add(entry.getKey());
            }
        }
        return mode;
    }
}
