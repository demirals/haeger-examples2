package de.haegerconsulting.quarkus.userservice.dao;

import de.haegerconsulting.quarkus.userservice.model.User;
import org.hibernate.Session;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

//@Transactional - EM wil enlist and flush at commit
@Transactional
@ApplicationScoped
public class UserDao {

    @Inject
    EntityManager em;


    public void addUser(User user){
        Session session  = em.unwrap(Session.class);
        session.saveOrUpdate(user);
    }


    public void delete(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));
    }

    public List<User> getAll(){
        return em.createQuery("Select u from User u").getResultList();
    }


    public User getById(Long id) {
        return em.find(User.class, id);
    }
}
