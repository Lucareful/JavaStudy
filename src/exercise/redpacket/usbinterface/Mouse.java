package exercise.redpacket.usbinterface;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 15:46
 * @info 1.0
 */
public class Mouse implements UsbInterface{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
