package Chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStream3 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        Integer[] list = {1, 2, 3, 4, 10, 11, 3, 3, 11, 45, 67};
        System.out.println(Arrays.stream(list).filter(x -> x > 10).collect(Collectors.toList()));

        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

        System.out.println(System.out.printf("strings less than n sorted ascending: %s%n",
                Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") > 0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList())));


        System.out.println(System.out.printf("strings less than n sorted ascending: %s%n",
                Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") > 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList())));


        var sum = Arrays.stream(list).reduce(0, Integer::sum);
        var result = sum / Arrays.stream(list).count();
        System.out.println(result);

    }
}
