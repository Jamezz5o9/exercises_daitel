package Chapter17;

import java.util.List;

public class Example11 {
    public static void main(String[] args) {
        List<String> list = List.of("Tom", "Mickey", "Donald");
        var name = list.stream().findFirst().orElse("-1");
        System.out.println(name);
    }
}
