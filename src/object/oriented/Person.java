package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/5 23:00
 */
public class Person {
    String name;
    private int age;
    char sex;

    public void show() {
        System.out.println("我叫" + name + "年龄" + age + "性别" + sex);
    }

    public void setAge(int num) {
        if (num >=0 && num<100){
            age = num;
        }else {
            System.out.println("您输入的数据有误");
        }
    }

    public int getAge() {
        return age;
    }
}
