package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambdaExpression {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(30);
        integerList.add(50);
        integerList.add(60);

        //Index For Loop..
        for (int i = 0; i < integerList.size(); i++) {
//                System.out.println(integerList.get(i));
        }
        //Enhanced For Loop.
        for (Integer integer : integerList) {
//                System.out.println(integer);
        }

        //Using for each with Lambda Expression.
        integerList.forEach(number -> {
            System.out.println(number);
        });
    }
}
