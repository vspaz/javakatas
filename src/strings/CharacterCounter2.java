package strings;

import java.util.Map;
import java.util.TreeMap;

class Counter2 extends Counter {
    static Map<Character, Long> countChars() {
        Map<Character, Long> charToCount = new TreeMap<>();
        for (char c : someString.toCharArray()) {
            charToCount.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        return charToCount;
    }

}

public class CharacterCounter2 {
    public static void main(String[] args) {
        Map<Character, Long> charToCount = Counter2.countChars();
        Counter2.print(charToCount);
    }
}
