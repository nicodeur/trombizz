/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.wirth.trombizz.shared.dao;

import fr.wirth.trombizz.shared.bo.Collaborateur;
import fr.wirth.trombizz.shared.dto.RecherchePersonneDto;
import java.util.List;

/**
 *
 * @author cyril
 */
public interface IPersonneDao {
    
    List<Collaborateur> rechercherCollaborateur(RecherchePersonneDto criteria) ;
    
    Collaborateur findById(Long id);
}
