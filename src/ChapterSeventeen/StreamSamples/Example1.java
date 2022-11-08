package ChapterSeventeen.StreamSamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        // 1. using the empty factory method from the steam
        // interface
        Stream<Integer> numberStream = Stream.empty();

        //2. using the steam utility method of class Arrays
        Integer[] numbers ={2, 4, 5, 6, 7,8,9};
        Stream<Integer> integerStream = Arrays.stream(numbers);//finite stream

        //3. using the method generate of class stream
        Stream<Integer> nums = Stream.generate(() -> 5);// infinite stream
        nums.limit(5)
            .forEach(n -> System.out.println(n));

    }
}
