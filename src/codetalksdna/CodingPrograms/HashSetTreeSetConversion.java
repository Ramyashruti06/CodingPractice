package codetalksdna.CodingPrograms;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class HashSetTreeSetConversion {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(20);
        integerList.add(30);
        integerList.add(50);
        integerList.add(60);
        integerList.add(10);
        integerList.add(40);
        integerList.add(5);
        integerList.add(80);

        TreeSet<Integer> treeSet = new TreeSet<>(integerList);
        System.out.println(treeSet);
    }
}
