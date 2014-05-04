package fr.unis.trombizz.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Canal {
	@Id
	@Column(name="id")
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="type_canal_id")
	private TypeCanal typeCanal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeCanal getTypeCanal() {
		return typeCanal;
	}

	public void setTypeCanal(TypeCanal typeCanal) {
		this.typeCanal = typeCanal;
	}
	
	
}
