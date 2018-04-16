/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
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
@JPA
public class KweetDAOJPaController implements KweetDAO, Serializable {

    @PersistenceContext(unitName = "kwetter")
    private EntityManager em;
    private String s;

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Kweet> GetAllKweets() {

        String sql = "SELECT k FROM Kweet k";
        TypedQuery<Kweet> query = em.createQuery(sql, Kweet.class);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public Kweet GetKweetById(long id) {

        String sql = "SELECT k FROM Kweet k WHERE k.id = :id";
        TypedQuery<Kweet> query = em.createQuery(sql, Kweet.class)
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
        em.persist(kweet);
    }

    @Override
    public List<Kweet> GetKweetByMentionUsername(String username) {
        try {
            String sql = "SELECT k FROM Kweet k WHERE k.kid = (SELECT km.kid FROM kweet_MentionedAccounts km WHERE km.user_id = (SELECT u.uid FROM User u WHERE u.username = :username))";
            TypedQuery<Kweet> query = em.createQuery(sql, Kweet.class)
                    .setParameter("username", username);

            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetByHashtagId(long hastagId) {
        String sql = "SELECT k from Kweet k WHERE k.kid = (SELECT kh.kid FROM Kweet_Hashtag kh WHERE kh.hastag_id = :hid)";
        TypedQuery<Kweet> query = em.createQuery(sql, Kweet.class)
                .setParameter("hid", hastagId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public List<Kweet> GetKweetsByUser(long userId) {
        String sql = "SELECT k FROM Kweet k WHERE k.user.id = :uid";
        TypedQuery<Kweet> query = em.createQuery(sql, Kweet.class)
                .setParameter("uid", userId);
        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
