package crelle.test.java.util.stream;

import java.util.stream.Stream;

/**
 * @author:crelle
 * @className:IterateTest
 * @version:1.0.0
 * @date:2020/8/17
 * @description:XX
 **/
public class IterateTest {
    public static void main(String[] args) {
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
    }
}
