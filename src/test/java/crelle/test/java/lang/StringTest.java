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

    @Test
    public void test1(String... strings){
        System.out.println(strings);
    }

    @Test
    public void test2(){
        test1("a","b","c");
    }

}
