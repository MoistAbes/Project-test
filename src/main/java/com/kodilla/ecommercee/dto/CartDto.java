package com.kodilla.ecommercee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CartDto {

    private Long id;
    private List<ProductDto> products;
    private UserDto user;
    private double total;

}
