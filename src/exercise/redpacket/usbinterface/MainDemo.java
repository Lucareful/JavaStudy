package exercise.redpacket.usbinterface;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 15:51
 * @info 1.0
 */
public class MainDemo {
    public static void main(String[] args) {
        // 创建一个笔记本对象
        Computer c = new Computer();
        c.powerOn();
        // 第一种写法
        /*Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        mouse.open();
        keyboard.open();
        keyboard.close();
        mouse.close();*/

        // 第二种写法
        // 向上转型（鼠标）
        // UsbInterface usb = new Mouse();

        c.useDevice(new Mouse());
        c.useDevice(new Keyboard());


        c.powerOff();
    }
}
