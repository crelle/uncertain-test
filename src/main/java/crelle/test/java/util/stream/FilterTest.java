package crelle.test.java.util.stream;

import crelle.test.java.other.Utils;
import crelle.test.java.other.beans.Person;

/**
 * @author:crelle
 * @className:FilterTest
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Stream<T>	filter​(Predicate<? super T> predicate)
 * Returns a stream consisting of the elements of this stream that match the given predicate.
 **/
public class FilterTest {
    public static void main(String[] args) {
        //找出名字叫lili的女生的名字
        Utils.getPersonsLists()
                .stream()
                .filter(p -> p.getGender() == Person.Sex.FEMALE)
                .map(person -> person.getName())
                .forEach( System.out::print);
    }
}
