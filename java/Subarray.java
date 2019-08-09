package hackerrank.java;

/*
    Solution to https://www.hackerrank.com/challenges/java-negative-subarray/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        if (len <= 0) {
            System.out.println("0");
            sc.close();
            return;
        }

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(go(arr));
        sc.close();
    }

    /**
     * Returns the number of subarrays whose sum equals a negative number, given an array of ints.
     * @param arr - The array
     * @return - The result
     */
    private static int getNumNegSubarrays(int[] arr) {
        int ans = 0;
        int n = 1, i;

        while (n <= arr.length) {
            i = 0;
            while (i <= arr.length - n) {
                if (getSum(arr, i, n) < 0) ans++;
                i++;
            }
            n++;
        }

        return ans;
    }

    private static int getSum(int[] arr, int from, int len) {
        int n = 0;
        int ans = 0;
        while (n < len) {
            ans += arr[from++];
            n++;
        }
        return ans;
    }

    /**************
     * A somewhat more optimal solution.
     */

    private static int[] sumFromFront;
    private static int go(int[] arr) {
        int len = arr.length;
        int ans = 0;
        int sum = 0;
        sumFromFront = new int[len];

        sumFromFront[0] = arr[0];
        sum += arr[0];
        if (arr[0] < 0) ans++;
        for (int i = 1; i < len; i++) {
            sumFromFront[i] = sumFromFront[i - 1] + arr[i];
            sum += arr[i];
            if (arr[i] < 0) ans++;
        }
        if (sum < 0) ans++;

        int rem = 1;
        while (rem < len - 1) {
            int l = rem, r = 0;
            while (l >= 0) {
                r = rem - l;
                if (getSumWithRemovals(arr, l, len - 1 - r) < 0) ans++;
                l--;
            }
            rem++;
        }

        return ans;
    }

    private static int getSumWithRemovals(int[] arr, int l, int r) {
        return sumFromFront[r] - (sumFromFront[l] - arr[l]);
    }
}
