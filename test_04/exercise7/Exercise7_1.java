package test_04.exercise7;

import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char a = input.next().charAt(0);
        int result = count(str, a);
        if (result == 0) {
            System.out.println(a + " has not occurred in " + str);
        } else if (result == 1) {
            System.out.println(a + " occurs " + result + " time in " + str);
        } else {
            System.out.println(a + " occurs " + result + " times in " + str);
        }
    }

    public static int count(String str, char a) {
        int time = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                time = time + 1;
            }
        }
        return time;
    }
}
