package test_04.exercise7;

import java.util.Scanner;

public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        StringBuilder strTemp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int num = getNumber(str.charAt(i));
            if (num == 0) {
                strTemp.append(str.charAt(i));
            } else {
                strTemp.append(num);
            }
        }
        str = strTemp.toString();
        System.out.println(str);
    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'a') {
            if (uppercaseLetter <= 'c') {
                return 2;
            } else if (uppercaseLetter <= 'f') {
                return 3;
            } else if (uppercaseLetter <= 'i') {
                return 4;
            } else if (uppercaseLetter <= 'l') {
                return 5;
            } else if (uppercaseLetter <= 'o') {
                return 6;
            } else if (uppercaseLetter <= 's') {
                return 7;
            } else if (uppercaseLetter <= 'v') {
                return 8;
            } else if (uppercaseLetter <= 'z') {
                return 9;
            }
        }else if (uppercaseLetter >= 'A') {
            if (uppercaseLetter <= 'C') {
                return 2;
            } else if (uppercaseLetter <= 'F') {
                return 3;
            } else if (uppercaseLetter <= 'I') {
                return 4;
            } else if (uppercaseLetter <= 'L') {
                return 5;
            } else if (uppercaseLetter <= 'O') {
                return 6;
            } else if (uppercaseLetter <= 'S') {
                return 7;
            } else if (uppercaseLetter <= 'V') {
                return 8;
            } else if (uppercaseLetter <= 'Z') {
                return 9;
            }
        }
        return 0;
    }
}
