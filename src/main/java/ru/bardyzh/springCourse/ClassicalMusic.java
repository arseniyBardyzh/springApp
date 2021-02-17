package ru.bardyzh.springCourse;


import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{

    private static String[] songs = {"Лебединое озеро", "В пещере горного короля", "Танец рыцарей"};

    public ClassicalMusic(){
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
    @Override
    public String getSong(int i) {
        return songs[i];
    }
}
