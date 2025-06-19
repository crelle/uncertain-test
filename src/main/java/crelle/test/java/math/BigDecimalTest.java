package crelle.test.java.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author:crelle
 * @className:BigDecimalTest
 * @version:1.0.0
 * @date:2020/10/22
 * @description:XX
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
            test2();
    }

    private static void test1(){
        BigDecimal bigDecimal1 = new BigDecimal(5.023);
        BigDecimal bigDecima2 = new BigDecimal(4.98);
        System.out.println(bigDecimal1.subtract(bigDecima2, MathContext.DECIMAL32));

        Double d1 = 5.023;
        Double d2 = 4.98;
        System.out.println(d1-d2);

        Float f1 = 5.023F;
        Float f2 = 4.98F;
        System.out.println(f1-f2);
    }

    private static void test2(){
        BigDecimal bigDecimal = new BigDecimal("-12345213466542343.4565432");
        System.out.println(bigDecimal);
    }

    @Test
    public void test3(){
        BigDecimal bigDecimal = new BigDecimal("");
    }

    @Test
    public void test4(){
        Double aDouble = new Double("");
    }

    @Test
    public void test5(){
        BigDecimal bigDecimal = new BigDecimal("2.01");
        BigDecimal result1 = bigDecimal.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN);
        System.out.println(result1);

        BigDecimal bigDecimal2 = new BigDecimal("2.01232346729828");
        BigDecimal result2 = bigDecimal2.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN);
        System.out.println(result2);

        BigDecimal bigDecimal3 = new BigDecimal("223.99999999999999999999999");
        BigDecimal result3 = bigDecimal3.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN);
        System.out.println(result3);

        BigDecimal bigDecimal4 = new BigDecimal("2");
        BigDecimal result4 = bigDecimal4.multiply(BigDecimal.valueOf(100)).setScale(0, RoundingMode.DOWN);
        System.out.println(result4);
    }


}
