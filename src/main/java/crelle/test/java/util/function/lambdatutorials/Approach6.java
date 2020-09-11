package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Use Standard Functional Interfaces with Lambda Expressions
 **/
public class Approach6 {
    public static void main(String[] args) {
        printPersonsWithPredicate(Utils.getPersonsLists(),(Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 16 && p.getAge() <= 25);
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
    }
}

