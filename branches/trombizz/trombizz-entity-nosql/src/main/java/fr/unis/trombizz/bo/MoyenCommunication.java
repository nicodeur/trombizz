package fr.unis.trombizz.bo;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IMoyenCommunication;
import fr.unis.trombizz.shared.bo.ITypeCanal;

public class MoyenCommunication implements IMoyenCommunication {
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personne_id")
	private Collaborateur personne;

	@ManyToOne(fetch=FetchType.EAGER)
	private TypeCanal typeCanal;
	
	public Collaborateur getPersonne() {
		return personne;
	}

	public void setPersonne(ICollaborateur personne) {
		if(personne instanceof Collaborateur)
			this.personne = (Collaborateur) personne;
	}

	public ITypeCanal getTypeCanal() {
		return typeCanal;
	}

	public void setTypeCanal(ITypeCanal typeCanal) {
		if(typeCanal instanceof TypeCanal)
			this.typeCanal = (TypeCanal) typeCanal;
	}
	
	
}
