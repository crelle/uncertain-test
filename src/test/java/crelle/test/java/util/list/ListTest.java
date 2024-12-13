package crelle.test.java.util.list;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.*;


/**
 * @Author: 张强
 * @Date: 2024/11/28 16:48
 * @Description:
 */
public class ListTest {
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
        list1.addAll(list2);
        list1.add(0,100);
        System.out.println(list1);
    }

}
