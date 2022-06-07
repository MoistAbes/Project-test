package com.kodilla.ecommercee.entity;

import com.kodilla.ecommercee.repository.GroupRepository;
import com.kodilla.ecommercee.repository.ProductRepository;
import com.kodilla.ecommercee.service.GroupDbService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GroupTestSuite {

    @Autowired
    GroupRepository repository;
    @Autowired
    ProductRepository productRepository;


    @Test
    void shouldAddGroup(){

        //Given
        Group group = new Group("Ciuchy");
        Group group2 = new Group("Ciuchy2");
        Group group3 = new Group("Ciuchy3");
        Group group4 = new Group("Ciuchy4");


        //When
        repository.save(group);
        repository.save(group2);
        repository.save(group3);
        repository.save(group4);

        Long id = group.getId();
        System.out.println(id);


        //Then
        assertNotEquals(0L, id);
        assertTrue(repository.findById(id).isPresent());


        //CleanUp
        repository.deleteById(id);





    }

//    @Test
//    void shouldGetGroup(){
//        //Given
//        String groupName = "ubranie";
//
//
//        //when
//        List<Group> groups = dbService.getAllGroups();
//
//        //Then
//        assertEquals(1, groups.size());
//    }

}
