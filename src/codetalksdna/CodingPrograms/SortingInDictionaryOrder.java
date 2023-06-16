package codetalksdna.CodingPrograms;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortingInDictionaryOrder {
    public static void main(String[] args) {
        SortedSet<String> strSet = new TreeSet<>();

        strSet.add("Hyderabad");
        strSet.add("Kolkata");
        strSet.add("Bengaluru");
        strSet.add("Delhi");
        strSet.add("Vizag");
        strSet.add("Chennai");

        System.out.println(strSet.size());
        System.out.println(strSet);

        System.out.println("The lexixographical order of elements are : " + strSet);
    }
}


