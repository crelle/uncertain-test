package crelle.test.java.text;

import java.text.ParseException;

/**
 * @author:crelle
 * @className:NumberFormatTest
 * @version:1.0.0
 * @date:2021/2/10
 * @description:XX
 **/
public class NumberFormatTest {
    public static void main(String[] args) throws ParseException {
        test2();
    }

    private static void test1(){
         Double d = new Double("1234567890.12");
         System.out.println("d:="+d);
         java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
         nf.setGroupingUsed(false);
         System.out.println("d:="+nf.format(d));
    }

    private static void test2() throws ParseException {
         java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
         // 不使用千分位，即展示为11672283.234，而不是11,672,283.234
         nf.setGroupingUsed(false);
         // 设置数的小数部分所允许的最小位数
         nf.setMinimumFractionDigits(0);
         // 设置数的小数部分所允许的最大位数
         nf.setMaximumFractionDigits(2);



         System.out.println(nf.format(nf.parse("11687345337.23530").doubleValue())); // 11687337.2343
         System.out.println(nf.format(nf.parse("11345687337.00000").doubleValue())); // 11687337
         System.out.println(nf.format(nf.parse("11683457337.23000").doubleValue())); // 11687337.23
    }
}
