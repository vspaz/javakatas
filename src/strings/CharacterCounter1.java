package strings;

import java.util.Map;
import java.util.TreeMap;


class Counter {
    static void countChars(String someString) {
        Map<Character, Integer> charToCount = new TreeMap<>();
        for (char character : someString.toCharArray()) {
            if (charToCount.containsKey(character)) {
                int count = charToCount.get(character);
                charToCount.put(character, ++count);
            } else {
                charToCount.put(character, 1);
            }
        }
        StringUtils.print(charToCount);
    }
}

public class CharacterCounter1 {
    public static void main(String[] args) {
        String someString = "foobarbazzzzfufufuf";
        Counter.countChars(someString);
    }
}
