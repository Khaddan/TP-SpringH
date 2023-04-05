package dao;

import dao.IVga;
import org.springframework.stereotype.Component;

//@Repository("ecran")
@Component
public class Ecran implements IVga {
    @Override
    public void print(String s) {

        System.out.println("Ecran "+s);
    }
}
