package interfaces.multiple.inheritance;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:15
 * @info 1.0
 */
public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceMore impl = new MyInterfaceMore();
        impl.methodA();
        impl.methodB();
        impl.method();

        System.out.println("============== 分割线 ================");
        Son s = new Son();
        s.methodA();
    }
}
