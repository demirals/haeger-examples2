package de.haegerconsulting.quarkus.userservice.service;

import de.haegerconsulting.quarkus.userservice.dao.UserDao;
import de.haegerconsulting.quarkus.userservice.model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    private UserDao userDao;


    public void addUser(User user){
        userDao.addUser(user);
    }

    public List<User> getAllUsers(){
        return userDao.getAll();
    }

    public void deleteUser(User user){
        userDao.delete(user);
    }

    public User getUserById(Long id){
        return userDao.getById(id);
    }



}
