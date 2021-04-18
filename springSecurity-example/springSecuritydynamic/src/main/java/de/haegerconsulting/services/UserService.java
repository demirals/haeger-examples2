package de.haegerconsulting.services;

import de.haegerconsulting.entities.User;
import de.haegerconsulting.exceptions.ResourceNotFoundException;
import de.haegerconsulting.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // POST USER
    public User saveUser(User user){
        return userRepository.save(user);
    }

//    public List<User> saveUsers(List<User> users){
//        return userRepository.saveAll(users);
//    }

//    // GET USER
//    public List<User> getUsers(){
//        return userRepository.findAll();
//    }
    public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No user the id : " + id)
        );
    }
    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }


    // DELETE USER
    public String deleteUser (Long id){
        userRepository.deleteById(id);
        return "User with the id " + id + " removed";
    }

    // UPDATE USER
    public User updateUser(User user, Long id){
        User existingUser = userRepository.findAllById(id);

        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        existingUser.setEnabled(user.isEnabled());
        existingUser.setRoles(user.getRoles());

        return userRepository.save(existingUser);
    }
}
