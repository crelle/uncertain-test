package crelle.test.java.gson;

import com.google.gson.Gson;

/**
 * @author:crelle
 * @className:NestedClasses
 * @version:1.0.0
 * @date:2020/7/27
 * @description:Gson嵌套类测试
 * 官方的例子说非静态内部类无法序列化，但是设置成为静态类也无法实例化，这是一个问题？
 **/
public class NestedClasses {

    public static void main(String[] args) {
        Gson gson = new Gson();
        NestedClasses nestedClasses = new NestedClasses();
       System.out.println(gson.toJson(nestedClasses));
    }

    public String a = "a";

    static class B{
        public String b="b";

        public B() {
            // No args constructor for B
        }
    }
}
