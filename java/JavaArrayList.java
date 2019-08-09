package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-arraylist/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrOfArrs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                arr.add(sc.nextInt());
            }
            arrOfArrs.add(arr);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(),
                y = sc.nextInt();
            try {
                System.out.println(arrOfArrs.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException ie) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
