package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author:crelle
 * @className:CollectorsTest
 * @version:1.0.0
 * @date:2020/12/4
 * @description:XX
 **/
public class CollectorsTest {
    public static void main(String[] args) {
        test2();
    }

    /**
     *@author:crelle
     *@date:2020/12/4
     *@title:test1
     *@description:
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test1(){
        Map<String,String> map = Utils.getPersonsLists().stream().collect(Collectors.toMap(person -> person.getName(), person -> person.getEmailAddress()));
        System.out.println(map);
    }

    /**
     *@author:crelle
     *@date:2020/12/4
     *@title:test2
     *@description:
     *@params:
     * keyMapper - a mapping function to produce keys
     * valueMapper - a mapping function to produce values
     * mergeFunction - a merge function, used to resolve collisions between values associated with the same key, as supplied to Map.merge(Object, Object, BiFunction)
     * mapFactory - a supplier providing a new empty Map into which the results will be inserted
     *@return:void
     *@throw:
     */
    private static void test2(){
        String oldEmail = "123@qq.com";
        Map<String,String> map = Utils.getPersonsLists().stream().collect(Collectors.toMap(person -> person.getName(), person -> person.getEmailAddress(),(oldValue,newValue)->newValue,ConcurrentHashMap::new));
        System.out.println(map);
    }
}
