package fr.unis.trombizz.bo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.bo.IMission;
import fr.unis.trombizz.shared.bo.IOrdreMission;

@Entity
@Table(name="ordre_mission")
public class OrdreMission implements IOrdreMission {

	@EmbeddedId
	private OrdreMissionPK ordreMissionPk;
	

	public Collaborateur getPersonne() {
		return ordreMissionPk.getPersonne();
	}

	public void setPersonne(ICollaborateur personne) {
		if(personne instanceof Collaborateur)
			this.ordreMissionPk.setPersonne((Collaborateur) personne);
	}

	public Mission getMission() {
		return ordreMissionPk.getMission();
	}

	public void setMission(IMission mission) {
		if(mission instanceof Mission)
			this.ordreMissionPk.setMission((Mission) mission);
	}
}
