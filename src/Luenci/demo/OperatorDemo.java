package Luenci.demo;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/2 20:45
 */
public class OperatorDemo {
    public static void main(String[] args){
        // 四则运算符
        int a = 10,b = 25;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // 用字符串进行连接的时候结果都会变成字符串
        String str = "Luenci";
        System.out.println(str + 404);

        // 单独使用的时候++在前和++在后没什么区别
        // 和变量等在一起使用的时候是++在前的时候【先加后用】
        // 和变量等在一起使用的时候是++在后的时候【先用后加】
        int num=0;
        num++;
        System.out.println(num);

        System.out.println("-------------- 分割线 -----------------");

        int num1 = 20;
        System.out.println(num1++);  // 20
        System.out.println(num1);    // 21

        int num2 = 30;
        System.out.println(++num2); // 31

    //  System.out.println(false && false);


        // 三元运算符
        // 数据类型 变量名称 = 条件判断？ 表达式A：表达式B;
        int x = 10;
        int y = 20;

        int max =  x > y? x:y;
        System.out.println(max);
    }
}
