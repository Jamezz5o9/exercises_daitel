package Chapter17;

import java.util.List;
import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) {
        List<String> sequence = List.of("AAABC", "GBTRESx", "ASDFG", "ZXCVB");
        sequence.stream()
                .flatMap((seq) -> Stream.of(seq.length()))
                .forEach(System.out::println);

    }
}
