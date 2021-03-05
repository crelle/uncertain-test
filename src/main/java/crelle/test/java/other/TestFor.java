package crelle.test.java.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

/**
 * @author:crelle
 * @className:TestFor
 * @version:1.0.0
 * @date:2021/3/1
 * @description:XX
 **/
public class TestFor {

    @Test
    public void test1() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        for (int list : list1) {
            System.out.println(list);
            for (int a : list2) {
                if (5 == a) {
                    break;
                } else {
                    System.out.println(a);
                }
            }
        }
    }

    @Test
    public void test2() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.forEach(list -> {
            System.out.println(list);
            list2.forEach(a -> {
                if (5 == a) {
                    return;
                } else {
                    System.out.println(a);
                }
            });
        });
    }

    @Test
    public void test3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("fu" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break;
                } else {
                    System.out.println("zi" + j);
                }
            }
        }

    }


}
