package interfaces.multiple.inheritance;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 21:59
 * @info 接口类A
 */
public interface MyInterfaceA {
    public default void methodA() {
        System.out.println("接口A的默认方法");
    }

    public abstract void method();
}
