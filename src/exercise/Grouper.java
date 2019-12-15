package exercise;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/15 19:40
 * @info 抢红包
 */
public class Grouper extends User{
    public Grouper() {
    }

    public Grouper(String name, int money) {
        super(name, money);
    }

    public void recive(ArrayList<Integer> redList){
        int index = new  Random().nextInt(redList.size());
        int delter = redList.remove(index);
        super.setMoney(delter + getMoney());
    }

}
