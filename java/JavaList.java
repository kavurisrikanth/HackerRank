package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        sc.nextLine();

        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String op = sc.nextLine();
            try {
                if (op.equalsIgnoreCase("insert")) {
                    String[] pieces = sc.nextLine().split(" ");
                    int[] data = new int[2];
                    for (int j = 0; j < 2; j++) {
                        data[j] = Integer.parseInt(pieces[j]);
                    }

                    arr.add(data[0], data[1]);
                } else {
                    // Delete case
                    int ind = Integer.parseInt(sc.nextLine());
                    arr.remove(ind);
                }
            } catch (IndexOutOfBoundsException ie) {

            }
        }

        System.out.println(prettify(arr));
        sc.close();
    }

    private static String prettify(List<Integer> arr) {
        StringBuilder sb = new StringBuilder();
        int sz = arr.size();
        for (int i = 0; i < sz; i++) {
            sb.append(arr.get(i));
            if (i != sz - 1)
                sb.append(" ");
        }

        return sb.toString();
    }
}
