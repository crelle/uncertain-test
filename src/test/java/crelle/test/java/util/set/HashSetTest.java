package crelle.test.java.util.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Administrator on 2024/5/8.
 *
 * @author 张强
 */
public class HashSetTest {

    @Test
    public void test1() {
        // 假设已经有了 orderGoodDetailMapKeys 和 modifiedKeys
        Set<String> orderGoodDetailMapKeys = new HashSet<>();
        orderGoodDetailMapKeys.add("a");
        orderGoodDetailMapKeys.add("b");
        orderGoodDetailMapKeys.add("c");
        Set<String> modifiedKeys = new HashSet<>();
        modifiedKeys.add("a");
        // 创建一个新的集合来存放过滤后的键
        Set<String> filteredKeys = new HashSet<>(orderGoodDetailMapKeys);

        // 过滤掉 modifiedKeys 中存在的键
        filteredKeys.removeAll(modifiedKeys);

        // 打印过滤后的键集合
        System.out.println(filteredKeys);
    }

    @Test
    public void test2() {
        String cacheToken = null;
        if (null == cacheToken || cacheToken.isEmpty()) {
            System.out.println("111111");
        }
        System.out.println("222222");
    }
}
