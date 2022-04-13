package baekjoon.afterLv15.other.cMake;

public class Human{
    public String name;
    public String personality;
    public String job;
    public boolean gender = true;
    public int age = 1;
    public int hp = 100;
    public int ip = 100;

    public Human(){
        this("noName","noPersonality","noJob");
    }

    public Human(String name, String personality, String job){
        this.job = job;
        this.personality = personality;
        this.name = name;
    }


    public void firstSet(String name, String personality, String job){
        this.name = name;
        this.personality = personality;
        this.job = job;
    }



}