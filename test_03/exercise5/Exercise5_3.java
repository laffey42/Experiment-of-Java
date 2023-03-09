package test_03.exercise5;

import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int num01 = input.nextInt();
        int[] list1 = new int[num01];
        for (int i = 0; i < num01; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int num02 = input.nextInt();
        int[] list2 = new int[num02];
        for (int i = 0; i < num02; i++) {
            list2[i] = input.nextInt();
        }
        if (equal(list1, list2)) {
            System.out.println("Two lists are identical.");
        } else {
            System.out.println("Two lists are not identical.");
        }
    }

    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        int length = list1.length;
        for (int i = 0; i < length - 1; i++) {
            int temp01 = list1[i], mark01 = i;
            int temp02 = list2[i], mark02 = i;
            for (int j = i + 1; j < length; j++) {
                if (list1[j] < temp01) {
                    temp01 = list1[j];
                    mark01 = j;
                }
                if (list2[j] < temp02) {
                    temp02 = list2[j];
                    mark02 = j;
                }
            }
            list1[mark01] = list1[i];
            list1[i] = temp01;
            list2[mark02] = list2[i];
            list2[i] = temp02;
        }
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (list1[i] != list2[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
