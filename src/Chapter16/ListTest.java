package Chapter16;

import java.util.*;


public class ListTest {
    public static void main(String[] args) {
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String>  list1 = new LinkedList<>();
        Collections.addAll(list1, colors);

        String[] colors2 =
                {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, colors2);

        list1.addAll(list2);
        list2 = null;
        printList(list1);
        convertListToUpperCase(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    private static void printReversedList(List<String> list1) {
        ListIterator<String> iterator = list1.listIterator(list1.size());
        System.out.printf("%nReversed: %n");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
    private static void removeItems(List<String> list1, int start, int end) {
        list1.subList(start, end).clear();
    }

    private static void convertListToUpperCase(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printList(List<String> list){
        System.out.printf("%nList%n");
        for(String listA : list){
            System.out.printf("%s ", listA);
        }
        System.out.println();
    }
}
