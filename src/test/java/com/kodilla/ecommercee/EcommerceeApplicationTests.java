package com.kodilla.ecommercee;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EcommerceeApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("lol");
    }

    @Test
    public void lol(){
        int i = 1;

        assertEquals(1, i);
    }

}

