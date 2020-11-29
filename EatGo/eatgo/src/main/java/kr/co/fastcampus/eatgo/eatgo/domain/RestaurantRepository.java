package kr.co.fastcampus.eatgo.eatgo.domain;

import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findByID(Long id);
}
