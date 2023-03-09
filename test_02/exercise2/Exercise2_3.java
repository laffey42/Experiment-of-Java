package test_02.exercise2;

import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        int num01 = input.nextInt();
        int num02 = 0;
        for (int i = 2; i >= 0; i--) {
            num02 += num01 / (int) Math.pow(10, i);
            num01 -= (int) Math.pow(10, i) * (num01 / (int) Math.pow(10, i));
        }
        System.out.println("The sum of the digits is " + num02);
    }
}
