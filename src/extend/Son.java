package extend;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/14 15:12
 * @info 1.0
 */
public class Son extends Father {

    public Son(){
        System.out.println("子类的构造方法");
    }

    @Override
    public void method(){
        System.out.println("子类重名方法执行");
    }
}
