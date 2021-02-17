package ru.bardyzh.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    private Music music3;
    private List<Music> musicList = new ArrayList<Music>();

    public Random rand = new Random();

    /*public MusicPlayer(Music music1,
                        Music music2,
                        Music music3 ){
        this.music1=music1;
        this.music2=music2;
        this.music3=music3;
    }*/

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }


    public String playMusic(Genre genre){
        switch (genre.name()){
            case "ROCK":
                return "Playing: " + music1.getSong(rand.nextInt(2));
            case "CLASSICAL":
                return "Playing: " + music2.getSong(rand.nextInt(2));
            case "JAZZ":
                return "Playing: " + music3.getSong(rand.nextInt(2));
            default:
                return "Playing: ";
        }
    }

    public String playMusic(){
        return musicList.get(rand.nextInt(2)).getSong();
    };

    /*public void playMusicList(){
        for(int i=0;i<musicList.size();i++){
            System.out.printf("%d - %s \n", i+1, musicList.get(i).getSong());
        }
    }*/
}
