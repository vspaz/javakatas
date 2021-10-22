package strings;

import java.util.Map;

public abstract class Counter implements ICounter {
    static String someString = "foobarbazzzzfufufuf";

    static void print(Map<Character, Long> charToCount) {
        for (Map.Entry<Character, Long> characterToCount : charToCount.entrySet()) {
            System.out.printf("%s => %s\n", characterToCount.getKey(), characterToCount.getValue());
        }
    }
}
