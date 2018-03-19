/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.JPA;
import dao.KweetDAO;
import dao.KweetDAOJPaController;
import dao.UserDAO;
import dao.UserDAOJpaController;
import domain.Kweet;
import domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 *
 * @author Ronal
 */
@Stateless @Default
public class KweetServiceImpl{

    @Inject @JPA
    private KweetDAO kweetDao;
    
    @Inject @JPA
    private UserDAO userDao;
    
    private User loggedInUser;
    
    public List<Kweet> findallKweets() {
        return this.kweetDao.GetAllKweets();
    }

    public User getLoggedInUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Kweet> getMentionsFromUser(User user) {
        return this.kweetDao.GetKweetByMentionUsername(user.getUsername());
    }

    public List<Kweet> getTweetsFromUser(User user) {
        return this.kweetDao.GetKweetsByUser(user.getID());
    }

    public void createKweet(Kweet kweet) {
        this.kweetDao.AddKweet(kweet);
    }

    public void deleteKweet(long id) {
        Kweet kweet = this.getKweetById(id);
        this.kweetDao.DeleteKweet(kweet);

    }

    public Kweet getKweetById(long id) {
        return this.kweetDao.GetKweetById(id);
    }

    public List<Kweet> getKweetByHastagId(long id) {
        return this.kweetDao.GetKweetByHashtagId(id);
    }

}
