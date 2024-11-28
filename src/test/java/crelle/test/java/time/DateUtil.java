package crelle.test.java.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author zhangjin
 * @create 2024/3/25
 */
public class DateUtil {
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd'T'HH:mm:ss";

    public static Date parseDate(String dateString) {
        return parseDate(dateString, DATE_FORMAT_YYYY_MM_DD);
    }

    /**
     * 将字符串转换成日期
     *
     * @param dateString 字符串
     * @param pattern    日期格式
     * @return date
     */
    public static Date parseDate(String dateString, String pattern) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("日期转换失败 " + e);
        }
    }

    /**
     * @param localDateTime
     * @return
     */
    public static Long LocalDateTime2Long(LocalDateTime localDateTime) {
        // 将 LocalDateTime 转换为 Instant 对象
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);

        // 获取从 Epoch 开始的秒数，并转换为 long 类型
        return instant.getEpochSecond();

    }

    /**
     * 字符串类型转为毫秒数
     *
     * @param timeString
     * @return
     */
    public static Long string2Long(String timeString) {
        // 日期时间字符串 "2024-05-06" 转换为 LocalDateTime
        LocalDate date = LocalDate.parse(timeString);
        LocalDateTime localDateTime = date.atStartOfDay();

        return localDateTime.toInstant(java.time.ZoneOffset.UTC).toEpochMilli();
    }

    /**
     * 字符串类型转为毫秒数
     *
     * @param timeString
     * @return
     */
    public static Long string2Long2(String timeString) {
        // 日期时间字符串 "2024-05-06T11:27:26" 转换为 LocalDateTime
        LocalDateTime localDateTime2 = LocalDateTime.parse(timeString);

        return localDateTime2.toInstant(java.time.ZoneOffset.UTC).toEpochMilli();
    }


}
