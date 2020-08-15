package crelle.test.java.util.stream;

import crelle.test.java.other.Utils;

/**
 * @author:crelle
 * @className:MapToInt
 * @version:1.0.0
 * @date:2020/8/15
 * @description: IntStream mapToInt​(ToIntFunction<? super T> mapper)
 * Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
 **/
public class MapToInt {
    public static void main(String[] args) {

        //map方法入参为person,返回只接受int类型，其他类型会报错
        Utils.getPersonsLists()
                .stream()
                .mapToInt(p->p.getAge())
                .forEach(System.out::println);
    }
}
