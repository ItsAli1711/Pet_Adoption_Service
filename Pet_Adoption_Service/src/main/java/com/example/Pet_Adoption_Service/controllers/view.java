package com.example.Pet_Adoption_Service.controllers;

import com.example.Pet_Adoption_Service.models.Pet;
import com.example.Pet_Adoption_Service.models.Shelter;
import com.example.Pet_Adoption_Service.models.adoption_request;
import com.example.Pet_Adoption_Service.services.Adoption_RequestService;
import com.example.Pet_Adoption_Service.services.PetService;
import com.example.Pet_Adoption_Service.services.ShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api")
public class view {

    private final ShelterService shelterService;
    private final PetService petService;
    private final Adoption_RequestService adoptionRequestService;

    @GetMapping("/shelters")
    public List<Shelter> getAllShelters()
    {
       return shelterService.getshelters();
    }
    @GetMapping("/pets")
    public List<Pet> getAllPets()
    {
        return petService.getPets();
    }
    @GetMapping("/pets/{id}")
    public Pet getPetById(@PathVariable int id)
    {
        return petService.getPetById(id);
    }
    @GetMapping("/admin/adoption_requests")
    public List<adoption_request> getAllRequests()
    {
        return adoptionRequestService.getAllRequests();
    }
    @GetMapping("/shelters")
    public Shelter getShelterById(@PathVariable int id)
    {
        return shelterService.getShelterById(id);
    }
}
