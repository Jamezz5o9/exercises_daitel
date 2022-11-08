package Chapter17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysStreams {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        System.out.printf("Original values: %s%n", Arrays.asList(values));

        System.out.println(Arrays.stream(values).sorted().collect(Collectors.toList()));
        Arrays.stream(values).filter(num -> num > 4).map(x -> x * x).forEach(x -> System.out.println(x + x));

        List<Integer> greaterThan4 = Arrays.stream(values).filter(x -> x > 4).collect(Collectors.toList());
        System.out.println(greaterThan4);
        System.out.println(greaterThan4.stream().sorted().collect(Collectors.toList()));

    }
}
