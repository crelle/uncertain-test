package crelle.test.java.text;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.util.Date;

/**
 * @author:crelle
 * @className:DateFormat
 * @version:1.0.0
 * @date:2020/7/29
 * @description:DateFormat测试
 **/
public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("###########SHORT类型格式化日期###############");
        // SHORT类型格式化日期
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(date));
        //SHORT类型格式化日期
        DateFormat dateFormat1 = DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println(dateFormat1.format(date));
        //SHORT类型格式化日期和时间
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println(dateFormat2.format(date));


        // MEDIUM类型格式化日期
        System.out.println("##############MEDIUM类型格式化日期#############");
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat3.format(date));
        //MEDIUM类型格式化日期
        DateFormat dateFormat4 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat4.format(date));
        //MEDIUM类型格式化日期
        DateFormat dateFormat5 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        System.out.println(dateFormat5.format(date));


        // LONG类型格式化日期
        System.out.println("###############LONG类型格式化日期#################");
        DateFormat dateFormat6 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat6.format(date));
        //LONG类型格式化日期
        DateFormat dateFormat7 = DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println(dateFormat7.format(date));
        //LONG类型格式化日期
        DateFormat dateFormat8 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        System.out.println(dateFormat8.format(date));

        // FULL类型格式化日期
        System.out.println("################FULL类型格式化日期######################");
        DateFormat dateFormat9 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat9.format(date));
        //FULL类型格式化日期
        DateFormat dateFormat10 = DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println(dateFormat10.format(date));
        //FULL类型格式化日期
        DateFormat dateForma11 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
        System.out.println(dateForma11.format(date));
    }
}
