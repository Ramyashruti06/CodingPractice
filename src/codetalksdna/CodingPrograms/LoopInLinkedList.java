package codetalksdna.CodingPrograms;

import java.util.LinkedList;
import java.util.Random;

public class LoopInLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("LinkedList Traversal will be " + list);
    }
}
