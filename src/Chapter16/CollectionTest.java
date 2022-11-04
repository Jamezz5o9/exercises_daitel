package Chapter16;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        for(String color: colors){
            list.add(color);
        }

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for(String color: removeColors){
            removeList.add(color);
        }

        System.out.println("ArrayList: ");

        for(int element = 0; element < list.size(); element++){
            System.out.println(list.get(element));
        }

        removeColor(list, removeList);

        System.out.println("ArrayList after the removing from first collection");

        for(String color: list){
            System.out.println(color);
        }
    }

    private static void removeColor(List<String> list, List<String> removeList) {
        Iterator<String> iterableElement = list.iterator();
        while(iterableElement.hasNext()){
            if(removeList.contains(iterableElement.next())) iterableElement.remove();
            }
        }

}
