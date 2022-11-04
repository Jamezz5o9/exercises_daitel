package ChapterSeventeen.FunctionInerfaceImp;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, word) -> word.length() == number;
        System.out.println(biPredicate.test(5, "James"));

        Function<String, Integer> function = word -> word.length() * 2;
        int number = function.apply("hello");
        System.out.println(number);

    }
}
