package test_05.exercise13.Exercise13_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius of Circle1: ");
        double radius1 = input.nextDouble();
        ComparableCircle comparableCircle01 = new ComparableCircle(radius1);
        System.out.print("Input radius of Circle2: ");
        double radius2 = input.nextDouble();
        ComparableCircle comparableCircle02 = new ComparableCircle(radius2);
        comparableCircle01.CompareTo(comparableCircle02);
    }
}
