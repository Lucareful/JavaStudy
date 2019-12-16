package interfaces.multiple.inheritance;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 22:37
 * @info 1.0
 */
public class Son extends Father implements MyInterfaceA{
    @Override
    public void method() {
        System.out.println("覆盖重写重名方法");
    }
}
