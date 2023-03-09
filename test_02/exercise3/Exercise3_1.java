package test_02.exercise3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor(0),rock(1),paper(2): ");
        int player_in = input.nextInt();
        Random random = new Random();
        int computer_in = random.nextInt(3);
        Game(player_in, computer_in);
    }

    static void Game(int player_in, int computer_in){
        if (player_in > 2 || player_in < 0) {
            System.out.println("error");
            return;
        }
        if (computer_in == 0) {
            System.out.print("The computer is scissor. ");
            if (player_in == 0) {
                System.out.println("You are scissor too. It is a draw.");
            } else if (player_in == 1) {
                System.out.println("You are rock. You won.");
            } else if (player_in == 2) {
                System.out.println("You are paper. You lost.");
            }
        } else if (computer_in == 1) {
            System.out.print("The computer is rock. ");
            if (player_in == 0) {
                System.out.println("You are scissor. You lost.");
            } else if (player_in == 1) {
                System.out.println("You are rock too. It is a draw.");
            } else if (player_in == 2) {
                System.out.println("You are paper. You won.");
            }
        } else if (computer_in == 2) {
            System.out.print("The computer is paper. ");
            if (player_in == 0) {
                System.out.println("You are scissor. You won.");
            } else if (player_in == 1) {
                System.out.println("You are rock. You lost.");
            } else if (player_in == 2) {
                System.out.println("You are paper too. It is a draw.");
            }
        }
    }
}
