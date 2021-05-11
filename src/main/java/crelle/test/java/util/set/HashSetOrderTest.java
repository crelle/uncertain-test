package crelle.test.java.util.set;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author:crelle
 * @className:HashSetTest
 * @version:1.0.0
 * @date:2021/4/22
 * @description:XX
 **/
public class HashSetOrderTest {

    @Test
    public void test1() {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("5");
        set.add("4");
        set.add("3");
        System.out.println(set.toString());
        Set<String> sortSet = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);//降序排列
            }
        });
        sortSet.addAll(set);
    }

    @Test
    public void test2(){

        Set<String> set = new HashSet<>();
        set.add("2");
        set.add("1");
        set.add("5");
        set.add("3");
        set.add("4");
        System.out.println(set.toString());
        Set<String> sortSet = new TreeSet<String>((o1, o2) -> o2.compareTo(o1));
        sortSet.addAll(set);
        System.out.println(sortSet.toString());
    }

    @Test
    public void test3(){

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("5");
        set.add("4");
        System.out.println(set.toString());

        Set<String> sortSet = new TreeSet<String>(Comparator.reverseOrder());
        sortSet.addAll(set);
        System.out.println(sortSet.toString());
    }

    @Test
    public void test4(){
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println(set.toString());
        //这里后续用有序的list处理即可，因为流中进行了倒序处理，收集成set后会重排
        List<String> collect = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }


}
