package dao;

import dao.IHdmi;
import org.springframework.stereotype.Component;

@Component
public class Tv implements IHdmi {
    @Override
    public void print(byte[] b) {
        String s= new String(b);
        System.out.println(s);
    }


}
