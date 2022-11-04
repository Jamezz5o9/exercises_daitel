package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Variable {

    private static int newInput;

    public static void main(String[] args) {
   // checkCorrect();
        checkSample();
      // checkAnotherOne();
    }
    public static void checkSample(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        int counter = 0;
        int total = 0;

        System.out.println("Please enter any value and use -1 to break the loop");
        newInput = input.nextInt();
        while(newInput != -1){
            total = total + newInput;
            counter = counter + 1;
            System.out.println("Please enter any value and use -1 to break the loop");
            newInput = input.nextInt();
            items.add(newInput);
        }

        double average = (double) total / counter;
        System.out.println(average);
    }

    public static void checkAnotherOne(){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else {
            System.out.println("No grades were entered");
        }
    }

    public static void checkCorrect(){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();

        for (int i =0; i < 5; i++){
            System.out.println("Please enter any value");
            newInput = input.nextInt();
            items.add(newInput);
        }

        calculateAverage(items, "The report of average result");
    }
    public static void checkInput(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();

        do{
            System.out.println("please enter any value, enter -99 to break the loop");
            newInput = input.nextInt();
            items.add(newInput);
        }while(newInput != -99);
        calculateAverage(items, "The average is : ");
    }
    public static void calculateAverage(ArrayList<Integer> items, String result) {
        System.out.println(result);
        int total = 0;
        for(Integer item : items){
            total += item;
        }
        System.out.printf("%d%n", total / items.size());
    }
}
