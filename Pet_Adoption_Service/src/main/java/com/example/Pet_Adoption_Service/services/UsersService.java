package com.example.Pet_Adoption_Service.services;

import com.example.Pet_Adoption_Service.models.Users;
import com.example.Pet_Adoption_Service.repositories.UsersRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepo usersRepo;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public Users registerUsers(Users users)
    {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setRoles("USER");
        return usersRepo.save(users);
    }

    public Users registerShelter(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setRoles("SHELTER");
        return usersRepo.save(users);
    }

    public Users registerAdmin(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setRoles("ADMIN");
        return usersRepo.save(users);
    }
}
