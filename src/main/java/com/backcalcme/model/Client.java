package com.backcalcme.model;


import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
@Getter
public class Client {

    @Id
    private String id;
    private String name;
    private String email;
    private String phone;

    public Client(String name, String email,String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;

    }
}
