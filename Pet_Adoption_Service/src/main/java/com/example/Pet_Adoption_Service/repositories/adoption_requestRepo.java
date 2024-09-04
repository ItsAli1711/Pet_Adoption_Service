package com.example.Pet_Adoption_Service.repositories;

import com.example.Pet_Adoption_Service.models.adoption_request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adoption_requestRepo extends JpaRepository<adoption_request,Integer> {
}
