package interfaces.defaults.method;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 14:23
 * @info 1.0
 */
public interface MyInterfaceDefault {
    // 抽象方法
    public abstract void methodA();

    // 新添加的抽象方法
//    public abstract void methodB();

    // 将新添加的方法改成默认的方法
    default void methodDefault() {
        System.out.println("我是新添加的默认方法");
    }
}
