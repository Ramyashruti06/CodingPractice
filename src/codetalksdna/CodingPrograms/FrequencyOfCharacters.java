package codetalksdna.CodingPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String args[]) {
        String str = "KRAMYASHRUTI";
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequency);
    }
}
