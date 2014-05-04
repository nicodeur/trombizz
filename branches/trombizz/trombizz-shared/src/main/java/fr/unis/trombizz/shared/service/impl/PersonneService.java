package fr.unis.trombizz.shared.service.impl;

import java.util.List;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.convert.CollaborateurConverter;
import fr.unis.trombizz.shared.convert.SimpleCollaborateurConverter;
import fr.unis.trombizz.shared.dao.IPersonneDao;
import fr.unis.trombizz.shared.dto.PersonneDto;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;
import fr.unis.trombizz.shared.service.IPersonneService;

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
        List<ICollaborateur> liste = personneDao.rechercherCollaborateur(criteria);
        return SimpleCollaborateurConverter.INSTANCE.convert(liste);
    }

    public PersonneDto findById(Long idCollaborateur) {
        ICollaborateur c = personneDao.findById(idCollaborateur);
        return CollaborateurConverter.INSTANCE.convert(c);
    }

}
