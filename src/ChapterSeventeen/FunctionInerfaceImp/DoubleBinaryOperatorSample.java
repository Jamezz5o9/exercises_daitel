package ChapterSeventeen.FunctionInerfaceImp;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (num1, num2) -> num1 + num2;
        double result = doubleBinaryOperator.applyAsDouble(59.80, 100.56);
        System.out.println(result);
    }
}
