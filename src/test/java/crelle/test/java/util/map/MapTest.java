package crelle.test.java.util.map;

import com.alibaba.fastjson.JSON;
import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @Author: 张强
 * @Date: 2024/11/28 16:48
 * @Description:
 */
public class MapTest {
    @Test
    public void test1() {

        Map<Integer, String>[] mapArray = new HashMap[]{
                new HashMap<Integer, String>() {{
                    put(0, "就地");
                    put(1, "远程");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "停止");
                    put(1, "运行");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "正常");
                    put(1, "故障");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "24非闭锁");
                    put(1, "24闭锁");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "27非闭锁");
                    put(1, "27闭锁");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "29非闭锁");
                    put(1, "29闭锁");
                }}
        };

        int iWarn = Integer.parseInt(String.valueOf(100));
        System.out.println(iWarn);
        System.out.println("##############################");
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (int i = 0; i < mapArray.length; ++i) {
            int key = (iWarn >> i) & 0x1;
            List<String> list = resultMap.get(key);
            if (CollectionUtils.isEmpty(list)) {
                list = new ArrayList<>();
            }
            String value = mapArray[i].get((iWarn >> i) & 0x1);
            list.add(value);
            resultMap.put(key, list);
        }

        // 使用 forEach 和 Lambda 遍历 map 的 key 和 value
        resultMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

    }


    @Test
    public void test2() {

        Map<Integer, String>[] mapArray = new HashMap[]{
                new HashMap<Integer, String>() {{
                    put(0, "就地");
                    put(1, "远程");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "停止");
                    put(1, "运行");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "正常");
                    put(1, "故障");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "24非闭锁");
                    put(1, "24闭锁");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "27非闭锁");
                    put(1, "27闭锁");
                }},
                new HashMap<Integer, String>() {{
                    put(0, "29非闭锁");
                    put(1, "29闭锁");
                }}
        };

        int iWarn = Integer.parseInt(String.valueOf(100));
        System.out.println(iWarn);
        Map<Integer, List<String>> resultMap = new HashMap<>();
        List<Integer> keyList = new ArrayList<>();
        for (int i = 0; i < mapArray.length; ++i) {
            int key = (iWarn >> i) & 0x1;
            keyList.add(key);
        }

        System.out.println("##############################");
        keyList.forEach(System.out::println);
    }

    @Test
    public void test3() {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        String s = map.get(null);
        System.out.println(s);

    }

    @Test
    public void test4() {
        List<Person> personsLists = Utils.getPersonsLists();
        Map<String, Person> collect = personsLists.stream().collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println(JSON.toJSONString(collect));

    }



}
