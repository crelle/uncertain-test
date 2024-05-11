package crelle.test.java.time;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Administrator on 2024/4/28.
 *
 * @author 张强
 */
public class LocalDateTimeTest {
    @Test
    public void test1() { // 获取当前时间
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 创建一个LocalDateTime对象，将日期和默认的时间（00:00:00）组合起来
        LocalDateTime currentDateTime = currentDate.atStartOfDay();

        LocalDateTime localDateTime = localDateTimeFormat(currentDateTime, "yyyy-MM-dd");
        System.out.println(localDateTime);

    }
    @Test
    public void test2(){
        String dateString = "2025-04-28";
        LocalDate date = LocalDate.parse(dateString);
        LocalDateTime localDateTime = date.atStartOfDay();

        System.out.println(localDateTime.toInstant(java.time.ZoneOffset.UTC).toEpochMilli());
    }

    @Test
    public void test3(){
        // 日期时间字符串 "2024-05-06T11:27:26" 转换为 LocalDateTime
        String dateTimeString = "2024-05-06T11:27:26";
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTimeString);

        System.out.println(localDateTime2.toInstant(java.time.ZoneOffset.UTC).toEpochMilli());
    }

    @Test
    public void test4(){

                String address = "江苏省南京市雨花台区宁双路33号";

                String province = null;
                String city = null;
                String district = null;

                // 根据"省"、"市"、"区"关键字进行拆分
                int provinceIndex = address.indexOf("省");
                if (provinceIndex != -1) {
                    province = address.substring(0, provinceIndex + 1);
                    address = address.substring(provinceIndex + 1);
                }

                int cityIndex = address.indexOf("市");
                if (cityIndex != -1) {
                    city = address.substring(0, cityIndex + 1);
                    address = address.substring(cityIndex + 1);
                }

                int districtIndex = address.indexOf("区");
                if (districtIndex != -1) {
                    district = address.substring(0, districtIndex + 1);
                    address = address.substring(districtIndex + 1);
                }

                System.out.println("省：" + province);
                System.out.println("市：" + city);
                System.out.println("区：" + district);
                System.out.println("详细地址：" + address);
                System.out.println(province+"/"+city+"/"+district+" "+address);


    }

    public static LocalDateTime localDateTimeFormat(LocalDateTime localDateTime, String formatterStr) {


        // 创建一个格式化器，指定格式为"yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatterStr);

        // 格式化LocalDateTime为字符串
        String formattedDate = localDateTime.format(formatter);

        // 解析格式化后的字符串为LocalDateTime对象
        LocalDateTime parsedDateTime = LocalDate.parse(formattedDate, formatter).atStartOfDay();

        // 输出格式化后的日期
        System.out.println("Formatted date: " + formattedDate);

        // 输出解析后的LocalDateTime对象
        System.out.println("Parsed date: " + parsedDateTime);
        return parsedDateTime;
    }
}
