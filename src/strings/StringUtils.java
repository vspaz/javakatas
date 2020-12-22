package strings;

import java.util.Map;

public class StringUtils {
    public static void print(Map<Character, Integer> charToCount) {
        for (Map.Entry<Character, Integer> characterToCount : charToCount.entrySet()) {
            System.out.printf("%s => %s\n", characterToCount.getKey(), characterToCount.getValue());
        }
    }
}
