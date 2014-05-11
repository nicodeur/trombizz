package fr.unis.trombizz.bo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.unis.trombizz.shared.bo.ITypeCanal;

public class TypeCanal implements ITypeCanal {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="libelle_abrege")
	private String libelleAbrege;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
