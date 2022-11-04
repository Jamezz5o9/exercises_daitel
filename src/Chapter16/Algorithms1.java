package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        Character[] letter = {'P', 'M', 'C'};
        List<Character> list = Arrays.asList(letter);
        System.out.println("list contains: ");
        output(list);

        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        Character[] copyLetter = new Character[3];
        List<Character> copyIntoList = Arrays.asList(copyLetter);

        Collections.copy(copyIntoList, list);
        output(copyIntoList);

        Collections.fill(list, 'J');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    private static void output(List<Character> character) {
        for(Character viewNew: character){
            System.out.printf("%s  ", viewNew);
        }

        System.out.printf("%nMax: %s", Collections.max(character));
        System.out.printf(" Min: %s%n", Collections.min(character));
    }
}
