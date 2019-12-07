package object.oriented;

import java.util.Scanner;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/7 17:34
 */
public class AnonymousDemo {
    public static void main(String[] args) {
        // 匿名对象
        new Student().eat();

        // 匿名对象作为参数
//        methiordParam(new Scanner(System.in));

        // 匿名对象作为返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("您输入的是：" + num);
    }

    public static void methiordParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {

        return new Scanner(System.in);
    }

}
