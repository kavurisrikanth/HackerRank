package hackerrank.java;

/*
    Solution to https://www.hackerrank.com/challenges/java-date-and-time/problem
 */

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        /*
            Get input and pass to findDay.
         */
    }
}

class Result {
    /*
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        StringBuilder sb = new StringBuilder();
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.THURSDAY:
                sb.append("THURSDAY");
                break;
            case Calendar.FRIDAY:
                sb.append("FRIDAY");
                break;
            case Calendar.SATURDAY:
                sb.append("SATURDAY");
                break;
            case Calendar.SUNDAY:
                sb.append("SUNDAY");
                break;
            case Calendar.MONDAY:
                sb.append("MONDAY");
                break;
            case Calendar.TUESDAY:
                sb.append("TUESDAY");
                break;
            case Calendar.WEDNESDAY:
                sb.append("WEDNESDAY");
                break;
        }
        return sb.toString();
    }
}