package com.backcalcme.dto;


import com.backcalcme.model.Client;
import lombok.Data;

@Data
public class ClientDTO {


    private String name;
    private String email;
    private String phone;



    public Client converter(){
        return  new Client(this.getName(),this.getEmail(),this.getPhone());
    }

}
