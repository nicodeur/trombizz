package fr.unis.trombizz.shared.convert;

import fr.unis.trombizz.shared.bo.Collaborateur;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;

/**
 *
 * @author cyril
 */
public class SimpleCollaborateurConverter extends AbstractConverter<Collaborateur, SimplePersonneDto>{

    public static final SimpleCollaborateurConverter INSTANCE = new SimpleCollaborateurConverter();
    
    private SimpleCollaborateurConverter(){
        
    }
    
    public SimplePersonneDto convert(Collaborateur a) {
        if(a == null){
            return null;
        }
        SimplePersonneDto dto = new SimplePersonneDto();
        dto.setId(a.getId());
        dto.setNom(a.getNom());
        dto.setPrenom(a.getPrenom());
        dto.setPhotoUrl(a.getPhotoUrl());
        return dto;
    }

}