package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Souris implements IUsb {
    @Override
    public int read() {
        System.out.println("je suis une souris");
        return (int) (Math.random()*100);
    }
}
