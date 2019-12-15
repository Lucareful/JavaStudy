package extend;

import java.sql.SQLOutput;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/14 14:32
 * @info 直接通过子类对象访问成员变量：
 *
 *      - 等号左边是谁，就优先用谁，没有则向上找。
 *
 * 间接通过成员方法访问成员变量：
 *
 *      - 该方法属于谁，就优先用谁，没有则向上找。
 */
public class DemoExtends{
    public static void main(String[] args) {
        Teacher the = new Teacher();
        the.methods();

        System.out.println("====================");
        // 自己的成员属性
        System.out.println(the.tNum);
        // 和父类共有的成员属性,有限使用子类的变量
        System.out.println(the.num);
        Assistant ass = new Assistant();
        ass.method();

    }

}
