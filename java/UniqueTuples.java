package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-hashset/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueTuples {
    private static class Tuple {
        private String x, y;

        Tuple(String x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Tuple)) return false;
            return x.equals(((Tuple) obj).x) && y.equals(((Tuple) obj).y);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    private static ArrayList<String> nameOne = new ArrayList<>(),
                                     nameTwo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Set<Tuple> set = new HashSet<>();
        int sz = 0;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] names = sc.nextLine().split(" ");
            if (canInsert(names[0], names[1])) {
                nameOne.add(names[0]);
                nameTwo.add(names[1]);
                sz++;
            }
            System.out.println(sz);
//            set.add(new Tuple(names[0], names[1]));
//            System.out.println(set);
//            System.out.println(set.size());
        }
        sc.close();
    }

    private static boolean canInsert(String one, String two) {
        for (int i = 0; i < nameOne.size(); i++) {
            if (nameOne.get(i).equals(one) && nameTwo.get(i).equals(two))
                return false;
        }
        return true;
    }
}
