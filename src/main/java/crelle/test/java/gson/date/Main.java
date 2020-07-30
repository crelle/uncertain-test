package crelle.test.java.gson.date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * @author:crelle
 * @className:Main
 * @version:1.0.0
 * @date:2020/7/29
 * @description:Gson定制化类型转换
 **/
public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class,new DateSerializer()).registerTypeAdapter(Date.class,new DateDeserializer()).create();
        TestBean testBean = new TestBean();
       String testBeanJson =  gson.toJson(testBean);
       System.out.println(testBeanJson);
        testBean = gson.fromJson(testBeanJson,TestBean.class);
        System.out.println(testBean.toString());
    }
}
