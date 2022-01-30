package strings;

import java.util.Map;
import java.util.TreeMap;

class Counter1 extends Counter {
  static Map<Character, Long> countChars() {
    Map<Character, Long> charToCount = new TreeMap<>();
    for (char character : someString.toCharArray()) {
      if (charToCount.containsKey(character)) {
        long count = charToCount.get(character);
        charToCount.put(character, ++count);
      } else {
        charToCount.put(character, 1L);
      }
    }
    return charToCount;
  }
}

public class CharacterCounter1 {
  public static void main(String[] args) {
    Map<Character, Long> charToCount = Counter1.countChars();
    Counter1.print(charToCount);
  }
}
