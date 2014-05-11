package fr.unis.trombizz.bo;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICanal;
import fr.unis.trombizz.shared.bo.ITypeCanal;

public class Canal implements ICanal{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="type_canal_id")
	private TypeCanal typeCanal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TypeCanal getTypeCanal() {
		return typeCanal;
	}

	public void setTypeCanal(ITypeCanal typeCanal) {
		if(typeCanal instanceof TypeCanal)
			this.typeCanal = (TypeCanal) typeCanal;
	}
	
}
