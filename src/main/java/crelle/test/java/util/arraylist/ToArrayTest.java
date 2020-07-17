package crelle.test.java.util.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用toArray无参方法存在问题，此方法返回值只能是Object[]类，若强转其他类型数组将出现ClassCastException
 */
public class ToArrayTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("guan");
        list.add("bao");
        String[] array = new String[list.size()];
        array = list.toArray(array);
        for (String index:array) {
            System.out.println(index);
        }
    }
}
