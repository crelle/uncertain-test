package crelle.test.java.gson;

import com.google.gson.Gson;

/**
 * @author:crelle
 * @className:GenericType
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson泛型测试
 **/
public class GenericType {

    public static void main(String[] args) {
        start();
    }
   static class Foo<T> {
        T value;
    }

    class Bar{
        private String a = "a";
    }

    public static void start(){
        Gson gson = new Gson();
        Foo<Bar> foo = new Foo<Bar>();
        String json = gson.toJson(foo); // May not serialize foo.value correctly
        System.out.println(json);
       System.out.println(gson.fromJson(json, foo.getClass())); // Fails to deserialize foo.value as Bar
    }
}
