package Chapter17;

import java.util.function.Function;
import java.util.stream.Stream;

public class ArraysandStream2 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6);
        Function<Integer, Integer> function = num ->  num * num;
        nums.map(num -> num * num).forEach(System.out::println);
        nums.map(function).forEach(System.out::println);

    }
}
