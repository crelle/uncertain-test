package crelle.test.java.other;

/**
 * @author:crelle
 * @className:Test1
 * @version:1.0.0
 * @date:2020/9/21
 * @description:XX
 **/
public class Test1 {
    public static void main(String[] args) {
        System.out.println(add());
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
