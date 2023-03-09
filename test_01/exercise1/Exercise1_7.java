package test_01.exercise1;

public class Exercise1_7 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i <= 6; i++)
            sum = sum + Math.pow(-1.0, i % 2) / (2 * i + 1);
        System.out.println(4 * sum);
    }
}
