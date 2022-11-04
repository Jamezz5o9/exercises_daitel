package Chapter4;

import java.security.SecureRandom;
import java.util.Scanner;

public class  Gross {
    public static void main(String[] args) {
        //goodsProfits();
        secureRandom2();
    }

    public static void goodsProfits(){
            Scanner input = new Scanner(System.in);
            int total = 0;
            int salary = 200;
            double profitOnGoods;
            for(int i = 1; i <= 10; i++){
                System.out.println("Please enter the goods sold");
                int goodPerWeek = input.nextInt();
                total += goodPerWeek;
            }
            profitOnGoods = total * 0.09;
            double salaryPlusProfit = profitOnGoods + salary;
            System.out.printf("The total values of goods sold per week is: %d%n", total);
            System.out.printf("Your profit on goods for this week is %.2f while your salary plus profit is %.2f",profitOnGoods, salaryPlusProfit);

    }

        public static void secureRandom(){
            SecureRandom randomNumbers = new SecureRandom();

            for(int i =1; i <= 20; i++){
                int face = 1+ randomNumbers.nextInt(6);

                System.out.printf("%d ", face);

                if(i % 5 == 0){
                    System.out.println();
                }
            }
        }

        public static void secureRandom2(){
        SecureRandom randomNumbers = new SecureRandom();
            int freq1 = 0;
            int freq2 = 0;
            int freq3 = 0;
            int freq4 = 0;
            int freq5 = 0;
            int freq6 = 0;

        for(int i = 1; i <= 60_000_000; i++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    ++freq1;
                    break;

                case 2:
                    ++freq2;
                    break;

                case 3:
                    ++freq3;
                    break;

                case 4:
                    ++freq4;
                    break;

                case 5:
                    ++freq5;
                    break;

                case 6:
                    ++freq6;
                    break;
            }
        }

            System.out.println("Face\tFrequency");
            System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", freq1, freq2, freq3, freq4, freq5, freq6);

        }

}


