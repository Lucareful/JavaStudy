package luenci.staticclass;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 16:22
 * @info 实例化例子
 */
public class Demo1 {
    public static void main(String[] args) {

        Student stu1 = new Student("Luenci", 22);
        Student stu2 = new Student("Lynn", 22);

        System.out.println("学号：" + stu1.getId() + "姓名：" + stu1.getName() + "年龄：" + stu1.getAge() + "班级：" + Student.room);
        System.out.println("学号：" + stu2.getId() + "姓名：" + stu2.getName() + "年龄：" + stu2.getAge() + "班级：" + Student.room);
    }

}
