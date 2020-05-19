package com.spring.angular.controller;
import com.spring.angular.model.ntt_dat_users;
import com.spring.angular.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/users"})
public class UserController {
    @Autowired
   private IUsersRepository usersRepository;


    @GetMapping("/all")
    public List<ntt_dat_users> usersList()
    {
        return  usersRepository.findAll();

    }
    @PostMapping(value ="/all")
    public ntt_dat_users add(@RequestBody ntt_dat_users users)
    {
        return usersRepository.save(users);

    }
    @GetMapping(value ="/all/{userid}")
    public Optional<ntt_dat_users> GetUserId(@PathVariable("userid") Integer UsersID)
    {
        return usersRepository.findById(UsersID);

    }
    @PutMapping(path = {"/all/{userid}"})
    public ntt_dat_users edit(@RequestBody ntt_dat_users user,@PathVariable("userid") int userid)
    {
         user.setUserId(userid);
         return usersRepository.save(user);
    }
    @DeleteMapping(path = {"/all/{userid}"})
    public Optional<ntt_dat_users> deleteuser(@PathVariable("userid")int id)
    {
        Optional<ntt_dat_users> user = GetUserId(id);
        if (user != null) {
            usersRepository.deleteById(id);
        }
        return user;

    }


}
