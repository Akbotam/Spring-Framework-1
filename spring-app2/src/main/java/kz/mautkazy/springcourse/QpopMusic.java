package kz.mautkazy.springcourse;

import org.springframework.stereotype.Component;

@Component
public class QpopMusic implements Music{
    private String[] qpopMusic= {"Kaitadan", "DARN", "E-yeah"};
    @Override
    public String[] getSong() {
        return qpopMusic;
    }
}
