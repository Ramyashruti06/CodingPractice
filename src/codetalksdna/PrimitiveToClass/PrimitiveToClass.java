package codetalksdna.PrimitiveToClass;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveToClass {
    public static void main(String[] args) {
        String value = "10";

        int value1 = Integer.parseInt(value);
        System.out.println(value1);

        int values = 10;

        int myRollNo = 20;
        String str = String.valueOf(myRollNo);
        System.out.println(str);

        // 1.4v
        int i = Integer.parseInt(str);
        System.out.println(i);
        Integer integer = 20;

        List<Integer> list = new ArrayList();

    }
}
