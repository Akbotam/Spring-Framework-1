package kz.mautkazy.springcourse;

import org.springframework.stereotype.Component;

//@Component
public class QpopMusic implements Music{
    @Override
    public String getSong() {
        return "DARN";
    }
}
