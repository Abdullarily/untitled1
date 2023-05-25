import java.util.HashMap;
import java.util.Map;

public class Methods {

    public static int conversion(String input) {
        Map<Integer, String> romanNumerals1 = new HashMap<>();
        romanNumerals1.put(1, "I");
        romanNumerals1.put(2, "II");
        romanNumerals1.put(3, "III");
        romanNumerals1.put(4, "IV");
        romanNumerals1.put(5, "V");
        romanNumerals1.put(6, "VI");
        romanNumerals1.put(7, "VII");
        romanNumerals1.put(8, "VIII");
        romanNumerals1.put(9, "IX");
        romanNumerals1.put(10, "X");
        romanNumerals1.put(20, "XX");
        romanNumerals1.put(30, "XXX");
        romanNumerals1.put(40, "XL");
        romanNumerals1.put(50, "L");
        romanNumerals1.put(90, "XC");
        romanNumerals1.put(100, "C");
        int arabian = 0;
            for (Map.Entry<Integer, String> a : romanNumerals1.entrySet()) {
                if (a.getValue().equals(input)) {
                    arabian = a.getKey();
                }
            }
        return arabian;
    }

    public static int mathematicalOperation(String operation, int a, int b) {
        StringBuilder sb = new StringBuilder(operation);
        int out = 0;
        for (int i = 0; i < operation.length(); i++) {
            if (operation.charAt(i) == '+') {
                out = a + b;
            } if (operation.charAt(i) == '-') {
                out = a - b;
            } if (operation.charAt(i) == '/') {
                out = a / b;
            } if (operation.charAt(i) == '*') {
                out = a * b;
            }
        }

        return out;
    }

    public static String conversionRoman(int outputArabian) {

        Map<Integer, String> romanNumerals1 = new HashMap<>();
        romanNumerals1.put(1, "I");
        romanNumerals1.put(2, "II");
        romanNumerals1.put(3, "III");
        romanNumerals1.put(4, "IV");
        romanNumerals1.put(5, "V");
        romanNumerals1.put(6, "VI");
        romanNumerals1.put(7, "VII");
        romanNumerals1.put(8, "VIII");
        romanNumerals1.put(9, "IX");
        romanNumerals1.put(10, "X");
        romanNumerals1.put(20, "XX");
        romanNumerals1.put(30, "XXX");
        romanNumerals1.put(40, "XL");
        romanNumerals1.put(50, "L");
        romanNumerals1.put(90, "XC");
        romanNumerals1.put(100, "C");

        StringBuilder sb = new StringBuilder();
        if (outputArabian == 0) {
            sb.append("N");
        }
        while (outputArabian != 0) {
            if (outputArabian == 100) {
                sb.append("C");
                outputArabian = 0;
            }
            if (outputArabian > 89 && outputArabian < 100) {
                sb.append("XC");
                outputArabian = outputArabian - 90;
            }
            if (outputArabian < 90 && outputArabian > 49) {
                sb.append("L");
                outputArabian = outputArabian - 50;
            }
            if (outputArabian < 50 && outputArabian > 39) {
                sb.append("XL");
                outputArabian = outputArabian - 40;
            }
            if (outputArabian < 40 && outputArabian > 29) {
                sb.append("XXX");
                outputArabian = outputArabian - 30;
            }
            if (outputArabian < 30 && outputArabian > 19) {
                sb.append("XX");
                outputArabian = outputArabian - 20;
            }
            if (outputArabian < 20 && outputArabian > 9) {
                sb.append("X");
                outputArabian = outputArabian - 10;
            }
            if (outputArabian < 10 && outputArabian > 0) {
                for (Map.Entry<Integer, String> a : romanNumerals1.entrySet()) {
                    if (a.getKey() == outputArabian) {
                        sb.append(a.getValue());
                        outputArabian = outputArabian - a.getKey();
                    }
                }
            }
        }
        String output = String.valueOf(sb);
        return output;
    }
}
