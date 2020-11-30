package com.fastcampus.java.controller;

import com.fastcampus.java.model.SearchParam;
import com.fastcampus.java.model.entity.Item;
import com.fastcampus.java.model.entity.OrderDetail;
import com.fastcampus.java.model.entity.User;
import com.fastcampus.java.repository.ItemRepository;
import com.fastcampus.java.repository.OrderDetailRepository;
import com.fastcampus.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    //  json, xml, multipart-form / text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @PostMapping("/postUser")
    public void createdUser(@RequestBody User user){
        User newUser = userRepository.save(user);
        System.out.println("newUser : "+newUser);
    }
    @PostMapping("/postItems")
    public void createdUsers(@RequestBody User user2){

        // String sql = insert into user (%s, %s , %d ) value (account, email, age);
        User user = new User();
        user.setAccount("TestUser02");
        user.setEmail("TestUser02@gmail.com");
        user.setPhoneNumber("010-1111-2222");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);


        Item item = new Item();
        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("삼성 노트북");

        Item newItem = itemRepository.save(item);


        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDateTime.now());

        // 어떤사람?
        //orderDetail.setUser(newUser);

        // 어떤 상품?
        //orderDetail.setItem(newItem);


        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        //Assertions.assertNotNull(newOrderDetail);
    }
}
