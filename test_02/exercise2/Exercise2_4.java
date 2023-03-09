package test_02.exercise2;

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int num = input.nextInt();
        int[] score = new int[num];
        char[] grade = new char[num];
        System.out.print("Enter four scores:");
        int max = 0;
        for (int i = 0; i < num; i++) {
            score[i] = input.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }
        for (int i = 0; i < num; i++) {
            if (max - score[i] <= 10) {
                grade[i] = 'A';
            } else if (max - score[i] <= 20) {
                grade[i] = 'B';
            } else if (max - score[i] <= 30) {
                grade[i] = 'C';
            } else if (max - score[i] <= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade[i]);
        }
    }
}
