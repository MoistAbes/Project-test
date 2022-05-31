package com.kodilla.ecommercee.entity;




import javax.persistence.*;

@Entity(name = "Table")
@Table(name= "TASKS")
public class GenericEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String value;

    public GenericEntity() {
    }

    public String getValue() {
        return value;
    }

    public Long getId() {

        return id;
    }

    public GenericEntity(String value) {

        this.value = value;
    }
}
