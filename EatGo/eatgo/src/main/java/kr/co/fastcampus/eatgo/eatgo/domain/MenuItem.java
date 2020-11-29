package kr.co.fastcampus.eatgo.eatgo.domain;

public class MenuItem {
    private final String Name; 

    public MenuItem(String name){
        Name = name;
    }

    public String getName(){
        return Name;
    }
}
