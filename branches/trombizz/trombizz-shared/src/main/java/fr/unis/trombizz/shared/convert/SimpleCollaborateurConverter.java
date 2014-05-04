package fr.unis.trombizz.shared.convert;

import fr.unis.trombizz.shared.bo.ICollaborateur;
import fr.unis.trombizz.shared.dto.SimplePersonneDto;

/**
 *
 * @author cyril
 */
public class SimpleCollaborateurConverter extends AbstractConverter<ICollaborateur, SimplePersonneDto>{

    public static final SimpleCollaborateurConverter INSTANCE = new SimpleCollaborateurConverter();
    
    private SimpleCollaborateurConverter(){
        
    }
    
    public SimplePersonneDto convert(ICollaborateur a) {
        if(a == null){
            return null;
        }
        SimplePersonneDto dto = new SimplePersonneDto();
        dto.setId(a.getId());
        dto.setNom(a.getNom());
        dto.setPrenom(a.getPrenom());
        dto.setPhotoName(a.getPhotoName());
        return dto;
    }

}
