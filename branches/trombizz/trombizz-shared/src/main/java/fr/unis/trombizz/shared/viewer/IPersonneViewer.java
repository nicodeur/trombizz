package fr.unis.trombizz.shared.viewer;

import fr.unis.trombizz.shared.dto.RecherchePersonneDto;

/**
 *
 * @author cyril
 */
public interface IPersonneViewer {

    void afficherFicheCollaborateur(Long idCollaborateur);
    
    void rechercherCollaborateur(RecherchePersonneDto criteresRecherche);
    
}
