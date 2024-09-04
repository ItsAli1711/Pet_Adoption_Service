package com.example.Pet_Adoption_Service.repositories;

import com.example.Pet_Adoption_Service.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepo extends JpaRepository<Pet,Integer> {
}
