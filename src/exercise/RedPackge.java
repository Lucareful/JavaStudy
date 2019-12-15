package exercise;

import java.util.ArrayList;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/15 19:34
 * @info 发红包案例
 */
public class RedPackge {
    public static void main(String[] args) {
        Host manger = new Host("群主",100);

        Grouper one = new Grouper("成员A",0);
        Grouper tow = new Grouper("成员A",0);
        Grouper three = new Grouper("成员A",0);

        manger.show();
        one.show();
        tow.show();
        three.show();

        System.out.println("开始发红包啦！！！");

        ArrayList<Integer> redList = manger.send(20,3);
        one.recive(redList);
        tow.recive(redList);
        three.recive(redList);

        manger.show();
        one.show();
        tow.show();
        three.show();

    }
}
