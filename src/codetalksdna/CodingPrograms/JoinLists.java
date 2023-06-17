package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JoinLists {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Enter the values of lists : ");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> joined = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(10));
        }

        joined.addAll(list1);
        joined.addAll(list2);
        System.out.println("The value of Joined is: " + joined);
    }
}
