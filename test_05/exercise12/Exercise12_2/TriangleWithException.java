package test_05.exercise12.Exercise12_2;

public class TriangleWithException{
    double side1, side2, side3;
    TriangleWithException(){};
    public TriangleWithException(double side1, double side2, double side3){
        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 +side3 <= side1){
            throw new IllegalTriangleException("The triangle is illegal");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
