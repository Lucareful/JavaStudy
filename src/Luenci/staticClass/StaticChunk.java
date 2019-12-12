package luenci.staticclass;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/12 17:19
 * @info 静态代码块
 */
public class StaticChunk {
    static {
        System.out.println("我是静态代码块的内容");
    }

    public StaticChunk() {
        System.out.println("我是一个构造方法");
    }
}
