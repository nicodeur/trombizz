package fr.unis.trombizz.shared.bo;


public interface IMission extends Entite {

	public long getId();

	public void setId(long id);

	public IClient getClient();

	public void setClient(IClient client);
}
