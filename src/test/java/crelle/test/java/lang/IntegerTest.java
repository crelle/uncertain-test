package crelle.test.java.lang;


import org.junit.Test;

import java.math.BigInteger;

/**
 * @author:crelle
 * @className:StringTest
 * @version:1.0.0
 * @date:2021/5/19
 * @description:XX
 **/
public class IntegerTest {
    @Test
    public void test1() {
        Long a = 1L;
        Integer b = 1;
        System.out.println(a.equals(b));
        System.out.println(a.equals(b.longValue()));
    }
}

