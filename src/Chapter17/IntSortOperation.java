package Chapter17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntSortOperation {
    public static void main(String[] args) {
        int[] list = {11, 1, 20, 30, 22, 81, 77, 10,15, 7,8};
        System.out.printf("Result of Sorted list %s%n",
                IntStream.of(list)
                         .sorted()
                         .mapToObj(String::valueOf)
                         .collect(Collectors.joining(" ")));
    }
}
