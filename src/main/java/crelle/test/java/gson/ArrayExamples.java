package crelle.test.java.gson;

import com.google.gson.Gson;

/**
 * @author:crelle
 * @className:ArrayExamples
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson数组cesium
 **/
public class ArrayExamples {
    public static void main(String[] args) {
        Gson gson = new Gson();
        int[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"abc", "def", "ghi"};

        // Serialization
       System.out.println(gson.toJson(ints));
       // ==> [1,2,3,4,5]
       System.out.println(gson.toJson(strings));
       // ==> ["abc", "def", "ghi"]

        // Deserialization
        int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
        System.out.println(ints2.getClass());
        // ==> ints2 will be same as ints
    }
}
