package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/5 23:03
 */
public class Persons {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "Luenci";
        per.setAge(-18);
        per.sex = '男';

        per.show();
    }
}
