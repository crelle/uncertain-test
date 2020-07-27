package crelle.test.java.gson;

import com.google.gson.Gson;

/**
 * @author:crelle
 * @className:ObjectExamples
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson对象测试
 **/
public class ObjectExamples {
    public static void main(String[] args) {
        // Serialization
        BagOfPrimitives obj = new BagOfPrimitives();
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        System.out.println("BagOfPrimitives对象序列化结果："+json);
        // ==> json is {"value1":1,"value2":"abc"}

        // Deserialization
        BagOfPrimitives obj2 = gson.fromJson(json, BagOfPrimitives.class);
        System.out.println("BagOfPrimitives对象返序列化结果"+obj2.getClass());
        // ==> obj2 is just like obj


        //Note that you can not serialize objects with circular references since that will result in infinite recursion.
        Person person = new Person();
        System.out.println(gson.toJson(person));
        //Exception in thread "main" java.lang.StackOverflowError


    }
}


class BagOfPrimitives {
    private int value1 = 1;
    private String value2 = "abc";
    //transient是不会被序列化和反序列换的
    private transient int value3 = 3;
    BagOfPrimitives() {
        // no-args constructor
    }
}

class Person{
    private int age = 27;
    private String name = "crelle";
    private Person me = new Person();
}
