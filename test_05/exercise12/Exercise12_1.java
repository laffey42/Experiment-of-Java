package test_05.exercise12;

import java.util.Scanner;

public class Exercise12_1 {
    static int[][] map = new int[9][9];
    static boolean[][] row = new boolean[9][10];
    static boolean[][] col = new boolean[9][10];
    static boolean[][] grid = new boolean[9][10];

    public static void creat() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                map[i][j] = input.nextInt();
            }
        }
    }

    public static void display() {
        System.out.println("Solution:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.print('\n');
        }
    }

    public static boolean dfs(int i, int j) {
        if (i == 9)
            return true;
        boolean flag;
        if (map[i][j] > 0) {
            if (j == 8)
                flag = dfs(i + 1, 0);
            else
                flag = dfs(i, j + 1);
            return flag;
        } else {
            int k = 3 * ((i - 1) / 3) + (j - 1) / 3;
            for (int x = 0; x < 9; x++) {
                if (!row[i][x] && !col[j][x] && !grid[k][x]) {
                    map[i][j] = x + 1;
                    row[i][x] = true;
                    col[j][x] = true;
                    grid[k][x] = true;
                    if (j == 8)
                        flag = dfs(i + 1, 0);
                    else
                        flag = dfs(i, j + 1);
                    if (!flag) {
                        map[i][j] = 0;
                        row[i][x] = false;
                        col[j][x] = false;
                        grid[k][x] = false;
                    } else
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        creat();
        dfs(0, 0);
        display();
    }
}
