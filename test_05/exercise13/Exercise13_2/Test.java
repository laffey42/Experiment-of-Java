package test_05.exercise13.Exercise13_2;

public class Test {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5);
        octagon1.display();
        Octagon octagon2 = octagon1.clone();
        octagon1.compareTo(octagon2);
    }
}
