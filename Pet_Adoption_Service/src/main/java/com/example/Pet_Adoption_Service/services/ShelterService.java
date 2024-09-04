package com.example.Pet_Adoption_Service.services;

import com.example.Pet_Adoption_Service.models.Pet;
import com.example.Pet_Adoption_Service.models.Shelter;
import com.example.Pet_Adoption_Service.repositories.ShelterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShelterService {
    private final ShelterRepo repo;


    public Shelter getShelterById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Shelter add_shelter(Shelter shelter)
    {
        return repo.save(shelter);
    }

    public List<Shelter> getshelters() {
        return repo.findAll();
    }

    public Shelter modifyById(int id, Shelter shelter) {
        shelter.setId(id);
        return repo.save(shelter);
    }
    public void deleteById(int id)
    {
        repo.deleteById(id);
    }
}
