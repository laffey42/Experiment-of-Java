package test_04.exercise7;

import java.util.Scanner;

public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if (CheckPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean CheckPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int digCount = 0, letterCount = 0;
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                letterCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                letterCount++;
            }
        }
        if (digCount + letterCount == password.length()) {
            if (digCount >= 2) {
                return true;
            }
        }
        return false;
    }
}
