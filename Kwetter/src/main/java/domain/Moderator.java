/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Ronal
 */
public class Moderator extends Account{
    
    private List<Kweet> Kweets;
    private Administration Administration;

    public Moderator(List<Kweet> Kweets, Administration Administration, int id, String username, String password, domain.Role role) {
        super(id, username, password, role);
        this.Kweets = Kweets;
        this.Administration = Administration;
    }
    
    public void deleteKweet(Kweet kweet)
    {
       
    }
    
    public List<Kweet> getKweets()
    {
       return this.Kweets;
    }
    
    public List<User> getUsers()
    {
        //TODO
        return null;
    }
    
    public void BanUser(Account account)
    {
        if (account.GetRole() == Role.USER)
        {
        account.SetRole(Role.BANNED);
        }
    }
    
    
    
}
