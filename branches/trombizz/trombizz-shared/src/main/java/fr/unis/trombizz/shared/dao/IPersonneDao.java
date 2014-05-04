/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.unis.trombizz.shared.dao;

import java.util.List;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;

/**
 *
 * @author cyril
 */
public interface IPersonneDao {
    
    List<ICollaborateur> rechercherCollaborateur(RecherchePersonneDto criteria) ;
    
    ICollaborateur findById(Long id);
}
