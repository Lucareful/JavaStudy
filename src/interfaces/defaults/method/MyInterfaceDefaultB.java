package interfaces.defaults.method;

import interfaces.defaults.method.MyInterfaceDefault;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/16 14:27
 * @info 1.0
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void methodA() {
        System.out.println("实现了方法，BBB");
    }

    @Override
    public void methodDefault(){
        System.out.println("类B覆盖重写了默认方法");
    }
}
