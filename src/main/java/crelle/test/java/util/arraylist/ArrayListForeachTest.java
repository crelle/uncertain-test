package crelle.test.java.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 不要在foreach循环里进行元素的remove/add操作，remove元素请使用Iterator方式，
 * 如果并发操作，需要对Iterator对象加锁。
 */
public class ArrayListForeachTest {
    public static void main(String[] args) {
        foreach();
//        iterator();

    }

    private static void  foreach(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp: a) {
            if("1".equals(temp)){
                a.remove(temp);
            }
        }
        for (String temp:a) {
            System.out.println(temp);
        }
    }

    private static void iterator(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        Iterator<String> it = a.iterator();
        while (it.hasNext()){
            String temp = it.next();
            if("2".equals(temp)){
                it.remove();
            }
        }
        for (String temp:a) {
            System.out.println(temp);
        }
    }
}
