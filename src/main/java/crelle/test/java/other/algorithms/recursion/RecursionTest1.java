package crelle.test.java.other.algorithms.recursion;

/**
 * @author:crelle
 * @className:RecursionTest1
 * @version:1.0.0
 * @date:2020/9/15
 * @description:XX
 **/

// A Java program to demonstrate working of
// recursion
public class RecursionTest1 {
    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1); // statement 2
            System.out.printf("%d ", test);
            return;
        }
    }

    public static void main(String[] args)
    {
        int test = 9;
        printFun(test);
    }
}

// This code is contributed by
// Smitha Dinesh Semwal

