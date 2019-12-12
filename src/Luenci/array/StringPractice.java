package luenci.array;

import java.util.Arrays;


/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 14:38
 * @info 按照指定的格式拼接字符串（待优化）
 */
public class StringPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        String newStr = arrayReplace(intArray);
        System.out.println(newStr);
    }

    public static String arrayReplace(int[] intArray) {
        String[] strArray = new String[intArray.length];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = String.valueOf(intArray[i]);
        }
        // int数组按照默认格式编程字符串
        String str = Arrays.toString(strArray);
        String str1 = str.replace(",", "@");

        return str1;
    }
    
}
