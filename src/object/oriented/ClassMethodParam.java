package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/5 22:26
 */
public class ClassMethodParam {
    public static void main(String[] args) {
        Student one = new Student();
        classMethod(one);
    }

    private static void classMethod(Student param) {
        param.name = "Lynn";
        param.age = 18;
        param.eat();
        param.sleep();
    }
}
