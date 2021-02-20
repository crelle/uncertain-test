package crelle.test.java.lang;

import java.math.BigDecimal;
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
        test5();
    }

    private static void test(){
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

    private static void test3(){
        System.out.println("1234567".substring(0,7));
    }

    private static void test4(){
        String qty = "100000";
        Double result = Double.valueOf(qty);
//        BigDecimal decimal = new BigDecimal()
        Double newVal = Math.abs(result);
        if(newVal<5000){
            System.out.println(newVal);
        }else{
            System.out.println("大于5000！");
        }
    }

    private static void test5(){
        String str = "-123456789";
        str =str.substring(1,str.length());
        System.out.println(str);
    }

}
