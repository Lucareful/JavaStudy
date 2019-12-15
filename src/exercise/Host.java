package exercise;

import java.util.ArrayList;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/15 20:32
 * @info 发红包
 */
public class Host extends User {
    public Host() {
    }

    public Host(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();

        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);

        // 开始分红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        // 如果除不尽将的金额放到最后一个红包
        int last = avg + mod;
        redList.add(last);

        for (int i = 0; i < count; i++) {
            redList.add(avg);
        }

        return redList;
    }
}
