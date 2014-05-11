package fr.unis.trombizz.dao;

import java.util.List;

import javax.persistence.Query;

import fr.unis.trombizz.bo.Collaborateur;
import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.dao.IPersonneDao;
import fr.unis.trombizz.shared.dto.RecherchePersonneDto;

public class PersonneDao extends AbstractDao<ICollaborateur, Long> implements IPersonneDao {

	public PersonneDao() {
		super(ICollaborateur.class);
	}

	@SuppressWarnings("unchecked")
	public List<ICollaborateur> rechercherCollaborateur(
			RecherchePersonneDto criteria) {
		try {
			Query query =  getEntityManagr().createQuery("from Collaborateur where nom = :nom or prenom = :prenom "
					+ "or email = :email or telephone := telephone");
			
			query.setParameter("nom", criteria.getNom());
			query.setParameter("prenom", criteria.getPrenom());
			query.setParameter("email", criteria.getEmail());
			query.setParameter("telephone", criteria.getTelephone());
			
			return query.getResultList();
		} finally {
			getEntityManagr().close();
		}
	}

	
}
