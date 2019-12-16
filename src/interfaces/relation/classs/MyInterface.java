package interfaces.relation.classs;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:27
 * @info 1.0
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodC() {

    }
}
