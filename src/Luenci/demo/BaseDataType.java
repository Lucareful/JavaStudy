package Luenci.demo;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/1 14:42
 */
public class BaseDataType {
    public static void main(String[] args){
        int num1;
        num1 = 15;

        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        int num2 = 1024;

        System.out.println("======================");

        // 不能超过类型的数据范围
        byte num3 = 30;

        System.out.println(num3);

        // byte num4 = 4556;  右侧数值超出类型范围

        short num5 = 50;
        System.out.println(num5);

        long num6 = 3000000000L;
        System.out.println(num6);

        float num7 = 2.5F;
        System.out.println(num7);

        double num8 = 1.2;
        System.out.println(num8);

        boolean var = true;
        System.out.println(var);

    }
}
