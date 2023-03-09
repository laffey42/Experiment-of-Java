package test_02.exercise4;

import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        System.out.print("The result is " + String.format("%08x", num));
    }
}
