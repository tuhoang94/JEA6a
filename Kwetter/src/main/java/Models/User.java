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
public class User extends Account{
    
    private String ProfilePhoto;
    private List<Account> FollowingAccounts;
    private List<Account> FollowersAccount;

    public User(int id, String username, String password, Role role) {
        super(id, username, password, role);
    }
    
    
}
