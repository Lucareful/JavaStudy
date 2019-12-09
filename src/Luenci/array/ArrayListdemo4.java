package luenci.array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 13:38
 * @info ArrayList作为返回值  集合元素筛选
 */
public class ArrayListdemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(ran.nextInt(99) + 1);
        }

        System.out.println(list);

        ArrayList<Integer> newList = selectList(list);

        System.out.println(newList);
    }

    public static ArrayList<Integer> selectList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                // 若使用remove（int index）出现重复的数字在一起就会无法移除，程序出现Bug
                // 原因因为我没有创建新的数组，每次移除都会使数组的长度减小，循环导致索引改变
                list.remove(list.get(i));
            } else {
                continue;
            }
        }
        return list;
    }

}
