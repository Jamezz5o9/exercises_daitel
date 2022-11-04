package Chapter16;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest{
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green"};
        SortedSet<String> list = new TreeSet<>(Arrays.asList(colors));
        System.out.printf("Sorted List: %s%n", list);
        System.out.println();
        printSet(list);

    }

    private static void printSet(SortedSet<String> list) {
        for(String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
