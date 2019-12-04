package Luenci.method;
import java.util.Scanner;
/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/3 17:39
 */
public class ProcessControl {
    public static void main(String[] args){
        // 从键盘处获得成绩值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的成绩");
        String score = sc.nextLine();

        // 判断成绩优秀否
        if ( Integer.parseInt(score) >= 90){
            System.out.println("您的成绩优秀");
        } else if (Integer.parseInt(score) > 80 && Integer.parseInt(score) < 90){
            System.out.println("你的成绩良好");
        } else if (Integer.parseInt(score) > 60 && Integer.parseInt(score) <80){
            System.out.println("您的成绩合格");
        } else {
            System.out.println("您的成绩不合格");
        }

    }

    public static String getType(Object o){
        return o.getClass().toString();

    }
}
