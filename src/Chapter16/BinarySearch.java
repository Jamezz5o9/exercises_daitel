package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow",
                "purple", "tan", "pink"};

        List<String> list = new ArrayList<>(Arrays.asList(colors));
        Collections.sort(list);

        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua"); // below lowest
        printSearchResults(list, "gray"); // does not exist
        printSearchResults(list, "teal");

    }

    private static void printSearchResults(List<String> list, String key) {
        System.out.printf("%nSearching for: %s%n", key);
        int result = Collections.binarySearch(list, key);
        if(result > 0){
            System.out.printf("Found at index %d%n", result);
        }else{
            System.out.printf("Not Found (%d)%n",result);
        }
    }
}
