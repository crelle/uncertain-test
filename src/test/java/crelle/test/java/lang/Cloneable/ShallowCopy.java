package crelle.test.java.lang.Cloneable;


import org.junit.Test;

class Subject {

    private String name;
    public Subject(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
}


class Student implements Cloneable {

    // 对象引用
    private Subject subj;
    private String name;

    public Student(String s, String sub) {
        name = s;
        subj = new Subject(sub);
    }

    public Subject getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    /**
     *  重写clone()方法
     * @return
     */
    public Object clone() {
        //浅拷贝
        try {
            // 直接调用父类的clone()方法
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class ShallowCopy {

    @Test
    public void test1(){
        // 原始对象
        Student stud = new Student("杨充", "潇湘剑雨");
        System.out.println("原始对象: " + stud.getName() + " - " + stud.getSubj().getName());

        // 拷贝对象
        Student clonedStud = (Student) stud.clone();
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
