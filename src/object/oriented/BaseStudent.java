package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/6 10:50
 */
public class BaseStudent {
    private String name;
    private int age;
    private char sex;

    // 无参数的构造方法
    public BaseStudent() {
        System.out.println("我是一个无参数的构造方法");
    }

    // 全参数的构造方法
    public BaseStudent(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

        System.out.println("我是一个全参数的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
