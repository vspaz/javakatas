package strings;

import java.util.ArrayList;

public class Concat {
    public static String concat(ArrayList<String> words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
