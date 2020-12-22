package strings;

import java.util.Map;
import java.util.TreeMap;


class Counter {
    static Map<Character, Integer> countChars(String someString) {
        Map<Character, Integer> charToCount = new TreeMap<>();
        for (char character : someString.toCharArray()) {
            if (charToCount.containsKey(character)) {
                int count = charToCount.get(character);
                charToCount.put(character, ++count);
            } else {
                charToCount.put(character, 1);
            }
        }
        return charToCount;
    }
}

public class CharacterCounter1 {
    public static void main(String[] args) {
        String someString = "foobarbazzzzfufufuf";
        Map<Character, Integer> charToCount = Counter.countChars(someString);
        StringUtils.print(charToCount);
    }
}
