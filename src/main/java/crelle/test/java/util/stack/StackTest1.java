package crelle.test.java.util.stack;

import java.util.Stack;

/**
 * @author:crelle
 * @className:StackTest1
 * @version:1.0.0
 * @date:2020/9/14
 * @description:XX
 **/
public class StackTest1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("=============peek===========");
        System.out.println(stack.peek());
        System.out.println("=============pop===========");
        System.out.println(stack.pop());
        System.out.println("=============forEach===========");
        stack.forEach(System.out::println);
    }
}
