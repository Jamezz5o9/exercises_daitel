package ChapterSeventeen.StreamSamples;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6);
        System.out.println(numbers.stream().mapToInt(n -> n * 14).sum());
        System.out.println(numbers.stream().mapToInt(n -> 5 * 2).sum());

        numbers.stream().mapToInt(n -> n + 1).mapToObj(n->n).forEach(System.out::println);
    }
}
