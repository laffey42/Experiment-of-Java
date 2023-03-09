package test_05.exercise12.Exercise12_2;

import java.util.Scanner;

public class TestTriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 3 sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        try {
            TriangleWithException triangle = new TriangleWithException(side1, side2, side3);
            System.out.println("The triangle is legal");
        }catch(IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
