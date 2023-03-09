package test_04.exercise6.Exercise6_1;

public class Test {
    public static void Print(Rectangle rectangle){
        System.out.println("width: " + rectangle.width + "\theight: " + rectangle.height);
        System.out.println("area: " + rectangle.getArea());
        System.out.println("perimeter: " + rectangle.getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle_01 = new Rectangle(4, 40);
        Rectangle rectangle_02 = new Rectangle(3.5, 35.9);
        Print(rectangle_01);
        Print(rectangle_02);
    }
}
