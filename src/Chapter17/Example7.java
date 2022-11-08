package Chapter17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 22, 3, 4, 3, 4, 4, 5, 6, 7);
        list.stream().sorted().distinct().forEach(System.out::println);


        List<Woman> women = List.of(
                new Woman("Banke", 45),
                new Woman("Hasiz", 100),
                new Woman("Habiba", 67)
        );

        Map<String, Integer> map = new TreeMap<>();

        women.stream().map((woman) -> map.put(woman.getName(), woman.getAge())).collect(Collectors.toList());
        System.out.println(women.stream().sorted((w1, w2) -> Integer.compare(w2.getAge(), w1.getAge())).collect(Collectors.toList()));

        List<Woman> sortedWomen = women.stream().sorted(Comparator.comparing(Woman::getAge)).collect(Collectors.toList());
        System.out.println(sortedWomen);
        System.out.println();

        List<Woman> sortedSecond = women.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedSecond);

    }
}
