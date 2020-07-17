package crelle.test.java.util.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 * 使用工具类Arrays.asList()把数组转化成对象集合时，不能使用其修改集合相关的方法，
 * 它的add/remove/clear方法会抛出UnsupportOperationException
 */
public class ArrayAsListTest {
    public static void main(String[] args) {
        String[] str = new String[]{"a","b","c"};
        List list = Arrays.asList(str);
        //第一种情况抛出 java.lang.UnsupportedOperationException
//        list.add("d");
        //第二种情况
        System.out.println(list.get(0));
        str[0] = "gujin";
        System.out.println(list.get(0));
    }
}
