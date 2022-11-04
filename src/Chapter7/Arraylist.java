package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        double[] doubleArrays = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArrays);
        System.out.printf("%ndoubleArray: %n");
//        for(double i = 0; i  < doubleArrays.length; i++){
//            System.out.printf("%.1f %.1f%n", i, doubleArrays[(int) i]);
//        }

        for (double value : doubleArrays) {
            System.out.printf("%.1f%n", value);

            int[] filledArray = new int[11];
            Arrays.fill(filledArray, 7);

            int[] intArray = {1, 2, 3, 4, 5, 6};
            int[] arrayCopy = new int[intArray.length];

            System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);
            displayArray(intArray, "intArray");
            displayArray(arrayCopy, "arrayCopy");

            boolean b = Arrays.equals(intArray, arrayCopy);
            System.out.printf("%n%nintArray %s  arrayCopy%n", (b ? "==" : "!="));

            b = Arrays.equals(intArray, filledArray);
            System.out.printf("%n%nintArray %s  filledArray%n", (b ? "==" : "!="));

            int location = Arrays.binarySearch(intArray, 5);

            if (location >= 0) {
                System.out.printf("Found 5 at element %d in intArray%n", location);
            } else {
                System.out.print("5 not found in intArray");
            }

            location = Arrays.binarySearch(intArray, 8763);
            if (location >= 0) {
                System.out.printf("Found 8763 at element %d in intArray%n", location);
            } else {
                System.out.print("8763 not found in intArray");
            }
        }

    }
    public static void newArrayList(){
            ArrayList<String> items = new ArrayList<>();

            items.add("apples");
            items.add(0, "yellow");
            items.remove(1);

            display(items, "list display" );


    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for(String item : items){
            System.out.printf("%s%n", item);
        }
    }

    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s: ", description);

        for(int value : array){
            System.out.printf("%d ", value);
        }
    }
}
