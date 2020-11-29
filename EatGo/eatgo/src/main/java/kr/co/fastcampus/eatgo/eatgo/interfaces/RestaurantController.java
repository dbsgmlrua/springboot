package kr.co.fastcampus.eatgo.eatgo.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.fastcampus.eatgo.eatgo.domain.MenuItem;
import kr.co.fastcampus.eatgo.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.eatgo.domain.RestaurantRepository;

@RestController
public class RestaurantController {
    
    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> retaurants = restaurantRepository.findAll();

        return retaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){

        Restaurant retaurants = restaurantRepository.findByID(id);

        List<MenuItem> menuItems = menuitemRepository.findAllByRestaurantId(id);
        retaurants.setMenuItems(menuItems);
        retaurants.addMenuItem(new MenuItem("Kimchi"));
        return retaurants;
    }
}
