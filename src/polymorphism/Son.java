package polymorphism;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 13:30
 * @info 继承父类的子类
 */
public class Son extends Father{
    int age = 20;

    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
