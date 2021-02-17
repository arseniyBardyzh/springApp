package ru.bardyzh.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public void doMyInit(){
        System.out.println("Player are initialising");
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }



    public String playMusic(){
        return "Playing: " + classicalMusic.getSong();
    }

    /*public void playMusicList(){
        for(int i=0;i<musicList.size();i++){
            System.out.printf("%d - %s \n", i+1, musicList.get(i).getSong());
        }
    }*/
}
