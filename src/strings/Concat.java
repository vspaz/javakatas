package strings;

import java.util.ArrayList;

public class Concat {
    public static String concat(ArrayList<String> words, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}
