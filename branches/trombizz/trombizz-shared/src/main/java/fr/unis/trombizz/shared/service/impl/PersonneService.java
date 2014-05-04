package fr.unis.trombizz.shared.service.impl;

import fr.unis.trombizz.shared.bo.Collaborateur;
import fr.unis.trombizz.shared.convert.CollaborateurConverter;
import fr.unis.trombizz.shared.convert.SimpleCollaborateurConverter;
import fr.unis.trombizz.shared.dao.IPersonneDao;
import fr.unis.trombizz.shared.dto.PersonneDto;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;
import fr.unis.trombizz.shared.service.IPersonneService;
import java.util.List;

/**
 *
 * @author cyril
 */
public class PersonneService implements IPersonneService {

    private final IPersonneDao personneDao;

    public PersonneService(IPersonneDao dao) {
        personneDao = dao;
    }

    public List<SimplePersonneDto> rechercherCollaborateur(RecherchePersonneDto criteria) {
        List<Collaborateur> liste = personneDao.rechercherCollaborateur(criteria);
        return SimpleCollaborateurConverter.INSTANCE.convert(liste);
    }

    public PersonneDto findById(Long idCollaborateur) {
        Collaborateur c = personneDao.findById(idCollaborateur);
        return CollaborateurConverter.INSTANCE.convert(c);
    }

}
