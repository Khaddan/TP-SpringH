package metier;

import dao.IUsb;
import dao.Ecran;
import dao.IVga;
import org.springframework.stereotype.Component;

@Component
public class UC {
    IUsb usb;
    IVga vga;


    public UC(IUsb usb, IVga vga) {
        this.usb = usb;
        this.vga = vga;
    }

    public int readData(){
        return usb.read();
    }
    public void printData(String s){
        vga.print(s);
    }


    public void setDao(Ecran dao) {
        this.usb=usb;
    }
}
