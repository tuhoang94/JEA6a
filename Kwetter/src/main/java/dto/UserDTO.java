/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import domain.Kweet;
import domain.Page;
import domain.Role;
import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class UserDTO {
    
    private Long ID;
    private String role;
    private String username;
    private String password;
    private String bio;
    private String location;
    private String website;    
    private String profilePhoto;
    private int followingAccountsCount;
    private int followersAccountsCount;
    private int kweetsCount;
    private int mentionCount;
    

}
