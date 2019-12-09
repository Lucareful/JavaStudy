package luenci.array;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/9 10:52
 */
public class Person {
    private String name;
    private int age;

    //无参数构造
    public Person() {
    }

    // 全参数构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
