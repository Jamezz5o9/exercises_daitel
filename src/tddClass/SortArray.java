package tddClass;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {7, 40, 12, 76, 99, 41, 71, 10, 11, 75, 43};
        sortLocally(arr);
    }

    private static void sortLocally(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
