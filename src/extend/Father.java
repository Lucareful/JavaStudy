package extend;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/14 15:11
 * @info 父类
 */
public class Father {
    public Father() {
        System.out.println("父类的构造方法");
    }
    public Father(int num){
        System.out.println("父类的有参构造方法");
    }

    public void method(){
        System.out.println("父类重名方法");
    }
}
