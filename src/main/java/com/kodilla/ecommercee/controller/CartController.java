package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.dto.CartDto;
import com.kodilla.ecommercee.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/carts")
public class CartController {


    @GetMapping
    public List<CartDto> getCarts(){
        return new ArrayList<>();
    }

    @GetMapping(value = "{cartId}")
    public CartDto getCart(@PathVariable Long cartId){
        return new CartDto(1L,
                new ArrayList<>(),
                new UserDto(
                        1l,
                        "seba",
                        1,
                        1234),
                123);
    }


}
