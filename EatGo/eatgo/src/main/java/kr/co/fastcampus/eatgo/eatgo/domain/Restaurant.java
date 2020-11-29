package kr.co.fastcampus.eatgo.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String address;
    private final Long id;
    private List<MenuItem> MenuItems = new ArrayList<MenuItem>();

    public Restaurant(Long id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getid(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getInformation(){
        return name + " in " + address;
    }
    public List<MenuItem> getMenuItems(){
        return MenuItems;
    }
    public void addMenuItem(MenuItem menuitem){
        MenuItems.add(menuitem);
    }
}
