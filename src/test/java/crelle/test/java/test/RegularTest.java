package crelle.test.java.test;

import crelle.test.java.auxiliary.beans.StoreType;
import org.junit.Test;

/**
 * @Author: 张强
 * @Date: 2024/5/30 9:12
 * @Description:
 */
public class RegularTest {

    @Test
    public void test1() {
        String str1 = "";
        String str2 = "123.45";
        String str3 = "abc";
        System.out.println(isNumeric(str1)); // true
        System.out.println(isNumeric(str2)); // true
        System.out.println(isNumeric(str3)); // false
    }
    public  boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
}
