package strings;

import java.util.Map;
import java.util.TreeMap;

class Couter2 extends Counter {
    static Map<Character, Integer> countChars() {
        Map<Character, Integer> charToCount = new TreeMap<>();
        for (char c : someString.toCharArray()) {
            charToCount.compute(c, (key, value) -> (value == null) ? 1 : ++value);
        }
        return charToCount;
    }

}

public class CharacterCounter2 {
    public static void main(String[] args) {
        Map<Character, Integer> charToInteger = Couter2.countChars();
        StringUtils.print(charToInteger);
    }
}