package codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToList {
    public static void main(String[] args) {
        Map<String, String> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put("Hyderabad", "Telangana");
        integerIntegerMap.put("AndhraPradesh", "Vizag");

        System.out.println(integerIntegerMap.get("Hyderabad"));
        System.out.println(integerIntegerMap);

        List<String> list = new ArrayList<>(integerIntegerMap.keySet());
        System.out.println(list);

        List<String> list1 = new ArrayList<>(integerIntegerMap.values());
        System.out.println(list1);
    }
}
