/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

/**
 *
 * @author Ronal
 */
public class Moderator extends Account{
    
    private List<Kweet> Kweets;
    private Administration Administration;

    public Moderator(List<Kweet> Kweets, Administration Administration, int id, String username, String password, Models.Role role) {
        super(id, username, password, role);
        this.Kweets = Kweets;
        this.Administration = Administration;
    }
    
    public void deleteKweet(Kweet kweet)
    {
        //TODO
    }
    
    public List<Kweet> getKweets()
    {
        //TODO
        return null;
    }
    
    public List<User> getUsers()
    {
        //TODO
        return null;
    }
    
    
    
}
