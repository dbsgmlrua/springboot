package kr.co.fastcampus.eatgo.eatgo.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fastcampus.eatgo.eatgo.domain.Restaurant;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> retaurants = new ArrayList<>();

        Restaurant res = new Restaurant(1004L, "Bob zip", "Seoul");
        retaurants.add(res);
        return retaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){

        List<Restaurant> retaurants = new ArrayList<>();

        retaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        retaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));


        Restaurant res = retaurants.stream().filter(r-> r.getid().equals(id)).findFirst().orElse(null);
        return res;
    }
}
