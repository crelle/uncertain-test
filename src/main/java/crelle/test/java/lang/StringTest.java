package crelle.test.java.lang;

import java.text.DecimalFormat;

/**
 * @author:crelle
 * @className:StringTest
 * @version:1.0.0
 * @date:2020/12/17
 * @description:XX
 **/
public class StringTest {
    public static void main(String[] args) {
        test2();
    }

    private static void test1(){
        System.out.println("abc".replace("a",""));
    }

    /**
     *@author:crelle
     *@date:2021/1/26
     *@title:test2
     *@description:保留两位小数
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test2(){
        double f1 = 132;
        System.out.println(String.format("%.2f",f1));

        double f2 = 111231.5585;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f2));
    }

}
