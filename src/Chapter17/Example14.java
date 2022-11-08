package Chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 13, 45, 15, 16, 7);
       var result =  list.stream()
            .peek(System.out::print)
            .collect(Collectors.toList());
        System.out.println(result);


        List<String> words = List.of("AAA", "BBB", "BCCD", "HELLO");
        words.stream()
                .skip(2)
                .forEach(System.out::println);

        var sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        var sortedInDescendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedInDescendingOrder);

        System.out.println(list.stream().flatMapToInt(IntStream::of).average().orElse(-1));

        System.out.println(list.stream().flatMapToInt(IntStream::of).summaryStatistics());
        System.out.println(list.stream().count());
        List<String> word = List.of("ABC111", "123ABV");
        calculalateInt(word);

    }

    private static void calculalateInt(List<String> elements) {
        char[] found = new char[elements.size()];
        int count = 0;
        for(int i = 0; i < elements.size(); i++){
            String num = elements.get(i);
            for(int j = 0; j < num.length(); j++){
                char elem = num.charAt(j);
                if(Character.isDigit(elem)){
                    count += 1;
                }
            }

        }
    }

    public static void checkStreamStyle(List<String> elements){
        System.out.println(elements.stream().reduce("", (i, j) -> i + j).chars().filter(Character::isDigit).count());
    }
}
