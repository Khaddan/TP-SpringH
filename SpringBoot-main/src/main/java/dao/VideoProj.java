package dao;

import org.springframework.stereotype.Component;

@Component
public class VideoProj implements IVga {
    @Override
    public void print(String s) {
        System.out.println("VedioProj "+s);
    }
}
