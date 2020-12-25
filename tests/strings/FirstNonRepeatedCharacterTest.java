package strings;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstNonRepeatedCharacterTest {
    @Test
    public void testFirstAndOnlyNonRepeatedCharacter() {
        Assert.assertEquals(Repetition.getFirstNonRepeatedCharacter("bbaacczaa"), (Character) 'z');
    }

    @Test
    public void testFirstNonRepeatedCharacterOutOfMany() {
        Assert.assertEquals(Repetition.getFirstNonRepeatedCharacter("bbaacclaamnn"), (Character) 'l');
    }

    @Test
    public void testAllCharactersRepeated() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbccaa");
        Assert.assertNull(firstNonRepeatedCharacter);
    }

    @Test
    public void testAllCharactersOccurOnlyOnce() {
        Assert.assertEquals(Repetition.getFirstNonRepeatedCharacter("abcde"), (Character) 'a');
    }

    @Test
    public void testEmptyString() {
        Assert.assertNull(Repetition.getFirstNonRepeatedCharacter(""));
    }
}
