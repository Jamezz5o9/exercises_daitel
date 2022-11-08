package Chapter17;

import java.util.List;
import java.util.stream.Stream;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 3, 5, 6, 7);
        stream.peek(System.out::print).forEach(System.out::println);
        //stream.skip(6).filter(x -> x < 1).forEach(System.out::println);
    }
}
