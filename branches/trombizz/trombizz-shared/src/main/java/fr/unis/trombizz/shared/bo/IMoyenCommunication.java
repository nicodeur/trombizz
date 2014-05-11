package fr.unis.trombizz.shared.bo;



public interface IMoyenCommunication extends Entite {

	public ICollaborateur getPersonne();

	public void setPersonne(ICollaborateur personne);	

	public ITypeCanal getTypeCanal();

	public void setTypeCanal(ITypeCanal typeCanal);
}
