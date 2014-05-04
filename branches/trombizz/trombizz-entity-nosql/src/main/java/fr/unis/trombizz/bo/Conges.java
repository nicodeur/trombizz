package fr.unis.trombizz.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IConges;

@Entity(name="conges")
public class Conges implements IConges {
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="debut")
	private Date debut;
	
	@Column(name="fin")
	private Date fin;
	
	@ManyToOne(fetch=FetchType.LAZY	)
	@JoinColumn(name="personne_id")
	private Collaborateur personne;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Collaborateur getPersonne() {
		return personne;
	}

	public void setPersonne(ICollaborateur personne) {
		if(personne instanceof Collaborateur)
			this.personne = (Collaborateur) personne;
	}
	
	
}
