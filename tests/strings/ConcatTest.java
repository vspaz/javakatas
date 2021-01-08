package strings;


import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;

public class ConcatTest {
    @Test
    void testConcat() {
        ArrayList<String> words = new ArrayList<>();
        words.add("foo");
        words.add("bar");
        words.add("baz");

        Assert.assertEquals("foobarbaz", Concat.concat(words));
    }
}
