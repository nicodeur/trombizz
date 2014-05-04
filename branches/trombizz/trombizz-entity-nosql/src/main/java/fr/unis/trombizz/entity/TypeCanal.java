package fr.unis.trombizz.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class TypeCanal {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="libelle_abrege")
	private String libelleAbrege;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelleAbrege() {
		return libelleAbrege;
	}

	public void setLibelleAbrege(String libelleAbrege) {
		this.libelleAbrege = libelleAbrege;
	}

	
}
