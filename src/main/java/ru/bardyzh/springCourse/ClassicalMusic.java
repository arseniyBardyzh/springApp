package ru.bardyzh.springCourse;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

    private static String[] songs = {"Лебединое озеро", "В пещере горного короля", "Танец рыцарей"};


    public ClassicalMusic(){
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
    @Override
    public String getSong(int i) {
        return songs[i];
    }
}
