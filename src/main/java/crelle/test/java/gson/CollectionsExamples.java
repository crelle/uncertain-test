package crelle.test.java.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author:crelle
 * @className:CollectionExamples
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson集合测试
 **/
public class CollectionsExamples {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Collection<Integer> ints = Arrays.asList(1,2,3,4,5);



        // Serialization
        String json = gson.toJson(ints);  // ==> json is [1,2,3,4,5]
        System.out.println(json);
        // Deserialization
        Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();
        Collection<Integer> ints2 = gson.fromJson(json, collectionType);
        System.out.println(ints2);
        // ==> ints2 is same as ints
    }
}
