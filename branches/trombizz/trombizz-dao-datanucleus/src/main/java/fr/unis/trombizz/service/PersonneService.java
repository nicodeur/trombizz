package fr.unis.trombizz.service;

import java.util.List;

import fr.unis.trombizz.dao.PersonneDao;
import fr.unis.trombizz.shared.dto.PersonneDto;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;

public class PersonneService extends  fr.unis.trombizz.shared.service.impl.PersonneService{
	public PersonneService() {
		super(new PersonneDao());
	}

	//TODO voir pourquoi obligé de faire ça :s
	@Override
	public List<SimplePersonneDto> rechercherCollaborateur(
			RecherchePersonneDto criteria) {
		return super.rechercherCollaborateur(criteria);
	}

	@Override
	public PersonneDto findById(Long idCollaborateur) {
		return super.findById(idCollaborateur);
	}

	
}
