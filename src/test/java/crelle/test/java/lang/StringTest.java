package crelle.test.java.lang;

import org.junit.Test;

/**
 * @author:crelle
 * @className:StringTest
 * @version:1.0.0
 * @date:2021/5/19
 * @description:XX
 **/
public class StringTest {

    public void test1(String... strings) {
        System.out.println(strings);
    }

    @Test
    public void test2() {
        test1("a", "b", "c");
    }

    @Test
    public void test3() {
        String input = "http://139.196.125.106:85/horizon/oss/statics/public/32c8d8d126164b2d95769bd97a589641.png";
        String[] temp = input.split("/public/");
        System.out.println(temp[1]);
    }

    @Test
    public void test4() {
        String input = "a/b/c";
        String[] result = input.split("/b/");
        if (result != null && result.length == 2) {
            System.out.println(input);
            System.out.println(result[0]);
            System.out.println(result[1]);
        }

    }

}
