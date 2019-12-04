package Luenci.method;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/4 11:30
 */
public class SwitchDemo {
    public static void main(String[] args){
        // 设置日期格式
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间
        Date date = new Date();
        // 使用SimpleDateFormat格式化日期
        SimpleDateFormat df = new SimpleDateFormat("EEEE");
        String currSun = df.format(date);

        switch (currSun){
            case "星期一":
                System.out.println(currSun + "开始上班");
                break;
            case "星期六":
                System.out.println(currSun + "休息第一天");
                break;
            case "星期五":
                System.out.println(currSun + "放假前夕");
                break;
            default:
                System.out.println(currSun + "上班中");
                break;
        }
    }
}
