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
    
    private List<User> users;
    private List<Kweet> kweets;

    public Moderator(int id, String username, String password, domain.Role role) {
        super(id, username, password, role);
        this.users = new ArrayList<User>();
        this.kweets = new ArrayList<Kweet>();
    }
    
    public void deleteKweet(Kweet kweet)
    {
       this.kweets.remove(kweet);
    }
    
    public List<Kweet> getKweets()
    {
       return this.kweets;
    }
    
    public List<User> getUsers()
    {
        return this.users;
    }
    
    public void EditRole(Account account, Role role)
    {
        if (account.GetRole() == Role.USER)
        {
        account.SetRole(role);
        }
    }
    
    
    
}
