package strings;

import java.util.Map;
import java.util.TreeMap;


public class CharacterCounter2 {
    public static void main(String[] args) {
        String someString = "foobarbazzzzfufufuf";
        Map<Character, Integer> charToInteger = countChars(someString);
        StringUtils.print(charToInteger);
    }

    static Map<Character, Integer> countChars(String someString) {
        Map<Character, Integer> charToCount = new TreeMap<>();
        for (char c : someString.toCharArray()) {
            charToCount.compute(c, (key, value) -> (value == null) ? 1 : ++value);
        }
        return charToCount;
    }
}
