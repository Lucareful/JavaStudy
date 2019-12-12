package luenci.staticclass;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 16:49
 * @info 自定义方法类
 */
public class myClass {
    int num;
    static int age;

    public void method() {
        System.out.println("普通的成员方法");
        System.out.println(num);
        System.out.println(age);
    }

    public static void methodStatic() {
        System.out.println("静态方法");
        // 错误访问
        /*System.out.println(num);*/
        System.out.println(age);
    }
}
