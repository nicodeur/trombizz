package fr.unis.trombizz.shared.bo;

import java.util.Date;

public interface IConges extends Entite {

	public long getId();

	public void setId(long id);

	public Date getDebut();

	public void setDebut(Date debut);

	public Date getFin();

	public void setFin(Date fin);
	
	public ICollaborateur getPersonne();

	public void setPersonne(ICollaborateur personne);
	
	
}
