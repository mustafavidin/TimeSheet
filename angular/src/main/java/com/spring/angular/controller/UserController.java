package com.spring.angular.controller;
import com.spring.angular.model.Users;
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
    public List<Users> usersList()
    {
        return  usersRepository.findAll();

    }
    @PostMapping(value ="/all")
    public Users add(@RequestBody Users users)
    {
        return usersRepository.save(users);

    }
    @GetMapping(value ="/all/{userid}")
    public Optional<Users> GetUserId(@PathVariable("userid") Integer UsersID)
    {
        return usersRepository.findById(UsersID);

    }
    @PutMapping(path = {"/all/{userid}"})
    public Users edit(@RequestBody Users user, @PathVariable("userid") int userid)
    {
         user.setUserId(userid);
         return usersRepository.save(user);
    }
    @DeleteMapping(path = {"/all/{userid}"})
    public Optional<Users> deleteuser(@PathVariable("userid")int id)
    {
        Optional<Users> user = GetUserId(id);
        if (user != null) {
            usersRepository.deleteById(id);
        }
        return user;

    }


}
