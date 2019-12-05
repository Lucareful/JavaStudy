package method;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/4 23:25
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a, int b) {
        System.out.println("调用两数之和");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("调用三数之和");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("调用四数之和");
        return a + b + c + d;
    }
}
