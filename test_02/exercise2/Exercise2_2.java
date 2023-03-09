package test_02.exercise2;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        System.out.print("Enter an ASCII code:");
        Scanner input = new Scanner(System.in);
        int code = input.nextInt();
        char ch = (char) code;
        System.out.println("The Charter for ASCII code " + code + " is " + ch);
    }
}
