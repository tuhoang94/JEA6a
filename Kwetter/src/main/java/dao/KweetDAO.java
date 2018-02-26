/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import java.util.List;

/**
 *
 * @author Ronal
 */
public interface KweetDAO {
    public List<Kweet> GetAllKweets();
    public Kweet GetKweetById(int id);
    public void DeleteKweet(Kweet kweet);    
    public void AddKweet(Kweet kweet);
}
