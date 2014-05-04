package fr.unis.trombizz.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.unis.trombizz.shared.bo.IClient;
import fr.unis.trombizz.shared.bo.IMission;

@Entity(name="mission")
public class Mission implements IMission {
	@Id
	@Column(name="id")
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="client_id")
	private Client client;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(IClient client) {
		if(client instanceof Client)
			this.client = (Client) client;
	}
	
	
}
