package codetalksdna.Collections.ListImpl;

import java.util.ArrayList;

public class HetergenousExample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Nitesh");
        arrayList.add(21.00);
        arrayList.add(true);
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);
    }
}
