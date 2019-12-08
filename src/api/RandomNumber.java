package api;

import java.util.Random;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/8 19:13
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(3);
        System.out.println(num);

    }
}
