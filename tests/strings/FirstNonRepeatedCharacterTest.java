package strings;

import org.testng.annotations.Test;
import org.testng.Assert;

public class FirstNonRepeatedCharacterTest {
    @Test
    public void testSingleNonRepeatedCharacter() {
        Character firstNonRepeatedCharacter = FristNonRepeatedCharacter.getFirstNonRepeatedChar("bbaacczaa");
        Assert.assertEquals(firstNonRepeatedCharacter, (Character) 'z');
    }
}
