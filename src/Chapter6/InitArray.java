package Chapter6;

import java.util.Scanner;

public class InitArray {

    public static void main(String[] args) {
        //sumArray();
        //initArray();
        //mathTable();
        mathTable2();
        //newNum();
    }
    public static void initArray(){

        final int ARRAY_LENGHT = 10;
        int[] array = new int[ARRAY_LENGHT];

        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%10s%10s%n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%9d%9d%n", counter, array[counter]);
        }

    }
    public static void sumArray(){
        int[] array = {44, 45, 90, 89, 16, 88, 23, 76, 46, 89};
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }

        System.out.printf("The sum of the total student score is : %d", total);
    }

    public static void mathTable(){
        System.out.printf("%8s%18s%19s%19s%19s%n", "Table 1", "Table 2", "Table 3", "Table 4", "Table 5");
        for(int i = 1; i <= 12; i++){
            int firstNum = i * 1;
            int secondNum = i * 2;
            int thirdNum = i * 3;
            int fourthNum = i * 4;
            int fifthNum = i * 5;
            System.out.printf("%d * 1 = %d%10d * 2 = %d%12d * 3 = %d%10d * 4 = %d%10d * 5 = %d%n", i, firstNum, i, secondNum, i, thirdNum, i, fourthNum,i, fifthNum);
        }
    }
    public static void mathTable1(){
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter any number");
        int newInput = x.nextInt();
        for(int i = 1; i <= 12; i++){
            int result = i * newInput;
            System.out.printf("%d * %d = %d%n", i, newInput, result);
        }
    }

    public static void mathTable2(){
        System.out.printf("%5s%13s%13s%13s%13s%13s%13s%13s%13s%15s%15s%16s%n", "Table 1", "Table 2", "Table 3",
                "Table 4", "Table 5", "Table 6", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12");
        for(int i=1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                int num = i * j;
                System.out.printf("%d * %d = %d    ", i, j, num);
            }

           System.out.println();

        }


    }
    public static void newNum(){
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j < 4; j++){
                for(int k = 1; k <= 1; k++){
                    int num = i * 2;
                    System.out.printf("%d", num);
                }
            }

        }
        System.out.println();
    }


}
