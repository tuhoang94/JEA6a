/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Ronal
 */
public class Account {
    
    private int ID;
    private String Username;
    private String Password;
    private Role Role;
    
    public Account(int id, String username, String password, Role role)
    {
        ID = id;
        Username = username;
        Password = password;
        Role = role;
    }
    
}
