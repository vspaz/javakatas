package strings;

import java.util.Map;
import java.util.TreeMap;

public class CharacterCounter2 {
    public static void main(String[] args) {
        Map<Character, Integer> charToCount = new TreeMap<>();
        String someString = "foobarbazzzzfufufuf";
        for (char c : someString.toCharArray()) {
            charToCount.compute(c, (key, value) -> (value == null) ? 1 : ++ value);
        }
        StringUtils.print(charToCount);
    }
}
