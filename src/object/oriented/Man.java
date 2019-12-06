package object.oriented;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/6 8:41
 */
public class Man {
    String name;
    int age;
    private boolean male;

    public void hello() {
        System.out.println("hello I am a man?" + male);
    }

    public boolean isMan() {
        return male;
    }

    public void setMan(boolean man) {
        this.male = man;
    }
}
