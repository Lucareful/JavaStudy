package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/11 15:29
 * @info 字符串常量池
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
    }
}
