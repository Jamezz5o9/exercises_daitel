package Chapter7;

public class PassArray {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 4, 6};


        System.out.printf("%n%n Effects of passing array element value: %n" + "array[3] before modifyElement: %d%n", array[3]);

        for (int value: array){
            System.out.printf("   %d", value);
        }
    }

}
