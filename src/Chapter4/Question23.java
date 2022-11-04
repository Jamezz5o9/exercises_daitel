package Chapter4;

import java.util.Scanner;

public class Question23 {

    public static void main(String[] args) {
        checkAnther();
    }

        public static void newInt(){
            Scanner input = new Scanner(System.in);
            int firstLargest = 0;
            int secondLargest = 0;
            for(int i = 0; i < 10; i++){
                System.out.println("please enter your input: ");
                int num  = input.nextInt();

                boolean firstInput = num > firstLargest;
                if(firstInput){
                    firstLargest = num;
                }
                if( num > secondLargest && num < firstLargest){
                    secondLargest = num;
                }

            }
            System.out.printf("The largest Number is:%d%nThe second largest Number is:%d%n", firstLargest, secondLargest);

        }
        public static void checkAnther(){
        Scanner input = new Scanner(System.in);
        int enterNew = 0;
        do{
            System.out.println("Enter any value");
            enterNew = input.nextInt();
        }while(enterNew != 1 && enterNew != 2);
}



}
