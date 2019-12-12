package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/11 15:51
 * @info 常用的String方法
 */
public class StringMethod {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "dsaidnwandua".length();
        System.out.println(length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = " Luenci";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        // 获取指定索引位置的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在一号索引位置的字符是：" + ch);

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果没有  return -1
        String str = "Hello Luenci Lynn Lucy";
        int index = str.indexOf("ll");
        System.out.println("第一次出现的索引值是：" + index);
        System.out.println(str.indexOf("KK"));

        // 字符串的截取方法(前开后闭)
        String str5 = "HELLO Luenci hh";
        String str6 = str5.substring(6,12);
        System.out.println(str6);

        // 转换成字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        // 转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 字符串的内容替换
        String str7 = "是不是玩不起？你大爷的！！！";
        String str8 = str7.replace("你大爷的", "****");
        System.out.println(str8);

        // 字符串的切割(split()方法的参数其实是一个“正则表达式”,如果是特殊字符需要转义)
        String[] strArray = "aaaa,bbbb,cccc,dddd".split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }


    }
}
