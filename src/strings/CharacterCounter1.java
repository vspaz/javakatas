package strings;

import java.util.Map;
import java.util.TreeMap;

public class CharacterCounter1 {
    public static void main(String[] args) {
        String someString = "foobarbazzzzfufufuf";
        Map<Character, Integer> charToCount = new TreeMap<>();
        for (char character : someString.toCharArray()) {
            if (charToCount.containsKey(character)) {
                int count = charToCount.get(character) + 1;
                charToCount.put(character, count);
            } else {
                charToCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> characterToCount : charToCount.entrySet()) {
            System.out.println(String.format("%s => %s", characterToCount.getKey(), characterToCount.getValue()));
        }
    }
}