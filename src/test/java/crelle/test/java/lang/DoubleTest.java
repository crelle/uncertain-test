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
public class DoubleTest {

    @Test
    public void test1() {
        String input = "1.2";

       Double result =  Double.valueOf(input);
       System.out.println(result);
    }


}

