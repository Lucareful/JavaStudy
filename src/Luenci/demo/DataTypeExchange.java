package Luenci.demo;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/1 18:33
 */

public class DataTypeExchange {

    public static void main(String[] args){
        System.out.println(1024); // 这是个整数，默认就是int类型
        System.out.println(3.14); // 这是个浮点数，默认就是double类型

        long num1 = 100L;
        System.out.println(num1);

        // 左边是double 右边是int
        double num2 = 100;
        System.out.println(num2 + "  的类型为：" + getType(num2));

        // 左边是double，右边是float
        double num3 = 2.5F;
        System.out.println(num3 + "  的类型为：" + getType(num3));

        // 左边是float类型，右边是long类型，左右不一样
        // 1ong-->float，范围是float更大一些，符合从小到大的规则
        // 自动类型转换
        float num4 = 12L;
        System.out.println(num4 + "  的类型为：" + getType(num4));


    }
    //获取变量类型方法
    public static String getType(Object o){
        // getClass()方法返回类型的种类
        return o.getClass().toString();
    }

}
