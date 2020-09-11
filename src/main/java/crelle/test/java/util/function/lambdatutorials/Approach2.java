package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

import java.util.List;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Create More Generalized Search Methods
 **/
public class Approach2 {
    public static void main(String[] args) {

        printPersonsWithinAgeRange(Utils.getPersonsLists(),16,18);
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
}
