package Chapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        links.addFirst("cyan");
        links.addLast("red");
        links.add(2, "brown");
        links.add("pink");

        colors = links.toArray(new String[0]);

        System.out.println("Colors: ");

        for(String color: colors){
            System.out.println(color);
        }

    }
}
