public class TestingArray {
    public static void main(String[] args) {
        arrTest();
    }

    private static void arrTest() {
        int[] arr = new int[10];

        System.out.printf("%s%13s%n", "Counter", "Array value");
        for(int i = 0; i < arr.length; i++){
            arr[i] = 1;
            System.out.printf("%d%17d%n", i, arr[i]);
        }
    }
}
