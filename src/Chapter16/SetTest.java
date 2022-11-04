package Chapter16;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        List<String> list2 = new ArrayList<>(Arrays.asList(colors));
        List<String> newList = new ArrayList<>();

        Collections.sort(list);
        System.out.printf("New List: %s%n", newList);
        System.out.printf("List: %s%n", list2);
        System.out.printf("List: %s%n", list);
        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> list) {
        Set<String> values = new HashSet<>(list);


        for(String value: values){
            System.out.printf("%s ", value);
        }

        System.out.println();

    }
}
