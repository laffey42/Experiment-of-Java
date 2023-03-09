package test_04.exercise6.Exercise6_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        System.out.println("Enter the array: ");
        double[][] arr = new double[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }
        Location location = locateLargest(arr);
        System.out.println("The location of the lagerest element is " + location.elem + " at (" + location.row + "," + location.column + ")");
    }

    public static Location locateLargest(double[][] arr) {
        Location location = new Location();
        location.elem = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > location.elem) {
                    location.elem = arr[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
