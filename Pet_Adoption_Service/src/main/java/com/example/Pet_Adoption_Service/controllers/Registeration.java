package com.example.Pet_Adoption_Service.controllers;

import com.example.Pet_Adoption_Service.models.Shelter;
import com.example.Pet_Adoption_Service.models.Users;
import com.example.Pet_Adoption_Service.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class Registeration {

    private final UsersService usersService;
    @GetMapping("/home")
    public String home()
    {
        return "Hey!!! welcome to the homepage";
    }

    @PostMapping("/reg_user")
    public Users register_user(@RequestBody Users user)
    {
       return usersService.registerUsers(user);
    }

    @PostMapping("/reg_shelter")
    public Users register_shelter(@RequestBody Users shelter)
    {
        return usersService.registerShelter(shelter);
    }

    @PostMapping("/reg_admin")
    public Users register_admin(@RequestBody Users admin)
    {
        return usersService.registerAdmin(admin);
    }
}
