package crelle.test.java.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: 张强
 * @Date: 2024/8/10 10:32
 * @Description:
 */
public class BigDecimalTest {


    @Test
    public void test1() {
        BigDecimal number1 = new BigDecimal(0.0);
        BigDecimal number2 = new BigDecimal("50.25");

        // 执行减法运算
        BigDecimal result = number1.subtract(number2);

        System.out.println("Result: " + result);  // 输出: 50.25
    }

    @Test
    public void test2() {
        BigDecimal number = null;

        // 保留两位小数，并使用四舍五入的舍入模式
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);

        System.out.println(roundedNumber);
    }

    @Test
    public void test3() {
        BigDecimal number1 = new BigDecimal("1");
        BigDecimal number2 = new BigDecimal("4.2");

        // 执行乘法运算
        BigDecimal result = number1.multiply(number2);
        result = result.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Result: " + result);  // 输出: 43.050
    }

    @Test
    public void test4() {
        BigDecimal number1 = new BigDecimal("1.00");

        // 执行乘法运算
       String a=  String.valueOf(number1);
        System.out.println("Result: " + a);  // 输出: 43.050
    }

    @Test
    public void test5(){
        BigDecimal.valueOf((Double) 3.0);
    }
}
