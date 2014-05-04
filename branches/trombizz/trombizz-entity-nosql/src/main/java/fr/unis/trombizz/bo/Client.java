package fr.unis.trombizz.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import fr.unis.trombizz.shared.bo.IClient;

@Entity(name="client")
public class Client implements IClient{
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="nom")
	private String nom;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
