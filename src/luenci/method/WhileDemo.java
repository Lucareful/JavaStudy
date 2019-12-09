package Luenci.method;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/4 15:10
 */
public class WhileDemo {
    public static void main(String[] args){
        // 初始化语句
        int a = 1;
        while (a < 10){
            System.out.println("打印" + a + "遍");
            a++;
        }
    }
}
