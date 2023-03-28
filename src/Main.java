import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите выражение");
        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();
        int k = 0;
        int j = 0;
        char operator;
        String[] data;

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };

        if (expression.contains("+")) {
            data = expression.split("\\+");
            operator = '+';
        } else if (expression.contains("-")) {
            data = expression.split("-");
            operator = '-';
        } else if (expression.contains("*")) {
            data = expression.split("\\*");
            operator = '*';
        } else if (expression.contains("/")) {
            data = expression.split("/");
            operator = '/';
        } else {
            throw new Exception("Введён неверный знак оператора или число превышает десять символов");
        }

        if (operator == '*' || operator == '/') {
            if (data[1].contains("\"")) {
                throw new Exception("Можно делить или умножать лишь на числа");
            }
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        }

        data = expression.split("[+-/*]");

        if (data.length > 2) {
            throw new Exception("Введены должны быть лишь два числа и один оператор");
        }

        if (data[0].equals(roman[1])) {
            data[0] = "1";
            k=1;
        } else if (data[0].equals(roman[2])) {
            data[0] = "2";
            k=1;
        } else if (data[0].equals(roman[3])) {
            data[0] = "3";
            k=1;
        } else if (data[0].equals(roman[4])) {
            data[0] = "4";
            k=1;
        } else if (data[0].equals(roman[5])) {
            data[0] = "5";
            k=1;
        } else if (data[0].equals(roman[6])) {
            data[0] = "6";
            k=1;
        } else if (data[0].equals(roman[7])) {
            data[0] = "7";
            k=1;
        } else if (data[0].equals(roman[8])) {
            data[0] = "8";
            k=1;
        } else if (data[0].equals(roman[9])) {
            data[0] = "9";
            k=1;
        } else if (data[0].equals(roman[10])) {
            data[0] = "10";
            k=1;
        }

        if (data[1].equals(roman[1])) {
            data[1] = "1";
            j=1;
        } else if (data[1].equals(roman[2])) {
            data[1] = "2";
            j=1;
        } else if (data[1].equals(roman[3])) {
            data[1] = "3";
            j=1;
        } else if (data[1].equals(roman[4])) {
            data[1] = "4";
            j=1;
        } else if (data[1].equals(roman[5])) {
            data[1] = "5";
            j=1;
        } else if (data[1].equals(roman[6])) {
            data[1] = "6";
            j=1;
        } else if (data[1].equals(roman[7])) {
            data[1] = "7";
            j=1;
        } else if (data[1].equals(roman[8])) {
            data[1] = "8";
            j=1;
        } else if (data[1].equals(roman[9])) {
            data[1] = "9";
            j=1;
        } else if (data[1].equals(roman[10])) {
            data[1] = "10";
            j=1;
        }

        if (k!=j){
            throw new Exception("Числа должны быть одного типа");
        }

        if (data[0].isEmpty()){
            throw new Exception("Оператор не может быть введён до числа или число не может быть отрицательным");
        }

        String result = null;
        if (operator == '+') {
            result = String.valueOf(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
        } else if (operator == '-') {
            result = String.valueOf(Integer.parseInt(data[0]) - Integer.parseInt(data[1]));
        } else if (operator == '*') {
            result = String.valueOf(Integer.parseInt(data[0]) * Integer.parseInt(data[1]));
        } else if (operator == '/') {
            result = String.valueOf(Integer.parseInt(data[0]) / Integer.parseInt(data[1]));
        } else {
            throw new Exception("Some exception");
        }

        if (k==0) {
            System.out.println(result);
        } else if (k==1 && !result.startsWith("-")) {
            System.out.println(roman[Integer.parseInt(result)]);
        } else {
            throw new Exception("Результат не может быть отрицательным");
        }

    }
}