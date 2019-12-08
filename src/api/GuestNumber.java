package api;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/6 11:20
 */
public class GuestNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        int rand = ran.nextInt(9);

        Scanner sc = new Scanner(System.in);

        while (true) {
            int guest = sc.nextInt();
            guestNum(rand, guest);
            if (rand == guest) {
                System.out.println("恭喜您猜中啦！！！");
                break;
            }
        }

    }

    public static void guestNum(int rand, int guest) {

        if (guest > rand) {
            System.out.println("您输入的数字过大，请您重新输入");
        } else if (guest < rand) {
            System.out.println("您输入的数字过小，请你重新输入");
        } else {
            System.out.println("您输入的不合法，请重新输入");
        }
    }

}
