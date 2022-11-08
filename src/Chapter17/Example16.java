package Chapter17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example16 {
    public static void main(String[] args) {
        //checkwell();

        List<String> words = List.of("QWERTY", "YUIOU", "YUIOU", "ASDFG^T", "ZXCVB", "POIUYCVB");
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap((str) -> str, String::length, (a, b) -> a + b));
        System.out.println(map);
    }

    private static void checkwell() {
        Stream<Integer> nums = Stream.of(1, 23, 45, 6, 6, 7, 7, 9);
        Set<Integer> set = nums.collect(Collectors.toSet());
        Set<Integer> setOrdered = nums.sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(set);
        System.out.println(setOrdered);
    }
}
