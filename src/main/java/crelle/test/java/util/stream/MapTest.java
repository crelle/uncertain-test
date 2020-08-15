package crelle.test.java.util.stream;

import crelle.test.java.other.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:crelle
 * @className:MapTest
 * @version:1.0.0
 * @date:2020/8/15
 * @description:  <R> Stream<R> map​(Function<? super T,​? extends R> mapper)
 * Returns a stream consisting of the results of applying the given function to the elements of this stream.
 **/
public class MapTest {

    public static void main(String[] args) {
        //map方法入参为person返回为person
        Utils.getPersonsLists()
                .stream()
                .map(person -> person)
                .forEach(System.out::println);

        System.out.println("##############################################");

        //map方法入参为person返回为人名
        Utils.getPersonsLists()
                .stream()
                .map(person -> person.getName())
                .forEach(System.out::println);

        System.out.println("##############################################");

        //map方法入参为person返回为111
        Utils.getPersonsLists()
                .stream()
                .map(person -> 111)
                .forEach(System.out::println);
    }
}
