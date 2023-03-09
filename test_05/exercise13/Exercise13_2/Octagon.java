package test_05.exercise13.Exercise13_2;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    double side;

    Octagon() {};

    Octagon(double side) {
        this.side = side;
        this.area = (2 + 4 / Math.sqrt(2)) * Math.pow(side, 2);
        this.perimeter = 8 * side;
    }

    public void display(){
        System.out.println("area: " + this.area);
        System.out.println("perimeter: " + this.perimeter);
    }

    public Octagon clone(){
        Octagon octagon = new Octagon();
        octagon = this;
        return octagon;
    }

    public void compareTo(GeometricObject geometricObject){
        if (this.area > geometricObject.area){
            System.out.println("Octagon1 is larger");
        }else if (this.area == geometricObject.area){
            System.out.println("Octagon1 equals to Octagon2");
        }else {
            System.out.println("Octagon2 is larger");
        }
    }

}
