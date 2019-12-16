package interfaces;

import interfaces.defaults.method.MyInterfaceDefaultA;
import interfaces.defaults.method.MyInterfaceDefaultB;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 14:22
 * @info 1.0
 */
public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();

        impl.method();
        impl.method2();

        System.out.println("================ 分割线 ==================");

        MyInterfaceDefaultA defA = new MyInterfaceDefaultA();
        defA.methodA();
        defA.methodDefault();

        System.out.println("================ 分割线 ==================");
        MyInterfaceDefaultB defB = new MyInterfaceDefaultB();
        defB.methodA();
        defB.methodDefault();

        System.out.println("================ 分割线 ==================");
        MyInterfaceStaticImpl staticImpl = new MyInterfaceStaticImpl();
        // 不能通过实现类来调用接口的静态方法
        // staticImpl.method();
        MyInterfaceStatic.method();

        System.out.println("================ 分割线 ==================");
        System.out.println(MyInterfaceConst.NUM_ClASS);
    }
}
