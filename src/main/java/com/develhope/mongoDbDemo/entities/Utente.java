package com.develhope.mongoDbDemo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Utente {

    @Id
    private String id;

    private String firstName;

    private String lastName;
}
