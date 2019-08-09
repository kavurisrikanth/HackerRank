package hackerrank.java;

/*
    Solution for https://www.hackerrank.com/challenges/java-generics/problem?h_r=next-challenge&h_v=zen
 */

import java.lang.reflect.Method;

class Printer<T> {
    void printArray(T[] arr) {
        for (T t: arr)
            System.out.println(t);
    }
}

public class GenericPrint {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
