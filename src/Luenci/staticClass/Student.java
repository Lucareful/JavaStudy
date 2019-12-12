package luenci.staticclass;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 16:18
 * @info 学生类
 */
public class Student {
    private int id;
    private String name;
    private int age;
    static String room = "Java一班";
    private static int idCount = 0;


    public Student() {
        this.id = ++idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
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

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }
}
