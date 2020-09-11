package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author:crelle
 * @className:MapTest
 * @version:1.0.0
 * @date:2020/8/15
 * @description:  <R> Stream<R> map​(Function<? super T,​? extends R> mapper)
 * Returns a stream consisting of the results of applying the given function to the elements of this stream.
 **/
public class MapTest {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","zhangsan");
        map.put("age",12);
        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("name","lisi");
        map1.put("age",13);
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("name","wangwu");
        map2.put("age",14);
        List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
        mapList.add(map);
        mapList.add(map1);
        mapList.add(map2);

        List<Person> personList = mapList.parallelStream().map(obj->{
            Person person = new Person();
            person.setName(MapUtils.getString(obj,"name"));
            person.setAge(MapUtils.getIntValue(obj,"age"));
            return person;
        }).collect(Collectors.toList());

        personList.parallelStream().forEach(person -> {
            System.out.println(person.getName()+" 年龄为 "+person.getAge());
        });
    }

    public void test1(){
        //map方法入参为person返回为person
        Utils.getPersonsLists()
                .stream()
                .map(person -> person)
                .forEach(System.out::println);

        System.out.println("##############################################");

        //map方法入参为person返回为人名
        Utils.getPersonsLists()
                .stream()
                .map(person -> person.getName())
                .forEach(System.out::println);

        System.out.println("##############################################");

        //map方法入参为person返回为111
        Utils.getPersonsLists()
                .stream()
                .map(person -> 111)
                .forEach(System.out::println);
    }
}
