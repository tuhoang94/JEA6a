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
public class Administration {

    private List<Kweet> Kweets;
    private List<User> users;
    private List<Moderator> moderators;
    private List<Account> accounts;

    public Administration(List<User> Users, List<Moderator> Moderators, List<Kweet> Kweets, List<Account> accounts) {
        this.users = Users;
        this.moderators = Moderators;
        this.Kweets = Kweets;
        this.accounts = accounts;
    }

    public List<User> GetUsers() {
        return this.users;
    }

    public List<Moderator> GetModerators() {
        return this.moderators;
    }
    
    public List<Kweet> GetKweets()
    {
        return this.Kweets;
    }
    
    public List<Account> GetAccounts(){
        return this.accounts;
    }

}
