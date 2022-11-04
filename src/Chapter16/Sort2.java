package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("%s %s%n", "Unsorted Array List:", list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("%s %s%n", "Sorted Array List:", list);
    }
}
