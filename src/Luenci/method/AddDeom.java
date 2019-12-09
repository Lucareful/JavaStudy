package luenci.method;

/**
 * @author luenci
 * @version 1.0
 * @date 2019/12/4 15:18
 */
public class AddDeom {

    public static void main(String[] args) {

        // 计算100以内的偶数和
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                a += i;
            }
        }
           System.out.println(a);
    }

}
