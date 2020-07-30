package crelle.test.java.time.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author:crelle
 * @className:DateTimeFormatterTest
 * @version:1.0.0
 * @date:2020/7/29
 * @description:线程安全的Date
 **/
public class DateTimeFormatterTest {
    public static void main(String[] args) {
            //使用预定义的格式。和DateFormat不同，以下三个方法方法均没有重载方法，只能这样用。预定义的常量为FormatStyle类的SHORT、MEDIUM、LONG、FULL
            DateTimeFormatter df1=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);   //只能格式化日期部分
            DateTimeFormatter df2=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);    //只能格式化时间部分
            DateTimeFormatter df3=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT);   //格式化日期时间

            //使用自定义的格式
            DateTimeFormatter df4=DateTimeFormatter.ofPattern("y-M H:m:s");

            //要格式化的时间日期对象，只能用LocalDateTime。只涉及到日期也可以用LocalDate类，只涉及时间也可以用LocalTime类
            LocalDateTime ldt=LocalDateTime.now();

            //格式化,不能用Date类的实例作为参数
            System.out.println(df1.format(ldt));
            System.out.println(df2.format(ldt));
            System.out.println(df3.format(ldt));
            System.out.println(df4.format(ldt));
    }
}
