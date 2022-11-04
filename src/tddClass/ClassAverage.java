package tddClass;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double gradecounter = 1;
        
        while(gradecounter <= 10){
            System.out.print("Enter your grade: ");
            double grade = sc.nextDouble();
            total = total + grade;
            gradecounter++;
        }

        double average = total / 10;
        System.out.printf("The sum of the total grade is %f%n", total);
        System.out.printf("The average of the grade is %f%n", average);
    }
}
