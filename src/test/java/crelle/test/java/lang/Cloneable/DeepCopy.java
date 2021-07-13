package crelle.test.java.lang.Cloneable;


import org.junit.Test;

class Subject1 {

    private String name;

    public Subject1(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
}


class Student1 implements Cloneable {

    // 对象引用
    private Subject1 subj;
    private String name;

    public Student1(String s, String sub) {
        name = s;
        subj = new Subject1(sub);
    }

    public Subject1 getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    /**
     * 重写clone()方法
     *
     * @return
     */
    public Object clone() {
        // 深拷贝，创建拷贝类的一个新对象，这样就和原始对象相互独立
        Student1 s = new Student1(name, subj.getName());
        return s;
    }
}


public class DeepCopy {

    @Test
    public void test2() {
        // 原始对象
        Student1 stud = new Student1("杨充", "潇湘剑雨");
        System.out.println("原始对象: " + stud.getName() + " - " + stud.getSubj().getName());

        // 拷贝对象
        Student1 clonedStud = (Student1) stud.clone();
        System.out.println("拷贝对象: " + clonedStud.getName() + " - " + clonedStud.getSubj().getName());

        // 原始对象和拷贝对象是否一样：
        System.out.println("原始对象和拷贝对象是否一样: " + (stud == clonedStud));
        // 原始对象和拷贝对象的name属性是否一样
        System.out.println("原始对象和拷贝对象的name属性是否一样: " + (stud.getName() == clonedStud.getName()));
        // 原始对象和拷贝对象的subj属性是否一样
        System.out.println("原始对象和拷贝对象的subj属性是否一样: " + (stud.getSubj() == clonedStud.getSubj()));

        stud.setName("小杨逗比");
        stud.getSubj().setName("潇湘剑雨大侠");
        System.out.println("更新后的原始对象: " + stud.getName() + " - " + stud.getSubj().getName());
        System.out.println("更新原始对象后的克隆对象: " + clonedStud.getName() + " - " + clonedStud.getSubj().getName());

    }

}
