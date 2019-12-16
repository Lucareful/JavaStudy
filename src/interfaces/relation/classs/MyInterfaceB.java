package interfaces.relation.classs;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:27
 * @info 1.0
 */
public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodC(){
        System.out.println("父类重名方法");
    }
}
