package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author:crelle
 * @className:FlatMap
 * @version:1.0.0
 * @date:2020/8/15
 * @description: <R> Stream<R> flatMap​(Function<? super T,​? extends Stream<? extends R>> mapper)
 * Returns a stream consisting of the results of replacing each element of this stream with the contents of
 * a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is
 * closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)
 **/
public class FlatMap {
    public static void main(String[] args) {
        //map
        Utils.getMultiOrders()
                .stream()
                .map(order -> order.getOrderName())
                .forEach(System.out::println);

        System.out.println("#######################################################");

        //flatMap
        Utils.getMultiOrders()
                .stream()
                .flatMap(order -> order.getSubOrder().stream())
                .map(order -> order.getOrderName())
                .forEach(System.out::println);

        //
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
