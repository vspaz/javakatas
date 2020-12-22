package strings;

import java.util.Map;
import java.util.TreeMap;

class Counter1 extends Counter {
    static Map<Character, Integer> countChars() {
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
        Map<Character, Integer> charToCount = Counter1.countChars();
        Counter1.print(charToCount);
    }
}
