package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/5 22:33
 */
public class ClassMethodReturn {
    public static void main(String[] args) {
        Student obj = classReturn();
        System.out.println(obj.name);
        System.out.println(obj.age);

    }

    public static Student classReturn(){
        Student tow = new Student();
        tow.name = "Lucy";
        tow.age = 2;

        return tow;
    }
}
