package codetalksdna.CodingPrograms;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {
    public static void main(String[] args) {
        SortedMap<String, Integer> sIMap =new TreeMap<>();
        sIMap.put("Biryani ", 1);
        sIMap.put("Fried Rice ", 2);
        sIMap.put("Pav Bhaji ", 3);
        sIMap.put("Chole Batura ", 4);
        sIMap.put("Palak Paneer ", 5);
        sIMap.put("Aloo Paratha ", 6);
        System.out.println("The sorted Map is : " + sIMap);
    }
}
