package com.example.Pet_Adoption_Service.repositories;

import com.example.Pet_Adoption_Service.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {
    Optional<Users> findByUsername(String username);
}
