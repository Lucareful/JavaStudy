package exercise.redpacket.usbinterface;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/17 15:45
 * @info 1.0
 */
public class Computer {
    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

    public void useDevice(UsbInterface usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mosue = (Mouse) usb;
            mosue.click();
            //((Mouse) usb).click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
            //((Keyboard) usb).type();
        } else {
            System.out.println("设备不支持");
        }
        usb.close();
    }
}

