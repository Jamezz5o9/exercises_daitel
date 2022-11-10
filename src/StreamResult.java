import java.util.Arrays;
import java.util.List;

public class StreamResult {
    public static void main(String[] args) {
        List<String> word = List.of("ABC111", "123ABV");
        calculalateInt(word);
        checkStreamStyle(word);

    }
    private static void calculalateInt(List<String> elements) {
        int count = 0;
        for (String num : elements) {
            for (int j = 0; j < num.length(); j++) {
                char elem = num.charAt(j);
                if (Character.isDigit(elem)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }

    public static void checkStreamStyle(List<String> elements){
        System.out.println(elements.stream().reduce("", (i, j) -> i + j).chars().filter(Character::isDigit).count());
    }

    public static long countDigits(List<String> words){
        String digits = "0123456789";
        return words.stream().flatMap((s) -> Arrays.stream(s.split(""))).filter(digits::contains).count();
    }
}
