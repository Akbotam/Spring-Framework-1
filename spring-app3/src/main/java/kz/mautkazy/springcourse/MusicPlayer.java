package kz.mautkazy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    //private Music music1;
    //private Music music2;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //@Autowired
    /*public MusicPlayer(@Qualifier("qpopMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/
    public String playMusic(){
        Random rnd = new Random();

        return musicList.get(rnd.nextInt(musicList.size())).getSong();
    }
}
