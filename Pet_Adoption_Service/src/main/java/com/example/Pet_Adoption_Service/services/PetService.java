package com.example.Pet_Adoption_Service.services;

import com.example.Pet_Adoption_Service.models.Pet;
import com.example.Pet_Adoption_Service.models.PetDTO;
import com.example.Pet_Adoption_Service.models.Shelter;
import com.example.Pet_Adoption_Service.repositories.PetRepo;
import com.example.Pet_Adoption_Service.repositories.ShelterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepo repo;
    private final ShelterRepo shelterRepository;

    public Pet add_pet(PetDTO petDTO)
    {
        Shelter shelter = new Shelter();
        if(petDTO.getShelterId() == 0)          // if pet is not from a shelter, users can assign 0 to ShelterId
        {
            shelter = null;
        }
        else
        {
            shelter = shelterRepository.findById(petDTO.getShelterId())
                    .orElseThrow(() -> new RuntimeException("Shelter not found with ID: " + petDTO.getShelterId()));
        }

        Pet pet = new Pet();
        pet.setName(petDTO.getName());
        pet.setBreed(petDTO.getBreed());
        pet.setAge(petDTO.getAge());
        pet.setAdopted(petDTO.getAdopted());
        pet.setCategory(petDTO.getCategory());
        pet.setShelter(shelter);
        return repo.save(pet);
    }

    public List<Pet> getPets() {
       return repo.findAll();
    }
    public Pet getPetById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public Pet modifyById(int id, Pet pet) {
        pet.setId(id);
        return repo.save(pet);
    }
    public void deleteById(int id)
    {
        repo.deleteById(id);
    }
}
