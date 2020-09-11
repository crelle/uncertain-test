package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Use Aggregate Operations That Accept Lambda Expressions as Parameters
 **/
public class Approach9 {
    public static void main(String[] args) {
        Utils.getPersonsLists()
                .stream()
                .filter(
                        p -> p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 12
                                && p.getAge() <= 25)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }


}

