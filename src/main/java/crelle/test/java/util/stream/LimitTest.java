package crelle.test.java.util.stream;

import java.util.stream.Stream;

/**
 * @author:crelle
 * @className:LimitTest
 * @version:1.0.0
 * @date:2020/8/17
 * @description:XX
 **/
public class LimitTest {
    public static void main(String[] args) {
        Stream<String> streamGenerated = Stream.generate(()->"element")
                .limit(10);
    }
}
