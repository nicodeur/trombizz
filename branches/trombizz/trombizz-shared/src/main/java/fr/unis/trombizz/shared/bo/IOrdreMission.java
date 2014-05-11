package fr.unis.trombizz.shared.bo;


public interface IOrdreMission extends Entite {
	
	public ICollaborateur getPersonne();

	public void setPersonne(ICollaborateur personne);

	public IMission getMission();

	public void setMission(IMission mission);
	
}
