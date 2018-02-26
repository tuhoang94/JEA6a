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
    
    @Override
    public List<Kweet> findallKweets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getLoggedInUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kweet> getMentionsFromUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kweet> getTweetsFromUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createKweet(Kweet kweet) {
        User user = userDao.GetUserById(kweet.getUser().GetID());
        if (user!=null){
            kweetDao.AddKweet(kweet);
            user.createKweet(kweet);
        }
    }

    @Override
    public void delete(int id, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kweet getKweetById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
