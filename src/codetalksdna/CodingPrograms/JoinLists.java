package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoinLists {
    public static void main(String[] args) {
        List<Integer> mergedList = new ArrayList<>();
        System.out.println("Enter the values of lists : ");
        List<Integer> firstList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the" + " " + (i + 1) + " " + "elements in firstList");
            int numbers = scanner.nextInt();
            firstList.add(numbers);
        }
        System.out.println("The First List" + " " + firstList);

        List<Integer> secondList = new ArrayList<>();
        Scanner scannerList = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the" + " " + (i + 1) + " " + "elements in secondList");
            int numbers = scannerList.nextInt();
            secondList.add(numbers);
        }
        System.out.println("The Second List" + " " + firstList);

        mergedList.addAll(firstList);
        mergedList.addAll(secondList);

        System.out.println("The value of new merged List is: " + mergedList);
    }
}
