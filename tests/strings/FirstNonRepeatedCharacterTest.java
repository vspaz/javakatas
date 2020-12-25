package strings;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstNonRepeatedCharacterTest {
    @Test
    public void testFirstAndOnlyNonRepeatedCharacter() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbaacczaa");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'z');
    }

    @Test
    public void testFirstNonRepeatedCharacterOutOfMany() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbaacclaamnn");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'l');
    }

    @Test
    public void testAllCharactersRepeated() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbccaa");
        Assert.assertNull(firstNonRepeatedCharacter);
    }

    @Test
    public void testAllCharactersOccurOnlyOnce() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("abcde");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'a');
    }
}
