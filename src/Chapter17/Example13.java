package Chapter17;

import java.util.Random;
import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2,3,4, 5,6,7,8);
        System.out.println(stream.findAny().orElseGet(() -> -1));

        Stream<Integer> stream1 = Stream.empty();
        var num = stream1.findAny().orElseGet(() -> new Random().nextInt());
        System.out.println(num);
    }
}
