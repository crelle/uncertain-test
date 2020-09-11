package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

/**
 * @author:crelle
 * @className:Test1
 * @version:1.0.0
 * @date:2020/8/15
 * @description:XX
 **/
public class Test1 {
    public static void main(String[] args) {
        double average = Utils.getPersonsLists()
                .parallelStream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
