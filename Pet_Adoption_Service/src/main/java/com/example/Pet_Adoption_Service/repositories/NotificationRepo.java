package com.example.Pet_Adoption_Service.repositories;

import com.example.Pet_Adoption_Service.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Integer> {
}
