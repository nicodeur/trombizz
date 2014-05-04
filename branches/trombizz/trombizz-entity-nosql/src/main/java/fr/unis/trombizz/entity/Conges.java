package fr.unis.trombizz.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="conges")
public class Conges {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="debut")
	private Date debut;
	
	@Column(name="fin")
	private Date fin;
	
	@ManyToOne(fetch=FetchType.LAZY	)
	@JoinColumn(name="personne_id")
	private Personne personne;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
}
