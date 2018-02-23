/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class Moderator extends Account{
    
    private Administration Administration;

    public Moderator(List<Kweet> Kweets, Administration Administration, int id, String username, String password, domain.Role role) {
        super(id, username, password, role);
        this.Administration = Administration;
    }
    
    public void deleteKweet(Kweet kweet)
    {
       
    }
    
    public List<Kweet> getKweets()
    {
       return this.Administration.GetKweets();
    }
    
    public List<User> getUsers()
    {
        return this.Administration.GetUsers();
    }
    
    public void BanUser(Account account)
    {
        if (account.GetRole() == Role.USER)
        {
        account.SetRole(Role.BANNED);
        }
    }
    
    
    
}
