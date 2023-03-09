package test_02.exercise4;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = input.nextInt();
        System.out.print("The result: ");
        Fibonacci(N);
    }

    static void Fibonacci(int N) {
        if (N <= 0) {
            System.out.println("Error!");
            return;
        }
        int num01 = 0, num02 = 1, temp;
        for (int i = 0; i < N; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%d\t", num01);
            temp = num02;
            num02 = num02 + num01;
            num01 = temp;
        }
    }
}
