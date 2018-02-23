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

    private List<Account> accounts;

    public Administration(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void editRole(Account account, Role role) {
        for (Account a : this.accounts) {
            if (a.GetID() == account.GetID()) 
            {
               account.SetRole(role);
            }
        }
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

}
