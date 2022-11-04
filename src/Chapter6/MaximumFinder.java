package Chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        findMaxAndMin();
    }

    public static void findMaxAndMin(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1, num2, num3);
        double result2 = minimum(num1, num2, num3);
        System.out.printf("The maximum number is : %.2f%n", result);
        System.out.printf("The minimum number is: %.2f%n", result2);
    }

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if(y > maximumValue){
            maximumValue = y;
        }
        if(z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }

    public static double minimum(double a, double b, double c){
        double minimumValue = a;

        if(b < minimumValue){
            minimumValue = b;
        }
        if(c < minimumValue){
            minimumValue = c;
        }
        return minimumValue;
    }

}
