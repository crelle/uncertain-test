package crelle.test.java.math;

/**
 * @author:crelle
 * @className:RandomTest
 * @version:1.0.0
 * @date:2020/11/16
 * @description:XX
 **/
public class RandomTest {

    public static void main(String[] args) {

        while (true){
        Double aDouble = Math.random();
        String randomString = aDouble.toString();
        randomString = randomString.substring(randomString.indexOf(".")+1);
        System.out.println(randomString);
        }

    }
}
