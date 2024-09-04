package com.example.Pet_Adoption_Service.controllers;

import com.example.Pet_Adoption_Service.models.*;
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
public class OperationsController {

private final PetService petService;
private final ShelterService shelterService;
private final Adoption_RequestService adoptionRequestService;

    @PostMapping("/add_pet")
    public Pet add_pet(@RequestBody PetDTO petDTO)    // we take in pet data transfer object to input shelter id
    {
        return petService.add_pet(petDTO);
    }

    @PostMapping("/add_shelter")
    public Shelter add_shelter(@RequestBody Shelter shelter)
    {
        return shelterService.add_shelter(shelter);
    }
    @PostMapping("/adoption_request")
    public adoption_request submitRequest(@RequestBody adoption_requestDTO adoptionRequestDTO)
    {
        return adoptionRequestService.submitRequest(adoptionRequestDTO);
    }

    @PutMapping("/admin/pets/{id}")
    public Pet modify_pet(@PathVariable int id,@RequestBody Pet pet)
    {
        return petService.modifyById(id,pet);
    }
    @DeleteMapping("/admin/pets/{id}")
    public void deleteById(@PathVariable int id)
    {
        petService.deleteById(id);
    }

    @PutMapping("/admin/shelter/{id}")
    public Shelter modify_shelter(@PathVariable int id,@RequestBody Shelter shelter)
    {
        return shelterService.modifyById(id,shelter);
    }
    @DeleteMapping("/admin/shelter/{id}")
    public void deleteShelterById(@PathVariable int id)
    {
        shelterService.deleteById(id);
    }

    @PutMapping("/admin/adoption_requests/{id}")
    public adoption_request updateRequestStatus(@PathVariable Integer id,@RequestBody String newStatus)
    {
        return adoptionRequestService.updateRequestStatus(id,newStatus);
    }
}
