package ChapterSeventeen.FunctionInerfaceImp;

import java.util.List;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 6, 8, 24, 400, 7, 9, 811, 8000, 10000};
        playWithStream(numbers);
        Supplier<String> supplier = () -> "Handsome";
        System.out.println(supplier.get().toUpperCase());
    }

    private static void playWithStream(Integer[] numbers) {
        List<Integer> numberList = List.of(numbers);
        numberList.stream().filter((number) -> number % 2 == 0).forEach(num -> System.out.println(num * 2 + " "));
    }
}
