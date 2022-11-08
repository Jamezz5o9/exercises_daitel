package Chapter17;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.stream.Collectors;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        System.out.println("Random numbers on separate lines:");
        secureRandom.ints(10, 1, 7).forEach(System.out::println);

        String numbers = secureRandom.ints(10, 1, 7).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(numbers);


    }
}
