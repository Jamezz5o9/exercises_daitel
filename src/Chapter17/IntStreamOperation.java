package Chapter17;

import java.util.stream.IntStream;

public class IntStreamOperation {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values)
                        .reduce(0, Integer::sum));

        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values)
                        .reduce((x, y) -> x * y).getAsInt());
    }
}
