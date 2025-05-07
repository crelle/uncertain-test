package crelle.test.java.reflect;

import crelle.test.java.auxiliary.beans.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张强
 * @since 2025/5/6 15:27
 */
public class ReflectTest {

    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("crelle.test.java.auxiliary.beans.Student");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    @Test
    public void test2() {
        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        Method[] methods = aClass1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    @Test
    public void test3() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Student.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        Student student = (Student) constructors[0].newInstance();
        student.setName("zhangsan");
        student.setAge(19);
        System.out.println(student.getName());

    }
}
