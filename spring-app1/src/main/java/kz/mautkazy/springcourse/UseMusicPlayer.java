package kz.mautkazy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music); Doing dependency injection by ourselves

        /*MusicPlayer firstmMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstmMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstmMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstmMusicPlayer.setVolume(10);
        System.out.println(firstmMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/

       // System.out.println("The volume is: " + musicPlayer.getVolume());
        // System.out.println(musicPlayer.getName());
        // musicPlayer.playMusic();

        context.close();
    }
}
