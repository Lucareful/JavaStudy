package abstracts;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/15 19:26
 * @info 抽象狗类
 */
public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}
