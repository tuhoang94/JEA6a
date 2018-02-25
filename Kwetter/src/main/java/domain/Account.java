/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Ronal
 */
public class Account {
    
    private int id;
    private String username;
    private String password;
    private Role role;
    private Administration admin;
    
    public Account(int id, String username, String password, Role role)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public Role GetRole()
    {
        return this.role;
    }
    public void SetRole(Role role)
    {
        this.role = role;
    }
    
    public int GetID()
    {
        return this.id;
    }
    
    public void EditUsername(String username){
        for(Account user : admin.GetAccounts()){
            if(user.username.equals(username)) throw new IllegalArgumentException("Username already exist");
            this.username = username;
        }
}
    
}
