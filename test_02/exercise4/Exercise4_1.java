package test_02.exercise4;

public class Exercise4_1 {
    public static void main(String[] args) {
        Exercise4_1 test = new Exercise4_1();
        test.sing("chicks", "chick");
        test.sing("cows", "moo");
        test.sing("ducks", "quack");
        test.sing("pigs", "oink");
    }

    void sing(String str_01, String str_02) {
        System.out.println("Old MacDonald had a farm, e i e i o \n" +
                "And on his farm he had some " + str_01 + ", e i e i o \n" +
                "with a " + str_02 + " " + str_02 + " here and a " + str_02 + " " + str_02 + "\n" +
                "there \n" +
                "here a " + str_02 + " there a " + str_02 + "\n" +
                "everywhere a " + str_02 + " " + str_02 + "\n" +
                "Old MacDonald had a farm, e i e i o \n");
    }
}
