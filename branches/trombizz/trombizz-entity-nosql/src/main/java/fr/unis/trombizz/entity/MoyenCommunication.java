package fr.unis.trombizz.entity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MoyenCommunication {
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personne_id")
	private Personne personne;

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
}
