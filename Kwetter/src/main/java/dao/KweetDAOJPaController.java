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

    @PersistenceContext(unitName = "kwetter")
    private EntityManager em;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Kweet> GetAllKweets() {
        String sql = "SELECT k FROM Kweet k";
        TypedQuery<Kweet> query = em.createNamedQuery(sql, Kweet.class);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public Kweet GetKweetById(long id) {
        String sql = "SELECT k FROM Kweet k WHERE k.id = :id";
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
        String sql = "SELECT k FROM Kweet k WHERE k.id = (SELECT k.id FROM kweet_MentionedAccounts km WHERE kw.user_id = (SELECT u.id FROM User u WHERE u.username = :username))";
        TypedQuery<Kweet> query = em.createNamedQuery(sql, Kweet.class)
                .setParameter("username", username);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetByHashtagId(long hastagId) {
        String sql = "SELECT k from Kweet k WHERE k.id = (SELECT K.id FROM Kweet_Hashtag kh WHERE kh.hastag_id = :hid)";
        TypedQuery<Kweet> query = em.createNamedQuery(sql, Kweet.class)
                .setParameter("hid", hastagId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetsByUser(long userId) {
        String sql = "SELECT k FROM Kweet k WHERE k.owner = :uid";
        TypedQuery<Kweet> query = em.createNamedQuery(sql, Kweet.class)
                .setParameter("uid", userId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
