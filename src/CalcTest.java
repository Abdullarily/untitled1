import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }
    public static String calc(String input) {
        int returned = 0;
        int returned2 = 0;
        String outputRoman = "";
        Integer output = 0;
        String outputLine = "";
        String[] num = input.split("[+\\-/*]");
        char numChar = num[0].charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' ||
                    input.charAt(i) == '/' || input.charAt(i) == '*') {
                count++;
            }
            if (count > 1) {
                System.out.println("Я ЕСТЬ ОШИБКА O_x");
                int a = 0 / 0;
            }
        }
        if (numChar >= 48 && numChar <= 57) {
            // метод арабских чисел
            output = Methods.mathematicalOperation(input, Integer.parseInt(num[0]), Integer.parseInt(num[1]));
            if (Integer.parseInt(num[0]) > 10 || Integer.parseInt(num[1])  > 10) {
                int a = 0 / 0;
            }
            outputLine = output.toString();
        } else {
            //метод римских чисел
            returned = Methods.conversion(num[0]);
            returned2 = Methods.conversion(num[1]);
            if (returned == 0 || returned2 == 0) {
                System.out.println("Я ЕСТЬ ОШИБКА O_x");
                int a = 0 / 0;
            }
            int outputArabian = Methods.mathematicalOperation(input, returned, returned2);
            if (outputArabian < 0) {
                System.out.println("Я ЕСТЬ ОШИБКА O_x");
                int a = 0 / 0;
            }
            outputRoman = Methods.conversionRoman(outputArabian);
            outputLine = outputRoman;

        }
        return outputLine;
    }
}
