package test_02.exercise3;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges:");
        double edge_01 = input.nextDouble();
        double edge_02 = input.nextDouble();
        double edge_03 = input.nextDouble();
        System.out.print("Can edges " + edge_01 + ", " + edge_02 + ", and " + edge_03 + " form a trangle?");
        double result_01 = edge_01 + edge_02 - edge_03;
        double result_02 = edge_02 + edge_03 - edge_01;
        double result_03 = edge_03 + edge_01 - edge_02;
        if (result_01 > 0 && result_02 > 0 && result_03 > 0) {
            System.out.println(" true");
        } else {
            System.out.println(" false");
        }
    }
}
