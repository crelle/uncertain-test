package crelle.test.java.auxiliary.beans;

/**
 * @author 张强
 * @since 2025/5/6 15:25
 */
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("student sleep");
    }

    private void eat(String something) {
        System.out.println("student eat" + something);
    }
}
