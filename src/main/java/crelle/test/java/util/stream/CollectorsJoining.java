package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;

import java.util.stream.Collectors;

/**
 * @author:crelle
 * @className:CollectorsJoining
 * @version:1.0.0
 * @date:2020/11/4
 * @description:XX
 **/
public class CollectorsJoining {
    public static void main(String[] args) {
        String str = Utils.getMultiOrders().parallelStream().map(obj ->
                obj.getOrderName()
        ).collect(Collectors.joining(","));
        System.out.println(str);

    }
}
