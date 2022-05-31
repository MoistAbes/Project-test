package com.kodilla.ecommercee;

import com.kodilla.ecommercee.dto.ProductDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class EcommerceeApplication {

    public static void main(String[] args) {
        ProductDto productDto = new ProductDto(1L, "Koza", "To jest koza", 150);
        //SpringApplication.run(EcommerceeApplication.class, args);


        System.out.println(productDto.getDescription());
    }

}

