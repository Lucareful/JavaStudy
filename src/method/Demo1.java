package method;

/**
 * @author luenci
 * @version 1.0
 * @date 2019/12/4 16:50
 */
public class Demo1 {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println(result);
    }

    public static void demo() {
        for (int j = 0; j < 5; j++) {
            System.out.println("*******************************");
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
