package luenci.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 17:35
 * @info 对字符串进行升序排列，倒叙打印
 */
public class ArraysDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要打印的字符串：");
        String str = sc.next();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length-1; i > 0 ; i--) {
            System.out.println(chars[i]);
        }
    }
}
