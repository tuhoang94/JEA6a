/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.KweetDAO;
import dao.UserDAO;
import domain.Kweet;
import domain.User;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class KweetServiceImpl implements KweetService{

    private KweetDAO kweetDao;
    
    private UserDAO userDao;
    
    private User loggedInUser;
    
    @Override
    public List<Kweet> findallKweets() {
        return this.kweetDao.GetAllKweets();
    }

    @Override
    public User getLoggedInUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kweet> getMentionsFromUser(User user) {
        return this.kweetDao.GetKweetByMentionUsername(user.getUsername());
    }

    @Override
    public List<Kweet> getTweetsFromUser(User user) {
        return this.kweetDao.GetKweetsByUser(user.getID());
    }

    @Override
    public void createKweet(Kweet kweet) {
        this.kweetDao.AddKweet(kweet);
    }

    @Override
    public void deleteKweet(long id) {
        Kweet kweet = this.getKweetById(id);
        this.kweetDao.DeleteKweet(kweet);

    }

    @Override
    public Kweet getKweetById(long id) {
        return this.kweetDao.GetKweetById(id);
    }
    
}
