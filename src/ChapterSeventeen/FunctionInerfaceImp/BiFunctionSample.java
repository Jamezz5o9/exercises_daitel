package ChapterSeventeen.FunctionInerfaceImp;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (firstNumber, secondNumber) -> Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        int result = biFunction.apply("0", "1");
        System.out.println(result);
    }
}
