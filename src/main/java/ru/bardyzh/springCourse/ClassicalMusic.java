package ru.bardyzh.springCourse;


import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
    @Override
    public String getSong() {
        return "Vengerian Rapsody";
    }
}
