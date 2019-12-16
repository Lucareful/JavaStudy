package interfaces;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 15:15
 * @info 接口私有方法
 */
public interface MyPriviteInterface {

    public default void methodA() {
        System.out.println("我是A");
        methodCommen();
    }

    public default void methodB() {
        System.out.println("我是B");
        methodCommen();
    }

    // java 9及其以上版本支持接口的私有方法定义

    public default void methodCommen() {
        System.out.println("姓名");
        System.out.println("班级");
        System.out.println("学号");
    }
}
