package com.example.Pet_Adoption_Service.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class PetDTO {
    private Integer id;
    private String name;
    private String breed;
    private Integer age;
    private Boolean adopted;
    private Integer shelterId;
    private String category;

}
