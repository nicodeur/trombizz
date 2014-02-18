package fr.wirth.trombizz.shared.viewer;

import fr.wirth.trombizz.shared.dto.RecherchePersonneDto;

/**
 *
 * @author cyril
 */
public interface IPersonneViewer {

    void afficherFicheCollaborateur(Long idCollaborateur);
    
    void rechercherCollaborateur(RecherchePersonneDto criteresRecherche);
    
}
