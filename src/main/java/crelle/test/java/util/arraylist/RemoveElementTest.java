package crelle.test.java.util.arraylist;

import java.util.*;
/**
 * @author:crelle
 * @className:RemoveElementTest
 * @version:1.0.0
 * @date:2020/9/13
 * @description:XX
 **/
// Java program to remove elements
// in an ArrayList
public class RemoveElementTest {

    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println("Initial ArrayList " + al);

        al.remove(1);

        System.out.println("After the Index Removal " + al);

        al.remove("Geeks");

        System.out.println("After the Object Removal " + al);
    }
}

