/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jeroe
 */
public class KweetDAOJPaController implements KweetDAO, Serializable {

    @PersistenceContext(unitName = "KwetterPersUnit")
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Kweet> GetAllKweets() {
        TypedQuery<Kweet> query = em.createNamedQuery("Kweet.findAll", Kweet.class);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public Kweet GetKweetById(long id) {
        TypedQuery<Kweet> query = em.createNamedQuery("Kweet.findByID", Kweet.class)
                .setParameter("id", id);
        try {
            return (Kweet) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public void DeleteKweet(Kweet kweet) {
        em.remove(kweet);
    }

    @Override
    public void AddKweet(Kweet kweet) {
        em.merge(kweet);
    }

    @Override
    public List<Kweet> GetKweetByMentionUsername(String username) {
        TypedQuery<Kweet> query = em.createNamedQuery("Kweet.findByUsername", Kweet.class)
                .setParameter("username", username);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetByHashtagId(long hastagId) {
        TypedQuery<Kweet> query = em.createNamedQuery("Kweet.findByhashtagID", Kweet.class)
                .setParameter("hastagId", hastagId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetsByUser(long userId) {

        TypedQuery<Kweet> query = em.createNamedQuery("Kweet.findByuserID", Kweet.class)
                .setParameter("userId", userId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
