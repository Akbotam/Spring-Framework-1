package kz.mautkazy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("qpopMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(MusicGenre musicGenre){
        Random rnd = new Random();
        String result = "";
        switch (musicGenre) {
            case Qpop:
                result = "Playing: " + music1.getSong()[rnd.nextInt(music1.getSong().length)];
                break;
            case Classical:
                result = "Playing: " + music2.getSong()[rnd.nextInt(music2.getSong().length)];
        }
        return result;
    }
}
