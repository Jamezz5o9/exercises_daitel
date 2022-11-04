package Chapter11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideBeZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        boolean  continueLoop = true;

        do{
            try{
                System.out.print("Please input an Integer numerator: ");
                int numerator = input.nextInt();

                System.out.print("Please input an Integer denominator: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d  / %d = %d%n",numerator, denominator, result);
                continueLoop = false;
            }catch (InputMismatchException inputMismatchException){
                System.err.printf("%n Exception: %s%n", inputMismatchException);
                input.nextLine();
                System.out.printf("You must enter Integers. pls try again%n%n");
            }catch (ArithmeticException arithmeticException){
                System.err.printf("%n Exception: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator pls try again%n%n");
            }

        }while(continueLoop);



    }
}
