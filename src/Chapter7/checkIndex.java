package Chapter7;

public class checkIndex {
    private static   int[][] game = {{1, 4, 6, 9},
            {10, 5, 8},
            {22, 14, 7},
            {45, 12, 78}};
    public static void main(String[] args) {
       checkFirst();
        //multiplyArr(game);
    }
    public static void checkFirst() {
        for(int row = 0; row < game.length; row++){
            for(int col = 0; col < game[col].length; col++){
                System.out.printf("this is the result of the column %d%n", col);
            }
        }
    }

    public static void multiplyArr(int[][] value){
        for(int row = 0; row < value.length; row++){
            for(int col = 0; col < value[row].length; col++){
                int newValue = value[row][col] * 2;
                System.out.printf("The new Arrays are %d%n", newValue);
            }
        }
    }
}

