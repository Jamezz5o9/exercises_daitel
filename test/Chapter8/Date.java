package Chapter8;

import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;

    public static void main(String[] args) {
         fibSequence();
        //System.out.println();
        //fibSequence2();

    }

    public static void fibSequence(){
        int newInput, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        newInput = input.nextInt();
        input.close();
        int[] array = new int[newInput];
        array[0] = 0;
        array[1] = 1;

        for(k = 2; k < newInput; k++){
            array[k] = array[k - 1] + array[k - 2];
            System.out.println("Nth number in fibonacci series is " +array[k-1]);
        }
    }
    public static void fibSequence2(){
        int n,k;
        Scanner snr= new Scanner(System.in);
        n=snr.nextInt();
        snr.close();
        int[] array =new int[n];
        // The space used here is O(N)
        array[0]=0;
        array[1]=1;
        for(k=2;k<n;k++)array[k]=array[k-1]+array[k-2];
        System.out.println("Nth number in Fibonacci series is "+array[k -1]);
    }
    public static void fibSequence3(){
        int n,k;
        Scanner snr= new Scanner(System.in);
        n=snr.nextInt();
        snr.close();
        int[] array =new int[n];
        // The space used here is O(N)
        array[0]=0;
        array[1]=1;
        for(k=2;k<n;k++){
            array[k]=array[k-1]+array[k-2];
            System.out.println("Nth number in Fibonacci series is "+array[n-1]);
        }

    }
}
