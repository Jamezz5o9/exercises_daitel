package ChapterSeventeen.FunctionInerfaceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i) -> System.out.print(i * 2 + " ");
        //consumer.accept(60);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.forEach(number -> System.out.println(number * 2));
        numbers.forEach(consumer);
        System.out.println();
        List<Integer> freshList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        freshList.add(10);
        System.out.println(freshList);
        List<Integer> freshList2 = new ArrayList<>(List.of(8, 7, 2, 1, 9));
        freshList2.add(7);
        freshList2.add(9);
        System.out.println(freshList2);




    }
}
