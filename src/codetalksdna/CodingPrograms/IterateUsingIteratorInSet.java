package codetalksdna.CodingPrograms;

import java.util.HashSet;
import java.util.Set;

public class IterateUsingIteratorInSet {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(25);
        integers.add(53);
        integers.add(71);
        integers.add(99);
        System.out.println("The elements in the set are: " + integers);
    }
}
