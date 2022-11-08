package Chapter17;

import java.util.List;
import java.util.stream.Collectors;

public class ArraysExample2 {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("Mavericks", "Rockets"),
                List.of("Unicorns", "Luminaries"),
                List.of("Maven", "Technophiles")
        );


        var lst = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(lst);
    }
}
