package luenci.array;

import java.util.ArrayList;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 12:32
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是string字符串类型的数据
        // 备注：从J0K1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // 向list里面添加元素
        boolean success = list.add("Luenci");
        list.add("Lynn");
        list.add("Lucy");

        System.out.println(list);
        System.out.println("添加是否成功：" + success);

        String name = list.get(1);
        System.out.println("获取的元素是" + name);

        String whoRemove = list.remove(0);
        System.out.println("被删除的人是：" + whoRemove);

        System.out.println(list);

        System.out.println("集合长度是" + list.size());
    }
}
