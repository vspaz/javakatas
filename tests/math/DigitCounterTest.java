package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitCounterTest {
    @Test
    void testGetDigitCountOk() {
        assertEquals(4, DigitCounter.getDigitCount(1234));
        assertEquals(1,  DigitCounter.getDigitCount(9));
    }
}
