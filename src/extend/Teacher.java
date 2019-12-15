package extend;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/14 14:36
 * @info  教师子类
 */
public class Teacher extends Employee{
    int tNum = 20;
    int num = 20;

    public void methods(){
        int num = 50;
        // 子类方法的局部变量
        System.out.println(num);
        // 子类的成员变量
        System.out.println(this.num);
        // 父类的成员变量
        System.out.println(super.num);
    }
}
