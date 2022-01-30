package strings;

import java.util.LinkedHashMap;
import java.util.Map;

class Repetition {
  public static Character getFirstNonRepeatedCharacter(String text) {
    Map<Character, Integer> charToCount = new LinkedHashMap<>();
    for (Character c : text.toCharArray()) {
      if (charToCount.containsKey(c)) {
        Integer count = charToCount.get(c);
        charToCount.put(c, ++count);
      } else {
        charToCount.put(c, 1);
      }
    }
    for (Map.Entry<Character, Integer> characterToCount : charToCount.entrySet()) {
      if (characterToCount.getValue() == 1) {
        return characterToCount.getKey();
      }
    }
    return null;
  }
}
