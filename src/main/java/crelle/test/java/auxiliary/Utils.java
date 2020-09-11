package crelle.test.java.auxiliary;

import crelle.test.java.auxiliary.beans.Order;
import crelle.test.java.auxiliary.beans.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:crelle
 * @className:utils
 * @version:1.0.0
 * @date:2020/8/15
 * @description:XX
 **/
public class Utils {
    public static List<Person> getPersonsLists(){
        List<Person> personList = new ArrayList<Person>();
        Person person1 = new Person();
        person1.setAge(15);
        LocalDate localDate1 = LocalDate.of(2020,4,1);
        person1.setBirthday(localDate1);
        person1.setGender(Person.Sex.MALE);
        person1.setEmailAddress("123@qq.com");
        person1.setName("tom");
        personList.add(person1);

        Person person2 = new Person();
        person2.setAge(17);
        LocalDate localDate2 = LocalDate.of(2020,6,1);
        person2.setBirthday(localDate2);
        person2.setGender(Person.Sex.MALE);
        person2.setEmailAddress("456@qq.com");
        person2.setName("john");
        personList.add(person2);

        Person person3 = new Person();
        person3.setAge(19);
        LocalDate localDate3 = LocalDate.of(2020,8,1);
        person3.setBirthday(localDate3);
        person3.setGender(Person.Sex.FEMALE);
        person3.setEmailAddress("789@qq.com");
        person3.setName("lili");
        personList.add(person3);
        return personList;
    }


    public static List<Order> getMultiOrders(){
        List<Order> orderList = new ArrayList<Order>();

        Order order4 = new Order();
        order4.setOrderId("54365");
        order4.setOrderName("青椒");
        order4.setMoney("3");
        List<Order> orderList1 = new ArrayList<Order>();
        orderList1.add(order4);
        Order order1 = new Order();
        order1.setOrderId("123");
        order1.setOrderName("鸡肉");
        order1.setMoney("$23");
        order1.setSubOrder(orderList1);
        orderList.add(order1);

        Order order2 = new Order();
        order2.setOrderId("4243");
        order2.setOrderName("西红柿");
        order2.setMoney("$8");
        List<Order> orderList2 = new ArrayList<Order>();
        orderList2.add(order2);
        Order order5 = new Order();
        order5.setOrderId("56843");
        order5.setOrderName("牛肉");
        order5.setMoney("99");
        order5.setSubOrder(orderList2);
        orderList.add(order5);


        Order order6 = new Order();
        order6.setOrderId("44728");
        order6.setOrderName("西兰花");
        order6.setMoney("8");
        List<Order> orderList3 = new ArrayList<Order>();
        orderList3.add(order6);
        Order order3 = new Order();
        order3.setOrderId("8008");
        order3.setOrderName("猪肉");
        order3.setMoney("$56");
        order3.setSubOrder(orderList3);
        orderList.add(order3);
        return orderList;
    }

}
