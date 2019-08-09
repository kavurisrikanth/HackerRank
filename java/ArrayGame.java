package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-1d-array/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class ArrayGame {
    private static boolean[] visited;

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        visited = new boolean[game.length];
        return playGame(0, leap, game);
    }

    private static boolean playGame(int start, int leap, int[] game) {
        visited[start] = true;
        if (start + leap >= game.length || start + 1 >= game.length)
            return true;

        boolean back = false, forward = false, jump = false;
        if (start - 1 >= 0 && game[start - 1] == 0 && !visited[start - 1]) {
            back = playGame(start - 1, leap, game);
        }

        if (start + 1 < game.length && game[start + 1] == 0 && !visited[start + 1]) {
            forward = playGame(start + 1, leap, game);
        }

        if (start + leap < game.length && game[start + leap] == 0 && !visited[start + leap]) {
            jump = playGame(start + leap, leap, game);
        }

        return back || forward || jump;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
