package Chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        firstStream();
        secondStream();
    }

    private static void secondStream() {
    }

    private static void firstStream() {
        int sumOfDigit = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sumOfDigit);
        int sumOfDigit2 = IntStream.range(1, 10).sum();
        System.out.println(sumOfDigit2);
    }
}
