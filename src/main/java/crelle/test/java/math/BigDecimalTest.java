package crelle.test.java.math;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author:crelle
 * @className:BigDecimalTest
 * @version:1.0.0
 * @date:2020/10/22
 * @description:XX
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
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
}
