package fr.unis.trombizz.dao;

import javax.persistence.EntityManager;

import fr.unis.trombizz.shared.bo.Entite;

public abstract class AbstractDao<E extends Entite, ID> {

	private EntityManager em = EMF.get().createEntityManager();
	
	private final Class<E> genericType;

	public AbstractDao(Class<E> genericType) {
	    this.genericType = genericType;
	}
	
	public E findById(ID id) {
		try {
			return em.find(genericType, id);
		} finally {
			em.close();
		}
	}
	
	public EntityManager getEntityManagr() {
		return em;
	}
}
