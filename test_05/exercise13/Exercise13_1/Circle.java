package test_05.exercise13.Exercise13_1;

public class Circle {
    double radius;
    double area;

    Circle() {
    }

    ;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
    }
}
