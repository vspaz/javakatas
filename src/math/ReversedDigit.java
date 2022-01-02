package math;

public class ReversedDigit {
    public static int reverseDigit(int num) {
        int reversedDigit = 0;
        while (num > 0) {
            reversedDigit = reversedDigit * 10 + num % 10;
            num /= 10;
        }
        return reversedDigit;
    }
}