/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Moderator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class ModeratorDAOImpl implements ModeratorDAO {

    private List<Moderator> moderators;
    
    public ModeratorDAOImpl(){
        moderators = new ArrayList<Moderator>();
    }
    @Override
    public List<Moderator> GetAllModerators() {
        return this.moderators;
    }


    
}
