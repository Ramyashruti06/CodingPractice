package codetalksdna.CodingPrograms;

import java.util.LinkedList;
import java.util.Random;

public class MiddleElementOfLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < random.nextInt(1,10); i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        System.out.println("LinkedList Traversal will be " + middleItem(list));
    }

    public static int middleItem(LinkedList<Integer> list) {
        int size = list.size();
        if (size % 2 == 0) {
            return list.get(size / 2);
        } else {
            return list.get((size + 1) / 2);
        }
    }
}
