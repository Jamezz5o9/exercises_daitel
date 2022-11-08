import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamResult {
    public static void main(String[] args) {
        List<String> word = List.of("ABC111", "123ABV");
        calculalateInt(word);
        checkStreamStyle(word);

    }
    private static int calculalateInt(List<String> elements) {
        char[] found = new char[elements.size()];
        int count = 0;
        for(int i = 0; i < elements.size(); i++){
            String num = elements.get(i);
            for(int j = 0; j < num.length(); j++){
                char elem = num.charAt(j);
                if(Character.isDigit(elem)){
                    count += 1;
                }
            }

        }
        return count;
    }

    public static void checkStreamStyle(List<String> elements){
        System.out.println(elements.stream().reduce("", (i, j) -> i + j).chars().filter(Character::isDigit).count());
    }

    public static long countDigits(List<String> words){
        String digits = "0123456789";
        return words.stream().flatMap((s) -> Arrays.stream(s.split(""))).filter(digits::contains).count();
    }
}
