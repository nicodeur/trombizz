package fr.unis.trombizz.shared.bo;

import java.util.Date;


public interface ICollaborateur extends Entite {
	
	public long getId();

	public void setId(long id);

	public String getNom();

	public void setNom(String nom);

	public String getPrenom();

	public void setPrenom(String prenom);

	public String getPhotoName();

	public void setPhotoName(String photoName);

	public Date getDateNaissance();

	public void setDateNaissance(Date dateNaissance);

	public String getEmail();

	public void setEmail(String email);

	public String getTelephone();

	public void setTelephone(String telephone);
	
}
