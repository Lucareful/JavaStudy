package interfaces.multiple.inheritance;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:00
 * @info 接口类B
 */
public interface MyInterfaceB {
    public default void methodB(){
        System.out.println("接口B的默认方法");
    }

    public abstract void method();
}
