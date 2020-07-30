package crelle.test.java.gson.date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author:crelle
 * @className:DateSerializer
 * @version:1.0.0
 * @date:2020/7/29
 * @description:XX
 **/
public class DateSerializer implements JsonSerializer<Date> {
    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        return new JsonPrimitive(dateFormat.format(date));
    }
}
