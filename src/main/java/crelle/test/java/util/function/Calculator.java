package crelle.test.java.util.function;

/**
 * @author:crelle
 * @className:Calculator
 * @version:1.0.0
 * @date:2020/8/14
 * @description:lambda实现计算器
 **/
public class Calculator {

    interface  IntegerMath{
        int operation(int a,int b);
    }

    public int operateBinary(int a,int b,IntegerMath op){
        return op.operation(a,b);
    }

    public  static void main(String[] args) {
        Calculator calculator = new Calculator();
        IntegerMath addition = (a,b)->a+b;
        IntegerMath subtraction = (a,b)->a-b;
        System.out.println("40 + 2 = "+calculator.operateBinary(40,2,addition));
        System.out.println("40 - 2 = "+calculator.operateBinary(40,2,subtraction));

    }
}
