package com.example.Pet_Adoption_Service.services;

import com.example.Pet_Adoption_Service.models.Pet;
import com.example.Pet_Adoption_Service.models.Users;
import com.example.Pet_Adoption_Service.models.adoption_request;
import com.example.Pet_Adoption_Service.models.adoption_requestDTO;
import com.example.Pet_Adoption_Service.repositories.PetRepo;
import com.example.Pet_Adoption_Service.repositories.UsersRepo;
import com.example.Pet_Adoption_Service.repositories.adoption_requestRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Adoption_RequestService {

    private final adoption_requestRepo repo;
    private final PetRepo petRepo;
    private final UsersRepo usersRepo;

    public adoption_request submitRequest(adoption_requestDTO adoptionRequestDTO) {
        Pet pet = petRepo.findById(adoptionRequestDTO.getPetId()).orElseThrow(() -> new RuntimeException("Pet not found with ID: "
                + adoptionRequestDTO.getPetId()));
        Users user = usersRepo.findById(adoptionRequestDTO.getUsersId())
                .orElseThrow(() -> new RuntimeException("User not found with ID:" + adoptionRequestDTO.getUsersId()));

        adoption_request adoption_request = new adoption_request();
        adoption_request.setPet(pet);
        adoption_request.setUsers(user);
        adoption_request.setStatus("Request Submitted");
        adoption_request.setRequest_date(LocalDateTime.now());
        return repo.save(adoption_request);
    }

    public List<adoption_request> getAllRequests() {
        return repo.findAll();
    }
}
