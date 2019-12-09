package luenci.array;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 13:26
 * @info 将ArrayList作为参数使用
 */
public class ArrayListParam {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Luenci");
        list.add("Lynn");
        list.add("Lucy");
        System.out.println(list);
        printfArrayList(list);
    }

    public static void printfArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + '@');
            }
        }

    }
}
