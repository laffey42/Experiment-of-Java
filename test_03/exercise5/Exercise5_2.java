package test_03.exercise5;

import java.util.Scanner;

public class Exercise5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = 0, MAXSIZE = 128;
        int[] temp = new int[MAXSIZE];
        int num = input.nextInt();
        while (num != 0) {
            temp[length++] = num;
            num = input.nextInt();
        }
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = temp[i];
        }
        countingOccurrence(numbers);
    }

    public static void countingOccurrence(int[] numbers) {
        int[] count = new int[100];
        for (int i = 0; i < numbers.length; i++)
            count[numbers[i] - 1]++;
        for (int i = 0; i < 100; i++) {
            if (count[i] != 0) {
                if (count[i] == 1) {
                    System.out.println(i + 1 + " occurs " + count[i] + " time");
                } else {
                    System.out.println(i + 1 + " occurs " + count[i] + " times");
                }
            }
        }
    }
}
