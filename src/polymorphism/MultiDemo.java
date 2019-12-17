package polymorphism;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 13:28
 * @info 多态性
 */
public class MultiDemo {
    public static void main(String[] args) {
        Father obj = new Son();
        System.out.println(obj.num);
        obj.method();
        obj.methodFu();
    }
}
