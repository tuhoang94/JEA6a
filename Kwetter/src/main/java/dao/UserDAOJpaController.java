/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author jeroe
 */
@Stateless
public class UserDAOJpaController implements UserDAO, Serializable {

    @PersistenceContext(unitName = "kwetter")
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> GetAllUsers() {

        TypedQuery<User> query = em.createNamedQuery("User.findAll", User.class);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public User GetUserById(long id) {
        TypedQuery<User> query = em.createNamedQuery("User.findById", User.class)
                .setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public User GetUserByUsername(String username) {
        TypedQuery<User> query = em.createNamedQuery("User.findByName", User.class)
                .setParameter("username", username);
        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public void AddUser(User user) {
        //em.merge(user);
        em.getTransaction()
                .begin();
        em.persist(user);
        em.getTransaction()
                .commit();
        em.close();
    }

    @Override
    public void DeleteUser(User user) {
        em.remove(user);
    }

    @Override
    public void EditUser(User user) {
        em.merge(user);
    }
}
