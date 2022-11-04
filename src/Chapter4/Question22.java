package Chapter4;

public class Question22 {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s%n", "N", "N^2", "N^3", "N^4");
        for(int i = 1; i <= 5; i++){
            int numB = i * i;
            int numC = i * i * i;
            int numD = i * i * i * i;

            System.out.printf("%d%10d%10d%10d%n", i, numB, numC, numD);
        }
    }
}
