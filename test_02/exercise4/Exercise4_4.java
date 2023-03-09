package test_02.exercise4;

public class Exercise4_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 999; i++) {
            TwinPrime(i);
        }
    }

    static void TwinPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }
        for (int i = 2; i <= Math.sqrt(num + 2); i++) {
            if ((num + 2) % i == 0) {
                return;
            }
        }
        System.out.println("(" + num + "," + (num + 2) + ")");
    }
}
