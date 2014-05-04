package fr.unis.trombizz.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="ordre_mission")
public class OrdreMission {
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personne_id")
	private Personne personne;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mission_id")
	private Mission mission;

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}
	
	
}
