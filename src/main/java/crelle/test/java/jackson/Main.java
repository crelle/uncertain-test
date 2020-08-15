package crelle.test.java.jackson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author:crelle
 * @className:Main
 * @version:1.0.0
 * @date:2020/7/30
 * @description:XX
 **/
public class Main {
    public static void main(String[] args)   throws  ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        JacksonBean event = new JacksonBean(1,"party", date);
        

    }
}
