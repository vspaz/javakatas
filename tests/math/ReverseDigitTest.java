package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseDigitTest {
    @Test
    void testReverseDigitOk() {
        assertEquals(1234, ReversedDigit.reverseDigit(4321));
        assertEquals(1, ReversedDigit.reverseDigit(1));
    }
}
