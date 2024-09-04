package com.example.Pet_Adoption_Service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Shelter {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;
    private String email;
    private Boolean visitable;

}
