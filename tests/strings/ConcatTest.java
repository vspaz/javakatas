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

        Assert.assertEquals("foobarbaz", Concat.concat(words, ""));
    }

    @Test
    void testConcatWithSeparator() {
        ArrayList<String> words = new ArrayList<>();
        words.add("foo");
        words.add("bar");
        words.add("baz");

        Assert.assertEquals("foo.bar.baz", Concat.concat(words, "."));
    }

    @Test
    void testConcatWithSeparatorAndSingleElement() {
        ArrayList<String> words = new ArrayList<>();
        words.add("foo");
        Assert.assertEquals("foo", Concat.concat(words, "."));
    }
}
