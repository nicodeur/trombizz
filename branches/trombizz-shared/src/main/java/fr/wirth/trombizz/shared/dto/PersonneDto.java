package fr.wirth.trombizz.shared.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cyril
 */
public class PersonneDto extends SimplePersonneDto implements Serializable {

    public PersonneDto(){
        
    }
    
    public PersonneDto(SimplePersonneDto dto){
        if(dto == null){
            return;
        }
        this.setId(dto.getId());
        this.setNom(dto.getNom());
        this.setPrenom(dto.getPrenom());
        this.setPhotoUrl(dto.getPhotoUrl());
    }
    
    private Date dateNaissance;

    private String telephone;

    private List<String> email;

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

}
