package fr.unis.trombizz.shared.dto;

import java.io.Serializable;

/**
 *
 * @author cyril
 */
public class SimplePersonneDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String nom;
    private String prenom;
    private String photoName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

}
