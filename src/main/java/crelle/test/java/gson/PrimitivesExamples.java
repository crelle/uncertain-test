package crelle.test.java.gson;

import com.google.gson.Gson;

/**
 * @author:crelle
 * @className:PrimitivesExamples1
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson基本类型测试
 **/
public class PrimitivesExamples {


    public static void main(String[] args) {
        // Serialization 序列化
        Gson gson = new Gson();
        System.out.println(gson.toJson("1"));
        System.out.println(gson.toJson("abcd"));
        System.out.println(gson.toJson(new Long(123)));
        int[] values = {1,2,3,4};
        System.out.println(gson.toJson(values));

        //Deserialization反序列化
        int one = gson.fromJson("1", int.class);
        System.out.println(one);
        Integer one2 = gson.fromJson("1", Integer.class);
        Long one3 = gson.fromJson("1", Long.class);
        Boolean flag = gson.fromJson("false", Boolean.class);
        String str = gson.fromJson("\"abc\"", String.class);
        System.out.println(str);
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);
        System.out.println(anotherStr.toString());
    }


}
