package Luenci.demo;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/2 15:12
 */
public class DataTypeExchange2 {
    public static void main(String[] args){
        // 范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的数据;
        int num1 = (int) 100L;
        System.out.println(num1 + "转换后的类型为："+ getType(num1));

        char a = 'A';
        System.out.println(a+1);
        System.out.println(getType(a+1));
    }


    public static String getType(Object o){

        return o.getClass().toString();
    }
}
