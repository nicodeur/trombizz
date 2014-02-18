package fr.unis.trombizz.shared.service;

import fr.unis.trombizz.shared.dto.PersonneDto;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;
import java.util.List;

/**
 *
 * @author cyril
 */
public interface IPersonneService {
    
    List<SimplePersonneDto> rechercherCollaborateur(RecherchePersonneDto criteria);
    
    PersonneDto findById(Long idCollaborateur);
}
