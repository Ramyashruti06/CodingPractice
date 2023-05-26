package codetalksdna.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Nitesh");
        stringSet.add("Nitesh");
        stringSet.add("Shruti");
        stringSet.add("Sakhi");
        stringSet.add(null);

        System.out.println(stringSet.size());
        System.out.println(stringSet.remove(2));
        System.out.println(stringSet);
    }
}
