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

    public Kweet GetKweetById(long id);

    public void DeleteKweet(Kweet kweet);

    public void AddKweet(Kweet kweet);

    void EditKweet(Kweet kweet);

    public List<Kweet> GetKweetByMentionUsername(String username);

    public List<Kweet> GetKweetByHashtagId(long hastagId);

    public List<Kweet> GetKweetsByUser(long userId);

}
