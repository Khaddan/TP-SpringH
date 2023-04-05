package dao;

import org.springframework.stereotype.Component;


public class Clavier implements IUsb {
    @Override
    public int read() {
        System.out.println("je suis un clavier");
        return (int) (Math.random()*100);
    }
}
