package test_05.exercise12;

import java.util.Scanner;

public class Exercise12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        hexToDecimal(str);
    }

    static void hexToDecimal(String hexString) {
        try {
            char[] ch = hexString.toCharArray();
            int result = 0;
            for (int i = 0; i < ch.length; i++) {
                if (getHexValue(ch[i]) != -1) {
                    result += getHexValue(ch[i]) * Math.pow(16, ch.length - i - 1);
                } else {
                    throw new NumberFormatException();
                }
            }
            System.out.println("decimal: " + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int getHexValue(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10;
        } else if (ch >= 'a' && ch <= 'f') {
            return ch - 'a' + 10;
        } else {
            return -1;
        }
    }
}
