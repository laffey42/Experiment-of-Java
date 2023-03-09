package test_04.exercise6.Exercise6_2;

public class Test {
    public static void Print(RegularPolygon regularPolygon) {
        System.out.println("perimeter: " + regularPolygon.getPerimeter());
        System.out.println("area: " + regularPolygon.getArea());
    }

    public static void main(String[] args) {
        RegularPolygon regularPolygon_01 = new RegularPolygon();
        RegularPolygon regularPolygon_02 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon_03 = new RegularPolygon(10, 4, 5.6, 7.8);
        Print(regularPolygon_01);
        Print(regularPolygon_02);
        Print(regularPolygon_03);
    }
}
