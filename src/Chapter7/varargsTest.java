package Chapter7;

public class varargsTest {
    public static double average(double... numbers){
        double total = 0;

        for(double d: numbers) {
            total += d;
        }
        return total /  numbers.length;
        }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("The average of d1 and d1 is %.2f%n", average(d1, d2));
        System.out.printf("The average of d2 and d3 is %.2f%n", average(d2, d3));
        System.out.printf("The average of d4 and d2 is %.2f%n", average(d4, d2));
    }

}
