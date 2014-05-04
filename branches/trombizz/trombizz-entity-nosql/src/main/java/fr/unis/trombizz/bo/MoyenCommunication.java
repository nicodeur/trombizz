package fr.unis.trombizz.bo;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IMoyenCommunication;

public class MoyenCommunication implements IMoyenCommunication {
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personne_id")
	private Collaborateur personne;

	public Collaborateur getPersonne() {
		return personne;
	}

	public void setPersonne(ICollaborateur personne) {
		if(personne instanceof Collaborateur)
			this.personne = (Collaborateur) personne;
	}
	
	
}
