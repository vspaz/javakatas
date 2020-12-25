package strings;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstNonRepeatedCharacterTest {
    @Test
    public void testSingleNonRepeatedCharacter_1() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbaacczaa");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'z');
    }

    @Test
    public void testSingleNonRepeatedCharacter_2() {
        Character firstNonRepeatedCharacter = Repetition.getFirstNonRepeatedCharacter("bbaacclaamnn");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'l');
    }
}
