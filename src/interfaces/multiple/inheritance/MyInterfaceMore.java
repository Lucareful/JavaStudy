package interfaces.multiple.inheritance;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 21:59
 * @info 1.0
 */
public class MyInterfaceMore implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodB() {
        System.out.println("覆盖重写B中的方法");
    }

    @Override
    public void methodA() {
        System.out.println("覆盖重写A中的方法");
    }

    @Override
    public void method() {
        System.out.println("覆盖重写了AB接口类中重名的抽象方法");
    }
}
