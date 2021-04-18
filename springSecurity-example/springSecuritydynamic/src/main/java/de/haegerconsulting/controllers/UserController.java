package de.haegerconsulting.controllers;

import de.haegerconsulting.entities.User;
import de.haegerconsulting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST MAPPING

    // User
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    // GET MAPPING

//    // User
//    @GetMapping
//    public List<User> findAllUsers(){
//        return userService.getUsers();
//    }

//    @GetMapping("{id}")
//    public User findUserById(@PathVariable Long id){
//        return userService.getUserById(id);
//    }

    @GetMapping("{username}")
    public User findUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }


    // PUT MAPPING


    // User
    @PutMapping("{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        return userService.updateUser(user, id);
    }


    // DELETE MAPPING

    // User
    @DeleteMapping("{id}")
    public String deleteUser (@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
