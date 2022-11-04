package ChapterSeventeen.FunctionInerfaceImp;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator  = (num, number) -> number * num;
        int result = binaryOperator.apply(2, 90);
        System.out.println(result);

        BinaryOperator<String> binary2 = (num, name) -> num + name;
    }
}
