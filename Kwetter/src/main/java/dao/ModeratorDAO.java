/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Moderator;
import java.util.List;

/**
 *
 * @author Ronal
 */
public interface ModeratorDAO {
    public List<Moderator> GetAllModerators();
    
}
