package tddClass;

import java.util.Scanner;

public class AverageClass {
    public static void main(String[] args) {
       // checkClass();
    //checkGrade3();
    //unaryIncrement();
   unaryIncrement1();
        //multiplicationTable();

    }
    static void checkClass(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 5){
            System.out.println("Enter your grade");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
        }
        int average = total / 10;

        System.out.printf("The sum of your total input is: %d%n", total);
        System.out.printf("The average of your grade is: %d%n", average);
        }

        static void checkClass1(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter -1 to quit this loop");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.println("Enter -1 to quit this loop");
            grade = input.nextInt();
        }

        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades is %d%n", gradeCounter, total);
            System.out.printf("The class average is %.2f%n", average);
        } else{
            System.out.println("No value was entered");
        }
        }

        static void checkGrade3(){
            Scanner input = new Scanner(System.in);
            int studentCounter = 0;
            int passes = 0;
            int failure = 0;
            int noData = 0;


            while(studentCounter <= 10){
                System.out.println("Enter result");
                int result = input.nextInt();
                studentCounter = studentCounter + 1;

                if(result >= 40 && result <= 100){
                    passes = passes + 1;

                } else if (result >=1 && result <= 39) {
                    failure = failure + 1;
                } else {
                    noData = noData + 1;
                }
                }
            System.out.printf("Passed: %d students%nFailed: %d students%nNo Data: %d%n", passes, failure, noData);
            if(passes >= 8){
                System.out.printf("%d passes, Kudos to the instructor!%n", passes);
            }

        }
        static void unaryIncrement(){

        int c = 5;

        System.out.printf("C before postincrement is %d%n", c);
        System.out.printf("C postincrement is %d%n", c++);
        System.out.printf("C after postincrement is %d%n%n%n", c);

            c = 5;
            System.out.printf("C before preincrement is %d%n", c);
            System.out.printf("C preincrement is %d%n", ++c);
            System.out.printf("C after preincrement is %d%n", c);

        }

        static void unaryIncrement1(){
            Scanner input = new Scanner(System.in);
            int counter = 0;
            int total1 = 0;
            int total2 = 0;
            double milesPerGallon = 0;

            System.out.println("Please enter miles, enter -1 to quit");
            int miles = input.nextInt();

            System.out.println("Please enter gallon, enter -1 to quit");
            int gallon = input.nextInt();

            while(miles != -1){
                total1 += miles;
                total2 += gallon;
                milesPerGallon = (double) miles / gallon;
                counter++;

                System.out.printf("The miles per gallon is %.2f%n", milesPerGallon);

                System.out.println("Please enter miles, enter -1 to quit");
                miles = input.nextInt();


                System.out.println("Please enter gallon enter -1 to quit");
                gallon = input.nextInt();

            }

            if(counter != 0){
                double averageMiles = (double) total1 / counter;
                double averageGallon = (double) total2 / counter;
                System.out.printf("The total miles is %d%n while the total gallon is %d%n", total1, total2);
                System.out.printf("The average gallon is %.2f%n", averageGallon);
                System.out.printf("The average miles is %.2f%n", averageMiles);
                System.out.printf("The miles per gallon for each input is : %.2f%n", milesPerGallon);

            } else {
                System.out.println("You didn't enter any value pls try again!!!");
            }


        }

    static void multiplicationTable(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any num");
    int x = input.nextInt();
        for(int i = 1; i <= 12; i++){
            int t = i * x;
            System.out.printf("%d * %d = %d%n", i, x, t);
            //System.out.printf("Table1 %8d%n, Table2 %8d%n", firstNum, secondNum);

        }

//        for(int i = 1; i <= 24; i *= 2){
//            System.out.println(i);
//            for(int second = 2; second > i; second *= 2){
//                System.out.println(second);
//            }
        }
    }


