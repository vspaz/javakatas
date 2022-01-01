package math;

public class DigitCounter {
    static int getDigitCount(final int num) {
        int remainder = num;
        int count = 0;
        while (remainder > 0) {
            remainder /= 10;
            count++;
        }
        return count;
    }
}
