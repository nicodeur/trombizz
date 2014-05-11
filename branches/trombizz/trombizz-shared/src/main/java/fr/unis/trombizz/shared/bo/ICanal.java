package fr.unis.trombizz.shared.bo;


public interface ICanal extends Entite{

	public long getId();

	public void setId(long id);

	public ITypeCanal getTypeCanal();

	public void setTypeCanal(ITypeCanal typeCanal);
	
}
