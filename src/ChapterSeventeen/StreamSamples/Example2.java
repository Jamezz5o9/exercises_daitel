package ChapterSeventeen.StreamSamples;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
            int result = numbers.stream().map(n -> n * 2).reduce(0, (i, j) -> i + j);
            System.out.println(result);

        List<Integer> number = List.of(1, 2);
        int result2 = number.stream().map(n -> n * 2).reduce(1, (a, b) -> a * b);
        System.out.println(result2);
    }

}
