/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class KweetDAOImpl implements KweetDAO {

    private List<Kweet> kweets;

    public KweetDAOImpl() {
        kweets = new ArrayList<Kweet>();
    }

    @Override
    public List<Kweet> GetAllKweets() {
        return this.kweets;
    }

    @Override
    public Kweet GetKweetById(int id) {
        for (Kweet kweet : kweets) {
            if (kweet.getId() == id) {
                return kweet;
            }
        }
        return null;
    }

    @Override
    public void DeleteKweet(Kweet kweet) {
        for (Kweet k : kweets) {
            if (k.getId() == kweet.getId()) {
                this.kweets.remove(k);
            }
        }
    }

    @Override
    public void AddKweet(Kweet kweet) {
        this.kweets.add(kweet);
    }

}
