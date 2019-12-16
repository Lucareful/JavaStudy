package interfaces.relation.classs;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:26
 * @info 1.0
 */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodC() {
        System.out.println("父类重名方法");
    }
}
