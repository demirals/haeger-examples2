package de.haegerconsulting.repositories;

import de.haegerconsulting.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    User findAllById(Long id);
    Optional<User> findById(Long Id);

    @Query("SELECT u FROM User u WHERE u.username = :username")
   public  User findByUsername(@Param("username") String username);

    User deleteById(User user);
}
