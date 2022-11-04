package ChapterSeventeen.FunctionInerfaceImp;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> students = (name, number)  -> System.out.println(name+ " " +number);
        students.accept("James", 1);
        students.accept("Bolaji", 2);
        students.accept("Jerry", 3);
        System.out.println();
        System.out.println(students);

        Map<String, Integer> freshStudents = Map.of("Banke", 1,
                "Temilola", 2,
                "Favour", 3,
                "Yusuf", 4);

        freshStudents.forEach((name, position)->System.out.println(name+"   "+position));
        System.out.println("Second Result for the BiConsumer part");
        freshStudents.forEach(students);
    }
}
