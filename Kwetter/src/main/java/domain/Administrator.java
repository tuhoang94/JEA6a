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
public class Administrator extends Account {

    public Administrator(int id, String username, String password, Role role) {
        super(id, username, password, role);
    }

    public void editRole(Account account, Role role) {

        account.SetRole(role);
    }

}
