package test_04.exercise7;

import java.util.Scanner;

public class Exercise7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String str = input.next();
        Gene(str);
    }

    public static void Gene(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("ATG")) {
                i = i + 3;
                for (int j = i + 3; j < str.length(); j++) {
                    boolean flag_01 = str.substring(i, j).endsWith("TAG");
                    boolean flag_02 = str.substring(i, j).endsWith("TAA");
                    boolean flag_03 = str.substring(i, j).endsWith("TGA");
                    if (flag_01 || flag_02 || flag_03) {
                        String finalStr = str.substring(i, j - 3);
                        if (finalStr.length() % 3 == 0) {
                            System.out.println(finalStr);
                            i = j;
                            flag = true;
                        }
                    }
                }
            }
        }
        if (!flag){
            System.out.println("no gene is found");
        }
    }
}
