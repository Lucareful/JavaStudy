package luenci.staticclass;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 16:50
 * @info static关键字修饰方法
 */
public class Demo2 {
    public static void main(String[] args) {
        myClass obj = new myClass();
        // 普通成员方法 对象名.成员方法（）
        obj.method();

        // 静态方法 推荐用：类名称.静态方法（）调用
        myClass.methodStatic();

        // 在本类中调用自己的静态方法，可以省略类名称
        myMethod();

    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
