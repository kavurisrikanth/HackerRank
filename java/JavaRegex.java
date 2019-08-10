/*
    Solution to https://www.hackerrank.com/challenges/java-regex/problem
 */

import java.util.Scanner;

class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    String pattern;

    MyRegex() {
        String ipOctet = "(([0-1]?\\d{1,2})|2[0-4]\\d|25[0-5])";
        pattern = ipOctet + "\\." + ipOctet + "\\." + ipOctet + "\\." + ipOctet;
    }
}
