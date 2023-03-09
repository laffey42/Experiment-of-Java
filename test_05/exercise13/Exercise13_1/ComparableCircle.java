package test_05.exercise13.Exercise13_1;

public class ComparableCircle extends Circle implements Comparable {
    ComparableCircle() {};

    ComparableCircle(double radius) {
        super(radius);
    }

    public void CompareTo(Circle circle) {
        if (this.area > circle.area) {
            System.out.println("Circle1 is larger");
        } else if (this.area == circle.area) {
            System.out.println("Circle1 equals to Circle2");
        } else {
            System.out.println("Circle2 is larger");
        }
    }
}
