package strings;

import java.util.Map;
import java.util.stream.Collectors;

class Counter3 extends Counter {
  static Map<Character, Long> countChars() {
    return someString
        .chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }
}

public class CharacterCounter3 {
  public static void main(String[] args) {
    Map<Character, Long> charToCount = Counter3.countChars();
    Counter1.print(charToCount);
  }
}
