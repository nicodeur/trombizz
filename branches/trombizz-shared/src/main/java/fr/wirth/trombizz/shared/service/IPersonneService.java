package fr.wirth.trombizz.shared.service;

import fr.wirth.trombizz.shared.dto.PersonneDto;
import fr.wirth.trombizz.shared.dto.RecherchePersonneDto;
import fr.wirth.trombizz.shared.dto.SimplePersonneDto;
import java.util.List;

/**
 *
 * @author cyril
 */
public interface IPersonneService {
    
    List<SimplePersonneDto> rechercherCollaborateur(RecherchePersonneDto criteria);
    
    PersonneDto findById(Long idCollaborateur);
}
