package luenci.array;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 12:57
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(36));
        }

        System.out.println(list);

    }
}
