package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 23:05
 * @info 字符串构造方法和直接创建
 */
public class StringDemo {
    public static void main(String[] args) {
        // 使用空参数构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        // 根据字节数组创建数组
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        // 直接创建
        String str4 = "Luenci";
        System.out.println("第四个字符串:" + str4);


    }
}
