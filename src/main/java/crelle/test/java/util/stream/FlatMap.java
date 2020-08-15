package crelle.test.java.util.stream;

import com.google.gson.internal.$Gson$Preconditions;
import crelle.test.java.other.Utils;

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
    }
}
