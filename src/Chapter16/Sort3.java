package Chapter16;

import Chapter8.Time2;

import java.util.*;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(12, 56, 59));
        list.add(new Time2(16, 30, 24));
        list.add(new Time2(19, 14, 39));

        list.sort(new TimeComparator());

        Collections.reverse(list);
        System.out.println(Collections.max(list, new TimeComparator()));
        System.out.println(Collections.min(list, new TimeComparator()));

        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
