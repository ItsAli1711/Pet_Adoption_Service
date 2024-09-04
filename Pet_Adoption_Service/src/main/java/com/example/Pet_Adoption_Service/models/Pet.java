package com.example.Pet_Adoption_Service.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pet {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String breed;
    private Integer age;
    private Boolean adopted;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shelter_id",referencedColumnName = "id")
    private Shelter shelter;
    private String category;


}
