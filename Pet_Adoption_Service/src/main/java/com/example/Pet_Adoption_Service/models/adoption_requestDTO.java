package com.example.Pet_Adoption_Service.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class adoption_requestDTO {

    private Integer petId;
    private Integer usersId;

}
