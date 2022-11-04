package Chapter15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Blue");
        colors.add("Black");

        Map<String, String> map = new TreeMap<>();
        map.put("Name", "James");
        map.put("Surname", "Aduloju");

        Map<String, Integer> mapTwo = new TreeMap<>();
        mapTwo.put("A", 1);
        mapTwo.put("B", 2);

        System.out.println("from queue "+colors);
        System.out.println("from map "+map);
        System.out.println("from mapTwo"+mapTwo);


        Set<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println("from map -->"+num);
    }
}
