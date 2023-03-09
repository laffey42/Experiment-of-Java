package test_02.exercise3;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nine number:");
        String num_nine = input.next();
        double sum = 0;
        double num = Double.parseDouble(num_nine);
        for (int i = 1; i < 10; i++) {
            sum += i * (int) (num / Math.pow(10, 10 - i));
            num = num - Math.pow(10, 10 - i) * (int) (num / Math.pow(10, 10 - i));
        }
        sum = (int) (sum % 11);
        if (sum == 10) {
            System.out.println("The ISBN is " + num_nine + "X");
        } else {
            System.out.print("The ISBN is " + num_nine + (int) sum);
        }
    }
}
