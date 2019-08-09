package hackerrank.java;

/*
    https://www.hackerrank.com/challenges/phone-book/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> book = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int number = Integer.parseInt(sc.nextLine());
            book.put(name, number);
        }

        while (sc.hasNextLine()) {
            String query = sc.nextLine();
            int number = book.getOrDefault(query, -1);
            if (number == -1)
                System.out.println("Not found");
            else
                System.out.println(query + "=" + number);
        }
        sc.close();
    }
}
