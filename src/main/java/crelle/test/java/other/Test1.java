package crelle.test.java.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author:crelle
 * @className:Test1
 * @version:1.0.0
 * @date:2020/9/21
 * @description:XX
 **/
public class Test1 {
    public static void main(String[] args) {
//        System.out.println(add());
        Map<String,String> map = new Hashtable<>();
        map.remove(null);
    }

    private static int add(){
        int a = 0;
        try{
            a = 1;
            return a;
        }finally {
            a= 2;
            return a;
        }
    }
}
