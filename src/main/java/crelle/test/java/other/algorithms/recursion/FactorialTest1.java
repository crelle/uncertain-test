package crelle.test.java.other.algorithms.recursion;

/**
 * @author:crelle
 * @className:FactorialTest1
 * @version:1.0.0
 * @date:2020/9/14
 * @description:阶乘测试
 **/
public class FactorialTest1 {
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        int subSolution = 0;
        int solution = 0;
        if(n<=1){
            return  1;
        }else{
            subSolution = factorial(n-1);
            solution = subSolution * n;
            return solution;
        }
    }

    public static long factorial1(int n) throws Exception {
        if (n < 0)
            throw new Exception("参数不能为负！");
        else if (n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
