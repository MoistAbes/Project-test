package com.kodilla.ecommercee;

import com.kodilla.ecommercee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest()
public class SpringBootJPAIntegrationTest {

    @Autowired
    private UserRepository genericEntityRepository;


    /*
    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        GenericEntity genericEntity = genericEntityRepository
                .save(new GenericEntity("test"));
        Optional<GenericEntity> foundEntity = genericEntityRepository
                .findById(genericEntity.getId());

        assertTrue(foundEntity.isPresent());
        assertEquals(genericEntity.getValue(), foundEntity.get().getValue());
    }

     */
}
