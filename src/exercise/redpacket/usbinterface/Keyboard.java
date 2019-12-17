package exercise.redpacket.usbinterface;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 15:46
 * @info 1.0
 */
public class Keyboard implements UsbInterface{
    @Override
    public void open() {
        System.out.println("插入键盘");
    }

    @Override
    public void close() {
        System.out.println("拔出键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
