package crelle.test.java.lang;

import com.sun.istack.internal.Nullable;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:crelle
 * @className:StringTest
 * @version:1.0.0
 * @date:2020/12/17
 * @description:XX
 **/
public class StringTest {

    @Test
    public void test() {
        System.out.println("abc".replace("a", ""));
    }


    @Test
    public void test2() {
        double f1 = 132;
        System.out.println(String.format("%.2f", f1));

        double f2 = 111231.5585;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f2));
    }

    @Test
    public void test3() {
        System.out.println("1234567".substring(0, 7));
    }

    @Test
    public void test4() {
        String qty = "100000";
        Double result = Double.valueOf(qty);
//        BigDecimal decimal = new BigDecimal()
        Double newVal = Math.abs(result);
        if (newVal < 5000) {
            System.out.println(newVal);
        } else {
            System.out.println("大于5000！");
        }
    }

    @Test
    public void test5() {
        String str = "-123456789";
        str = str.substring(1, str.length());
        System.out.println(str);
    }

    @Test
    public void test6(){
        String str = ".doc.txt.xlsx.pdf";
        boolean is = str.contains(".txt");
        System.out.println(is);
    }

    public static void test7(@Nullable String... strings){
        System.out.println(strings);
    }


    public static void main(String[] args) {
        test7("a");
    }

}
