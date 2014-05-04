package fr.unis.trombizz.shared.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cyril
 */
public class PersonneDto extends SimplePersonneDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date dateNaissance;
	private String email;
	private String telephone;
	
    public PersonneDto(){
        
    }
    
    public PersonneDto(SimplePersonneDto dto){
        if(dto == null){
            return;
        }
        this.setId(dto.getId());
        this.setNom(dto.getNom());
        this.setPrenom(dto.getPrenom());
        this.setPhotoName(dto.getPhotoName());
    }

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

    
}
