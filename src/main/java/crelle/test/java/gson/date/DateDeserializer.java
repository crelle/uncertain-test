package crelle.test.java.gson.date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jdk.nashorn.internal.runtime.ECMAException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * @author:crelle
 * @className:DateDeserializer
 * @version:1.0.0
 * @date:2020/7/29
 * @description:XX
 **/
public class DateDeserializer implements JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = null;
        try {
         date =  dateFormat.parse(jsonElement.getAsJsonPrimitive().getAsString());
        }catch (Exception e){
        }
        return  date;
    }
}
