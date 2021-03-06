package crelle.test.java.auxiliary.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author:crelle
 * @className:Person
 * @version:1.0.0
 * @date:2020/8/15
 * @description:XX
 **/
public class Person implements Serializable {

    private static final Long serialVersionUID = 237898764368L;

    public enum Sex {
        MALE, FEMALE
    }
    private String name;

    private LocalDate birthday;

    private Sex gender;

    private String emailAddress;

    private int age;

    private BigDecimal money;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public void printPerson() {
      System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}