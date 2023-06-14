package codetalksdna.CodingPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JoinLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of lists : ");
        List<Integer> list = new ArrayList<Integer>();
        int list1, list2, list3, Joined;
        list1 = sc.nextInt();
        list2 = sc.nextInt();
        list3 = sc.nextInt();
        Joined = sc.nextInt();
       /* Joined.addAll(list1);
        Joined.addAll(list2);
        Joined.addAll(list3);*/
        System.out.println("The value of List1 is: " + list);
        System.out.println("The value of List2 is: " + list2);
        System.out.println("The value of List3 is: " + list3);
        System.out.println("The value of Joined is: " + Joined);

    }
}
