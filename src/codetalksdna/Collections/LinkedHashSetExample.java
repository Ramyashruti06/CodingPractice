package codetalksdna.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Nitesh");
        stringSet.add("kumar");
        stringSet.add("Shruti");
        stringSet.add("Sakhi");

        System.out.println(stringSet.size());
        System.out.println(stringSet.remove("Shruti"));
        System.out.println(stringSet);
    }
}
