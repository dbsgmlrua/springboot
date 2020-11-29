package kr.co.fastcampus.eatgo.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository{
    
    private List<Restaurant> retaurants = new ArrayList<>();

    public RestaurantRepositoryImpl(){

        retaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        retaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));        
    }
    @Override
    public List<Restaurant> findAll(){
        return retaurants;
    }

    @Override
    public Restaurant findByID(Long id){
        return retaurants.stream().filter(r-> r.getid().equals(id)).findFirst().orElse(null);
    }
}
