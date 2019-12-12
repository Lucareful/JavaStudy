package luenci.array;

import java.util.Scanner;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 15:39
 * @info 字符串的各类数值进行统计计数
 */
public class StringCount {
    public static void main(String[] args) {
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && 'Z' >= ch) {
                countUpper++;
            }else if('a'<=ch && 'z'>=ch){
                countLower++;
            }else if('0'<=ch && '9'>=ch){
                countNum++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字母个数："+countUpper);
        System.out.println("小写字母个数："+countLower);
        System.out.println("数字个数："+countNum);
        System.out.println("其他类型个数："+countOther);
    }
}
