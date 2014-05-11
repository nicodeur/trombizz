package fr.unis.trombizz.bo;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IMission;

@Embeddable
public class OrdreMissionPK implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mission == null) ? 0 : mission.hashCode());
		result = prime * result
				+ ((personne == null) ? 0 : personne.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdreMissionPK other = (OrdreMissionPK) obj;
		if (mission == null) {
			if (other.mission != null)
				return false;
		} else if (mission.getId() != other.mission.getId())
			return false;
		if (personne == null) {
			if (other.personne != null)
				return false;
		} else if (personne.getId() != other.personne.getId())
			return false;
		return true;
	}
	
	
}
