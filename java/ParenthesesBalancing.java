package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-stack/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ParenthesesBalancing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(isBalanced(line));
        }
        sc.close();
    }

    private static boolean isBalanced(String line) {
        if (line.isEmpty())
            return false;

        ArrayList<Character> stack = new ArrayList<>();
        int curInd = 0;
        for (int i = 0; i < line.length(); i++) {
            char cur = line.charAt(i);
            switch (cur) {
                case '(':
                case '{':
                case '[':
                    stack.add(cur);
                    curInd++;
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    if (stack.remove(--curInd) != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    if (stack.remove(--curInd) != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty())
                        return false;
                    if (stack.remove(--curInd) != '[')
                        return false;
                    break;
            }
        }

        return curInd == 0;
    }
}
