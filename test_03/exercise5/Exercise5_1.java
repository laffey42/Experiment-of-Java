package test_03.exercise5;

import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            numbers[i] = input.nextInt();
        numbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++)
            System.out.printf("%3d", numbers[i]);
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int length = 0;
        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                temp[length] = numbers[i];
                length++;
            }
        }
        int[] numbersNew = new int[length];
        for (int i = 0; i < length; i++) {
            numbersNew[i] = temp[i];
        }
        return numbersNew;
    }
}
