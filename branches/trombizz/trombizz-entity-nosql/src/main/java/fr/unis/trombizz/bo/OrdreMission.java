package fr.unis.trombizz.bo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IMission;
import fr.unis.trombizz.shared.bo.IOrdreMission;

@Entity(name="ordre_mission")
public class OrdreMission implements IOrdreMission {
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personne_id")
	private Collaborateur personne;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mission_id")
	private Mission mission;

	public Collaborateur getPersonne() {
		return personne;
	}

	public void setPersonne(ICollaborateur personne) {
		if(personne instanceof Collaborateur)
			this.personne = (Collaborateur) personne;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(IMission mission) {
		if(mission instanceof Mission)
			this.mission = (Mission) mission;
	}
	
	
}
