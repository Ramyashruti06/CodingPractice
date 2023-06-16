package codetalksdna.CodingPrograms;
import java.util.LinkedList;

public class LinkedListElementRemoval {
    public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>();
        ll.add(20);
        ll.add(81);
        ll.add(66);
        ll.add(97);
        ll.add(78);
        ll.add(16);
        System.out.println("The elements in the list are: " + ll);
        System.out.println(ll.remove(4));
        System.out.println("The new list elements are: " + ll);
    }
}
