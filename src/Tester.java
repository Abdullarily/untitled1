import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        String input[] = {"V", "X"};
        Map<Integer, String> romanNumerals = new HashMap<>();
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(6, "VI");
        romanNumerals.put(7, "VII");
        romanNumerals.put(8,"VIII");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");

        romanNumerals.get(input[0]);
        romanNumerals.get(input[1]);
        System.out.println();
    }
}
