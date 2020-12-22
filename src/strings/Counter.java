package strings;

import java.util.Map;

public abstract class Counter implements ICounter{
    static String someString = "foobarbazzzzfufufuf";

    static void print(Map<Character, Integer> charToCount) {
        for (Map.Entry<Character, Integer> characterToCount : charToCount.entrySet()) {
            System.out.printf("%s => %s\n", characterToCount.getKey(), characterToCount.getValue());
        }
    }
}
